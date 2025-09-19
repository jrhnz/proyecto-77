package com.example.herokudemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("nombre", "Juan Pablo Reynoso Hernandez");
        model.addAttribute("carnet", "24001819");
        return "index";
    }
}
