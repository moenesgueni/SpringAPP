package tn.esprit.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.Model.Chambre;
import tn.esprit.springproject.Model.Foyer;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
