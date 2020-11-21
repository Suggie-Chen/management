package hw4.management.controller;

import entities.User;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class addressBookController {
    @PostMapping("/addressBook")
    String post(String username,String password,HttpSession session) throws IOException {
        System.out.println(username);
        System.out.println(password);
//        PrintWriter writer=response.getWriter();
        if (username.equals("admin") && password.equals("123456")) {
//            writer.println("Success!");
//            HttpSession session=request.getSession();
            session.setAttribute("login", "true!");//若用户名和密码都正确，则将会话的login置为login successfully!
            System.out.println(session.getAttribute("login"));
            return "addressBook";
        } else {
//            writer.println("invalid login!");
            session.setAttribute("login", "false!");
            System.out.println(session.getAttribute("login"));
            return "redirect:/login";

        }
    }
//    String post(User user, HttpSession session) throws IOException {
//        System.out.println(user.getName());
//        System.out.println(user.getPwd());
//        String name=user.getName();
//        String pwd=user.getPwd();
////        PrintWriter writer=response.getWriter();
//        if(name.equals("admin")&&pwd.equals("123456"))
//        {
////            writer.println("Success!");
////            HttpSession session=request.getSession();
//            session.setAttribute("login","true!");//若用户名和密码都正确，则将会话的login置为login successfully!
//            System.out.println(session.getAttribute("login"));
//            return "addressBook";
//        }
//        else
//        {
////            writer.println("invalid login!");
//            session.setAttribute("login","false!");
//            System.out.println(session.getAttribute("login"));
//            return "redirect:/login";
//
//        }
//
//    }

    @GetMapping("/addressBook")
    String get(){
        return "login";
    }
}
