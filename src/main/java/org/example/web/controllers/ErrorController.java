package org.example.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping("/404")
    public String StringNotFoundError() {
        return "errors/404";
    }
}
