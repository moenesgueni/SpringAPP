package tn.esprit.springproject.Service;

import tn.esprit.springproject.Model.Etudiant;

import java.util.List;

public interface EtudiantServiceInt {
List<Etudiant> retrieveAllEtudiants();
List<Etudiant> addEtudiants (List<Etudiant> etudiants);
Etudiant updateEtudiant (Etudiant e);
Etudiant retrieveEtudiant(long idEtudiant);

    void removeEtudiant(long idEtudiant);


}
