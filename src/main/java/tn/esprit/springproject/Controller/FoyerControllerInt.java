package tn.esprit.springproject.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Model.Foyer;

import java.util.List;
import java.util.Map;

@RequestMapping("/api/foyer")
public interface FoyerControllerInt {
    @GetMapping("/getAll")
    public ResponseEntity<List<Foyer>> retrieveAllFoyers();
    @PutMapping("/add")
    public ResponseEntity<String> addFoyer(@RequestBody(required = true) Map<String,String> requestMap);
    @PutMapping("/update")
    public ResponseEntity<String> updateFoyer(@RequestBody(required = true) Map<String,String> requestMap);
    @GetMapping("/getById")
    public ResponseEntity<Foyer>  retrieveFoyer(@RequestParam(required = true) Map<String,String> requestMap);
    @DeleteMapping("/delete")
    public ResponseEntity<String> removeFoyer(@RequestParam(required = true) Map<String,String> requestMap);
}
