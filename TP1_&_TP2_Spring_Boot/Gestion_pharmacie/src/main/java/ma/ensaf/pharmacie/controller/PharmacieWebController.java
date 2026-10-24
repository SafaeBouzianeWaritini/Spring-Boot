package ma.ensaf.pharmacie.controller;

import ma.ensaf.pharmacie.repository.CategorieRepository;
import ma.ensaf.pharmacie.repository.FournisseurRepository;
import ma.ensaf.pharmacie.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PharmacieWebController {

    @Autowired
    private ProduitRepository produitRepository;

    @Autowired
    private CategorieRepository categorieRepository;

    @Autowired
    private FournisseurRepository fournisseurRepository;

    // Route pour afficher la liste des produits sur le web
    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("produits", produitRepository.findAll());
        model.addAttribute("categories", categorieRepository.findAll());
        model.addAttribute("fournisseurs", fournisseurRepository.findAll());
        return "index"; // Fait référence à index.html dans templates
    }
}