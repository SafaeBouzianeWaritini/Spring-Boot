package ma.ensaf.person.controller;

import ma.ensaf.person.dao.AdresseRepository;
import ma.ensaf.person.dao.PersonneRepository;
import ma.ensaf.person.model.Adresse;
import ma.ensaf.person.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personnes")
public class PersonneRestController {

    @Autowired
    private PersonneRepository personneRepository;

    @Autowired
    private AdresseRepository adresseRepository;

    @GetMapping
    public List<Personne> getAll() {
        return personneRepository.findAll();
    }

    @GetMapping("/{id}")
    public Personne getOne(@PathVariable Long id) {
        return personneRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Personne create(@RequestBody Personne personne) {
        if (personne.getAdresses() != null) {
            List<Adresse> adresses = personne.getAdresses();
            for (int k = 0; k < adresses.size(); k++) {
                Adresse a = adresses.get(k);
                if (a.getId() != null) {
                    Adresse adrExistante = adresseRepository.findById(a.getId()).orElse(null);
                    adresses.set(k, adrExistante);
                } else {
                    Adresse adrSauvegardee = adresseRepository.save(a);
                    adresses.set(k, adrSauvegardee);
                }
            }
        }
        return personneRepository.save(personne);
    }

    @PutMapping("/{id}")
    public Personne update(@PathVariable Long id, @RequestBody Personne nouvellePersonne) {
        return personneRepository.findById(id).map(p -> {
            p.setNom(nouvellePersonne.getNom());
            p.setPrenom(nouvellePersonne.getPrenom());
            return personneRepository.save(p);
        }).orElseGet(() -> {
            nouvellePersonne.setNum(id);
            return personneRepository.save(nouvellePersonne);
        });
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        personneRepository.deleteById(id);
    }
}