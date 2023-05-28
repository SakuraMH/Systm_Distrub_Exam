package org.sdia;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.sdia.Stubs.Detect;
import org.sdia.Stubs.DetectServiceGrpc;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 4444)
                .usePlaintext()
                .build();
        DetectServiceGrpc.DetectServiceStub asynStub = DetectServiceGrpc.newStub(managedChannel);
        StreamObserver<Detect.DetectVitesse> performStream = asynStub.envoyer(new StreamObserver<Detect.Response>() {
            @Override
            public void onNext(Detect.Response response) {
                System.out.println(response);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                System.out.println("END---");
            }
        });

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("Matricule de voiture:");
            String Matr = sc.nextLine();
            System.out.println("Vitesse de voiture");
            double Vitess = sc.nextDouble();
            System.out.println("Id de radar");
            double id = sc.nextDouble();

            Detect.DetectVitesse request = Detect.DetectVitesse.newBuilder()
                    .setVehiculeMatriculation(Matr)
                    .setVehiculeVitesse(Vitess)
                    .setIdRadar(id)
                    .build();
            performStream.onNext(request);

        }
    }
}
