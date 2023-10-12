package tn.esprit.springproject.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Foyer {
    @Id
    @GeneratedValue
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;

    @OneToOne // Liaison avec le champ "universite" dans l'entité Foyer
    @JoinColumn(name = "universite_id")
    private Universite universite;

    @OneToMany(mappedBy = "foyer")
    private List<Bloc> blocList;
}
