package org.sdia.immatriculation.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idv;
    private String mat;
    private String Marque;
    private Integer puissanceFiscal;
    private String Modele;
    private Long idProprietaire;
    @Transient private Proprietaire proprietaire ;


}
