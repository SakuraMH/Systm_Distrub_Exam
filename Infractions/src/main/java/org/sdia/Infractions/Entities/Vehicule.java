package org.sdia.Infractions.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicule {
    private Long id;
    private String numMatricule;
    private String Marque;
    private Integer puissanceFiscal;
    private String Modele;
    private Long idProprietaire;
    @Transient private Proprietaire proprietaire ;

}
