package springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    //Need a controller to show the initial HTML form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    //need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm(){
        return "Helloworld";
    }

    //New Controller method to read data from the form data and add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutLoud(HttpServletRequest request, Model model){

        //read the request parameter from the HTML from
         String theName = request.getParameter("studentName");

        //Convert data to UpperCase
        theName = theName.toUpperCase();

        //Create message
        String result = "Yo! " + theName;

        //Add message to the model
        model.addAttribute("message",result);

        return "Helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){

        //Convert data to UpperCase
        theName = theName.toUpperCase();

        //Create message
        String result = "Hey My Friend From v3.0 " + theName;

        //Add message to the model
        model.addAttribute("message",result);

        return "Helloworld";
    }
}
