package se.lexicon.michelle.restappfirstlook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    //@RequestMapping(method = RequestMethod.GET, path = "/hello")
    @GetMapping("/hello") //this one and the one above is basically the same thing
    public String greetings(){

        return "<h2>Hello World Wide Web</h2>";
    }

    @GetMapping
    public ResponseEntity<Void> foo(){

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

}
