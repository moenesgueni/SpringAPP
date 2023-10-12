package tn.esprit.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.Model.Etudiant;
import tn.esprit.springproject.Model.Foyer;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
