package cat.itacademy.s04.t01.n01.S04T01N01.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/HelloWorld")
public class HelloWorldController {

    @GetMapping
    public String toSayHello(@RequestParam(defaultValue = "UNKNOWN") String name){
        return "Hola, "+ name + ". Ejecutando un proyecto de SpringBoot con Maven usando RequestParam";
    }

    @GetMapping("/{name}")
    public String toSayHello2(@PathVariable("name") String name){
        return "Hola, " + name + ". Estás ejecutando un proyecto de SpringBoot con Maven usando PathVariable";
    }
}
