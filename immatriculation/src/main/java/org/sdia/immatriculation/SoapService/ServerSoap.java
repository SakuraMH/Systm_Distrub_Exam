package org.sdia.immatriculation.SoapService;

import jakarta.xml.ws.Endpoint;

public class ServerSoap {
    public static void main(String[] args) {
        // Endpoint est une classe de ws qui permer de demarer un petite serveur http. 0.0.0.0 permer a des application distante de consulté ce web service
        Endpoint.publish("http://0.0.0.0:8383/",new ImmatriculationServiceSoap());
        System.out.println("Web service deployé sur port 8383");

    }
}