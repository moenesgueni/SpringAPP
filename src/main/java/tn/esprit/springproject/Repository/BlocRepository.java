package tn.esprit.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.Model.Bloc;


public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
