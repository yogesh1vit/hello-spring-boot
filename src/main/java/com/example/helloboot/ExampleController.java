package com.example.helloboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExampleController {
    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }
}
