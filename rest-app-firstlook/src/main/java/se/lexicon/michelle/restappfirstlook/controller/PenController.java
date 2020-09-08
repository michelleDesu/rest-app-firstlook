package se.lexicon.michelle.restappfirstlook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import se.lexicon.michelle.restappfirstlook.model.Pen;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class PenController {

    List<Pen> pens = Arrays.asList(
            new Pen(100, "ballpen", "jfwoi2fd", "PARKER"),
            new Pen(101, "Whiteboard pen", "jffsai2fd", "PILOT"),
            new Pen(102, "ballpen", "jfwoi2fd", "PARKER")
    );

   /* @GetMapping("/pen")
    public Pen getPen(){

        return new Pen(100, "ballpen", "jfwoi2fd", "PARKER");
    }*/

    @GetMapping("/pen")
    public ResponseEntity<Pen> getPenResource(){
        Pen pen = new Pen(100, "ballpen", "jfwoi2fd", "PARKER");
        return ResponseEntity.status(HttpStatus.OK).body(pen);
    }

    @GetMapping("/pens")
    public  ResponseEntity<List<Pen>> getPens(){
        return ResponseEntity.ok(pens);
    }

    @GetMapping("/pen/{id}")
    public ResponseEntity<Pen> getPenById(@PathVariable("id") int id){
        Optional<Pen> optionalPen = Optional.empty();
        for (Pen p :pens){
            if(p.getId() == id){
               optionalPen=  Optional.ofNullable(p);
            }
        }
        return optionalPen.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


}
