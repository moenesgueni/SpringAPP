package tn.esprit.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.Model.Foyer;
import tn.esprit.springproject.Model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
