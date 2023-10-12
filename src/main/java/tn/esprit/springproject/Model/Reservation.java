package tn.esprit.springproject.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Reservation {
    @Id
    @GeneratedValue
    private String idReservation;
    private Date anneeUniversitaire;
    private Boolean estValide;
    @ManyToOne
    @JoinColumn(name = "chambre_id")
    private Chambre chambre;

    @ManyToMany(mappedBy = "reservations")
    private List<Etudiant> etudiants;
}
