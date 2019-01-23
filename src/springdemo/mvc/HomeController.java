package springdemo.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String showPage(ModelMap model){
        model.addAttribute("message1","Hello Spring MVC Framework");
        return "Home";
    }
}
