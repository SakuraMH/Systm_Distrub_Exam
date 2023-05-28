package org.sdia.Infractions.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Infraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idI;
    private Date date;
    private int vitesseMax;
    private int vitessVehicul;
    private Double montantInfr;
    private Long radarID;
    private String vehiculMatr;
    private Long vehiculId;
    @Transient
    private Radar radar;
    @Transient
    private Vehicule vehicule;

}
