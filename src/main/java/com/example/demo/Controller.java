package com.example.demo;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/") 
public class Controller{
    
        @GetMapping(path="/") 
        public String inicio(){
            return "SL71728136 - Andy Noe Hinostroza Anguiz";
        }
        @GetMapping(path="/idat/codigo") 
        public String codigocom(){
            return "SL71728136";
        }
        @GetMapping(path="/idat/nombre-completo") 
        public String nombrecom(){
            return "Andy Noe Hinostroza Anguiz";
        }

}