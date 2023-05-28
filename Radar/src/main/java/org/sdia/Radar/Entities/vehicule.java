package org.sdia.Radar.Entities;

import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class vehicule {
    private Long idv;
    private String mat;
    private String Marque;
    private Integer puissanceFiscal;
    private String Modele;
    private Long idProprietaire;
    @Transient
    private proprietaire proprietaire ;
}
