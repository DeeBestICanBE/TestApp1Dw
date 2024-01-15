package com.example.springadv.controller;

import com.example.springadv.model.TextWriter;
import com.example.springadv.model.fancyWriter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {
    TextWriter text;
    public TextController() {
        text =  new fancyWriter();
    }



    @RequestMapping("/")
    public String index(){
return text.writeText("hi");
    }
}
