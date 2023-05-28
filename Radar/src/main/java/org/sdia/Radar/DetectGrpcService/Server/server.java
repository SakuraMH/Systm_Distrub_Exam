package org.sdia.Radar.DetectGrpcService.Server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.sdia.Radar.DetectGrpcService.Service.DetectGrpcService;
import org.sdia.Radar.Entities.DetectVitess;

import java.io.IOException;

public class server {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server= ServerBuilder.forPort(4444)
                .addService(new DetectGrpcService())
                .build();
        server.start();
        server.awaitTermination();


    }
}
