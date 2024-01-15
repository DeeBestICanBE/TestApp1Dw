package com.example.springadv.model;


import org.springframework.stereotype.Component;

@Component
public class fancyWriter implements TextWriter {

    public String writeText(String s) {
        return s + " fancy text";
    }
}
