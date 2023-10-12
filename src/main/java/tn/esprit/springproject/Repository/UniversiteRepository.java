package tn.esprit.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.Model.Foyer;
import tn.esprit.springproject.Model.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
