package ma.ensaf.client;

import ma.ensaf.model.Client;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {

    // Affichage du formulaire d'inscription du client
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Récupération des données du formulaire via @ModelAttribute
    @PostMapping("/addClient")
    public String addClient(@ModelAttribute("c1") Client c) {
        return "result";
    }
}
