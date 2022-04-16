package com.example.spring4shelldemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greeting")
public class DemoController {

    @GetMapping
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "hello";
    }

    @PostMapping
    public String index(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "hello";
    }
}
