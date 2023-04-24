package it.develhope.Swagger1.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class NameController {
    @GetMapping("/name/{name}")
    public String getName(@PathVariable String name){
        return "Hi, you name is: " + name;
    }
}
