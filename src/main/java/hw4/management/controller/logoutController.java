package hw4.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class logoutController {
    @GetMapping("/logout")
    String logout(HttpSession session, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        if(session.getAttribute("login")==null)
        {
            writer.println("please login first.");
            System.out.println("please login first.");
            return "redirect:/login";
        }
        else
        {
            session.removeAttribute("login");
            System.out.println("logout successfully!");
            writer.println("logout successfully!");
            writer.print("<script language=\"javascript\">alert('登出成功！')；window.location.href='/login'</script>");
            return "logout";
        }

//        return "redirect:/login";
    }
}
