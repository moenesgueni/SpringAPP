package tn.esprit.springproject.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.springproject.Model.Foyer;
import tn.esprit.springproject.Service.FoyerService;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class FoyerController implements FoyerControllerInt {
    public final FoyerService foyerService;
    @Override
    public ResponseEntity<List<Foyer>> retrieveAllFoyers() {
        List foyers = foyerService.retrieveAllFoyers();
        return new ResponseEntity<>(foyers, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> addFoyer(Map<String, String> requestMap) {
        return null;
    }

    @Override
    public ResponseEntity<String> updateFoyer(Map<String, String> requestMap) {
        return null;
    }

    @Override
    public ResponseEntity<Foyer> retrieveFoyer(Map<String, String> requestMap) {
        return null;
    }

    @Override
    public ResponseEntity<String> removeFoyer(Map<String, String> requestMap) {
        return null;
    }
}
