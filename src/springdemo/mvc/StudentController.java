package springdemo.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model) {

        //Create Student Object
        Student theStudent = new Student();

        //Add Student object to the model
        model.addAttribute("student",theStudent);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {

        //Log the input data
        System.out.println("TheStudent: "+theStudent.getFirstName()+" "+theStudent.getLastName());
        System.out.println("Student Country: "+theStudent.getCountry());
        System.out.println("favoriteLanguageOption: "+theStudent.getFavoriteLanguage());
        System.out.println("Operating System: "+theStudent.getOperatingSystem());
        return "student-confirmation";
    }
}
