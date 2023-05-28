package org.sdia.Radar.Entities;

import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Infraction {
    private Long idI;
    private Date date;
    private int vitesseMax;
    private Double vitessVehicul;
    private Double montantInfr;
    private Long radarID;
    private String vehiculMatr;
    private Long vehiculId;
    @Transient
    private Radar radar;
    @Transient
    private vehicule vehicule;
}
