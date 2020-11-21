package hw4.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class addController {
    @GetMapping("/add")
    String add()
    {
        return "add";
    }
}
