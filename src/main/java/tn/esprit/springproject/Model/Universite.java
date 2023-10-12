package tn.esprit.springproject.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Universite {
    @Id
    @GeneratedValue
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;
    @OneToOne(mappedBy = "universite") // Liaison avec le champ "universite" dans l'entité Foyer

    private Foyer foyer;
}
