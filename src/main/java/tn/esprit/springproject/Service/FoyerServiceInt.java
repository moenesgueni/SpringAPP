package tn.esprit.springproject.Service;

import tn.esprit.springproject.Model.Foyer;

import java.util.List;

public interface FoyerServiceInt {
    List<Foyer> retrieveAllFoyers();

    Foyer addFoyer (Foyer f);

    Foyer updateFoyer (Foyer f);

    Foyer retrieveFoyer (Long  idFoyer);

    void removeFoyer (Long idFoyer);

}
