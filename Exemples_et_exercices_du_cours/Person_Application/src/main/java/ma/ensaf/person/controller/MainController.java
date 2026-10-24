package ma.ensaf.person.controller;

import ma.ensaf.person.dao.PersonneRepository;
import ma.ensaf.person.dao.AdresseRepository;
import ma.ensaf.person.model.Personne;
import ma.ensaf.person.model.Adresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private PersonneRepository personneRepository;
    
    @Autowired
    private AdresseRepository adresseRepository;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping({"/", "/home"})
    public String home(Model model) {
        model.addAttribute("message", "Bienvenue sur l'application Gestion des Personnes");
        model.addAttribute("personnes", personneRepository.findAll());
        return "home";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("personnes", personneRepository.findAll());
        return "admin";
    }

    @GetMapping("/addPerson")
    public String addPersonForm(Model model) {
        Personne personne = new Personne();
        // On initialise une liste avec une adresse vide pour l'afficher dans le formulaire
        personne.getAdresses().add(new Adresse());
        model.addAttribute("personne", personne);
        return "addPerson";
    }


    @PostMapping("/addPerson")
    public String savePersonne(@ModelAttribute Personne personne, Model model) {
        // Sauvegarde préalable de l'adresse saisie pour éviter l'erreur "transient instance"
        if (personne.getAdresses() != null) {
            List<Adresse> adressesValides = new ArrayList<>();
            for (Adresse a : personne.getAdresses()) {
                if (a.getRue() != null && !a.getRue().trim().isEmpty()) {
                    Adresse savedAdr = adresseRepository.save(a);
                    adressesValides.add(savedAdr);
                }
            }
            personne.setAdresses(adressesValides);
        }

        personneRepository.save(personne);
        model.addAttribute("nom", personne.getNom());
        model.addAttribute("prenom", personne.getPrenom());
        return "confirm";
    }



    @GetMapping("/showAllByPage/{i}/{j}")
    public String showAllByPage(@PathVariable int i, @PathVariable int j, Model model) {
        Page<Personne> page = personneRepository.findAll(PageRequest.of(i, j));
        model.addAttribute("personnes", page.getContent());
        return "home";
    }

    @GetMapping("/showAllSorted/{v}")
    public String showAllSorted(@PathVariable String v, Model model) {
        model.addAttribute("personnes", personneRepository.findAll(Sort.by(v)));
        return "home";
    }
}
