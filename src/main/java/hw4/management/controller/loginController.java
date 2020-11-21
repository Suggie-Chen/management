package hw4.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

//@Controller
//@RequestMapping("/login")
//public class loginController {
//    public String login(Model model) {
//        return "login";
//    }
//}

@Controller
@RequestMapping("/")
public class loginController {

   @GetMapping({"/","/login"})
    String getIndex(Model model) {

        model.addAttribute("today", Calendar.getInstance());

        return "login";
    }
}

