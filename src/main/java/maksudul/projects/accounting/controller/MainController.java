package maksudul.projects.accounting.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @GetMapping("/")
    public String homePage(){
        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(){
        return "login";
    }

    @RequestMapping("/loggedout")
    public String showLoggedOut() {
        return "loggedout";
    }

    @RequestMapping("/registerUser")
    public String showRegistration(){
        return "registerUser";
    }

    @RequestMapping("/createsemester")
    public String showBatchSemesterInfo() {
        return "createsemester";
    }

    @RequestMapping("/createbatches")
    public String showAppraisalForm(){
        return "createbatches";
    }
}
