package ma.ensaf.pharmacie.controller;

import ma.ensaf.pharmacie.model.Fournisseur;
import ma.ensaf.pharmacie.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fournisseurs")
public class FournisseurRestController {

    @Autowired
    private FournisseurRepository fournisseurRepository;

    @GetMapping
    public List<Fournisseur> getAllFournisseurs() {
        return fournisseurRepository.findAll();
    }

    @PostMapping
    public Fournisseur createFournisseur(@RequestBody Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }
}
