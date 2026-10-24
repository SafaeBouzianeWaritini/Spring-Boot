package ma.ensaf.personne.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.data.domain.Sort;

import ma.ensaf.personne.dao.PersonneRepository;
import ma.ensaf.personne.model.Personne;

@Controller
public class PersonneController {

    @Autowired
    private PersonneRepository personneRepository;

    // Afficher le formulaire d'ajout (GET)
    @GetMapping(value = "/addPerson")
    public String addPerson() {
        return "addPerson";
    }

    // Traiter l'enregistrement de la personne dans MySQL (POST)
    @PostMapping(value = "/addPerson")
    public ModelAndView addPerson(@RequestParam(value = "nom") String nom, 
                                  @RequestParam(value = "prenom") String prenom) {
        Personne personne = new Personne(nom, prenom);
        personneRepository.save(personne); // Sauvegarde automatique en BD via JPA

        ModelAndView mv = new ModelAndView();
        mv.setViewName("confirm");
        mv.addObject("nom", nom);
        mv.addObject("prenom", prenom);
        return mv;
    }

    // Afficher la liste de toutes les personnes (GET)
    @GetMapping(value = "/showAll")
    public ModelAndView showAll() {
        List<Personne> personnes = personneRepository.findAll(); // Récupération depuis MySQL
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        mv.addObject("personnes", personnes);
        return mv;
    }
    
    @GetMapping(value = "/showAllByPage/{i}/{j}")
    public ModelAndView showAllByPage(@PathVariable int i, @PathVariable int j) {
        Page<Personne> personnes = personneRepository.findAll(PageRequest.of(i, j));
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result"); // Réutilise la même vue result.jsp
        mv.addObject("personnes", personnes.getContent());
        return mv;
    }
    
    @GetMapping(value = "/showAllSorted/{v}")
    public ModelAndView showAllSorted(@PathVariable String v) {
        List<Personne> personnes = personneRepository.findAll(Sort.by(v));
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        mv.addObject("personnes", personnes);
        return mv;
    }
    
    @GetMapping(value = "/findByNom")
    public ModelAndView findByNom(@RequestParam(value = "nom") String nom) {
        List<Personne> personnes = personneRepository.findByNom(nom);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        mv.addObject("personnes", personnes);
        return mv;
    }
    
    @GetMapping(value = "/chercherSelonLePrenom")
    public ModelAndView chercherSelonLePrenom(@RequestParam(value = "prenom") String prenom) {
        List<Personne> personnes = personneRepository.chercherSelonLePrenom(prenom);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        mv.addObject("personnes", personnes);
        return mv;
    }
}
