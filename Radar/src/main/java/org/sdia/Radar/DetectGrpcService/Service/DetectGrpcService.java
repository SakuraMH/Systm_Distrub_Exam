package org.sdia.Radar.DetectGrpcService.Service;

import io.grpc.stub.StreamObserver;
import org.sdia.Radar.DetectGrpcService.Stubs.Detect;
import org.sdia.Radar.DetectGrpcService.Stubs.DetectServiceGrpc;
import org.sdia.Radar.Service.ImmatriculationServiceClient;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class DetectGrpcService extends DetectServiceGrpc.DetectServiceImplBase{

    private ImmatriculationServiceClient immatriculationServiceClient;
    private RestTemplate restTemplate;
    public DetectGrpcService() {
        this.restTemplate = new RestTemplate();
    }
    @Override
    public StreamObserver<Detect.DetectVitesse> envoyer (StreamObserver <Detect.Response> response) {
        return new StreamObserver<Detect.DetectVitesse>() {
            @Override
            public void onNext(Detect.DetectVitesse Request) {
                // Extraire les données de l'objet Request
                String vehiculeMatriculation = Request.getVehiculeMatriculation();
                //Double idRadar = Request.getIdRadar();
                Long idRadar=Double.valueOf(Request.getIdRadar()).longValue();
                Double vehiculeVitesse = Request.getVehiculeVitesse();

                // Préparer les données pour l'API REST
                RestData restData = new RestData(vehiculeMatriculation, vehiculeVitesse,idRadar);

                // Envoyer les données à l'API REST
                String apiUrl = "http://localhost:8081/api/data"; // URL de votre API REST
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                HttpEntity<RestData> requestEntity = new HttpEntity<>(restData, headers);
                ResponseEntity<Void> responseEntity = restTemplate.exchange(apiUrl, HttpMethod.POST, requestEntity, Void.class);


                // Envoyer la réponse gRPC
                Detect.Response response1 = Detect.Response.newBuilder().setResponse(1).build();
                response.onNext(response1);





                //proprietaire proprietaire = radarRestController.findPropietaireById(vehicule.getIdProprietaire());
                response.onNext(response1);

            }
            @Override
            public void onError(Throwable throwable) {
            }

            @Override
            public void onCompleted() {
                response.onCompleted();
            }
        };}



    }


