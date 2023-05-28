package org.sdia.Radar.DetectGrpcService.Service;

public class RestData {
    private String vehiculeMatriculation;
    private Double vehiculeVitesse;
    private Long idRadar;

    public RestData(String vehiculeMatriculation, Double vehiculeVitesse, Long idRadar) {
        this.idRadar = idRadar;
        this.vehiculeVitesse = vehiculeVitesse;
        this.vehiculeMatriculation = vehiculeMatriculation;
    }

    public String getVehiculeMatriculation() {
        return vehiculeMatriculation;
    }

    public void setVehiculeMatriculation(String vehiculeMatriculation) {
        this.vehiculeMatriculation = vehiculeMatriculation;
    }

    public Double getVehiculeVitesse() {
        return vehiculeVitesse;
    }

    public void setVehiculeVitesse(Double vehiculeVitesse) {
        this.vehiculeVitesse = vehiculeVitesse;
    }

    public Long getIdRadar() {
        return idRadar;
    }

    public void setIdRadar(Long idRadar) {
        this.idRadar = idRadar;
    }
}
