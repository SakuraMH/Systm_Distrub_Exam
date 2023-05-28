package org.sdia.immatriculation.GRPC_Service.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.sdia.immatriculation.GRPC_Service.service.ImmatGrpcService;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server= ServerBuilder.forPort(7777)
                .addService(new ImmatGrpcService())
                .build();
        server.start();
        server.awaitTermination();
    }


}