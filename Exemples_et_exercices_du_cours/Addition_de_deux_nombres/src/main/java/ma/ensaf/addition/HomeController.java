package ma.ensaf.addition;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    // Route pour afficher la page d'accueil (index.jsp)
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Route pour traiter l'addition des deux nombres
    @GetMapping("/add")
    public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result"); // Spécifie la vue result.jsp
        
        int num3 = i + j;         // Calcul de la somme
        mv.addObject("num3", num3); // Transmission de la variable à la vue
        
        return mv;
    }
}
