package org.sdia.immatriculation.GRPC_Service.service;

import io.grpc.stub.StreamObserver;
import org.sdia.immatriculation.GRPC_Service.stubs.Immat;
import org.sdia.immatriculation.GRPC_Service.stubs.ImmatriculationServiceGrpc;

public class ImmatGrpcService extends ImmatriculationServiceGrpc.ImmatriculationServiceImplBase{
    @Override
    public void affichagePro(Immat.proprietaire proprietaire, StreamObserver<Immat.proprietaire> responseProprietaire){
        double idp=proprietaire.getIdp();
        String nom=proprietaire.getNom();
        String DateNaiss=proprietaire.getDateNaissance();
        Immat.proprietaire proprietaire1=Immat.proprietaire.newBuilder()
                .setIdp(idp)
                .setNom(nom)
                .setDateNaissance(DateNaiss)
                .build();
        responseProprietaire.onNext(proprietaire1);
        responseProprietaire.onCompleted();
    }
    @Override
    public void affichageVehi(Immat.vehicule vehicule, StreamObserver<Immat.vehicule> responseVehicul){
        double idv=vehicule.getIdv();
        String numMatricule=vehicule.getNumMatricule();
        String marque=vehicule.getMarque();
        int puissanceFiscal=vehicule.getPuissanceFiscal();
        String modele=vehicule.getModele();
        Immat.proprietaire proprietaire=vehicule.getIdProprietaire();
        Immat.vehicule vehicule1=Immat.vehicule.newBuilder()
                .setIdv(idv)
                .setNumMatricule(numMatricule)
                .setMarque(marque)
                .setPuissanceFiscal(puissanceFiscal)
                .setModele(modele)
                .setIdProprietaire(proprietaire)
                .build();
        responseVehicul.onNext(vehicule1);
        responseVehicul.onCompleted();
    }


}
