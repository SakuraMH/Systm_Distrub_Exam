package org.sdia.Radar.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class proprietaire {
    private Long idP;
    private String nom;
    private Date dateNaissance;

}
