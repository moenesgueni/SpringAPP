package tn.esprit.springproject.Service;

import tn.esprit.springproject.Model.Chambre;

import java.util.List;

public interface ChambreServiceInt {


    List<Chambre> retrieveAllChambres();

    Chambre  addChambre(Chambre c); // ajouter l’équipe avec son détail

    Chambre updateChambre (Chambre  c);

    Chambre retrieveChambre (long idChambre);

}
