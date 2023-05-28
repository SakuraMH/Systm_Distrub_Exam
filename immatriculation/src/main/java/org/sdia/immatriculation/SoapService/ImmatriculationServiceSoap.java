package org.sdia.immatriculation.SoapService;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.sdia.immatriculation.Entities.Proprietaire;
import org.sdia.immatriculation.Entities.Vehicule;

import java.util.Date;
import java.util.List;

@WebService(serviceName="ImmatriculationWS")
public class ImmatriculationServiceSoap {
    @WebMethod(operationName="AfficheProprietaire")
    public Proprietaire getProprietaire(@WebParam(name="idp")  Long idp){
        return new Proprietaire(idp,"Mahfoud",new Date(),"Sanaa.mahfoud88@gmail.com");
    }
    @WebMethod
    public List<Proprietaire> listProprietaire(){
        return List.of(new Proprietaire(Long.parseLong("1"),"Mahfoud",new Date(),"Sanaa.mahfoud88@gmail.com"),
                new Proprietaire(Long.parseLong("2"),"Maftouh",new Date(),"Oumaima.maftouh12@gmail.com"),
                new Proprietaire(Long.parseLong("3"),"Sanim",new Date(),"Meryem.sanim10@gmail.com")

        );
    }
    @WebMethod(operationName="AfficheVehicule")
    public Vehicule getVehicule(@WebParam(name="vehicule")  Vehicule vehicule){
        return vehicule;
    }
    @WebMethod
    public List<Vehicule> listVehicule(){
        return List.of(new Vehicule(Long.parseLong("1"),"Mat36536366","Mercedes",585,"AMG GT",Long.parseLong("1"),null),
                new Vehicule(Long.parseLong("2"),"Mat36539864","BMW",231,"I8",Long.parseLong("2"),null),
                new Vehicule(Long.parseLong("3"),"Mat36577664","Ferrari",570,"458",Long.parseLong("3"),null)
                );
    }
}
