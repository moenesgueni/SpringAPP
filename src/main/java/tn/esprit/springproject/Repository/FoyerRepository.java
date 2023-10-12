package tn.esprit.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.Model.Foyer;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {
}
