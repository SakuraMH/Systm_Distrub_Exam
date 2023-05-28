package org.sdia.immatriculation.GRPC_Service.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: immat.proto")
public final class ImmatriculationServiceGrpc {

  private ImmatriculationServiceGrpc() {}

  public static final String SERVICE_NAME = "ImmatriculationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire,
      org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire> getAffichageProMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "affichagePro",
      requestType = org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire.class,
      responseType = org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire,
      org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire> getAffichageProMethod() {
    io.grpc.MethodDescriptor<org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire, org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire> getAffichageProMethod;
    if ((getAffichageProMethod = ImmatriculationServiceGrpc.getAffichageProMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getAffichageProMethod = ImmatriculationServiceGrpc.getAffichageProMethod) == null) {
          ImmatriculationServiceGrpc.getAffichageProMethod = getAffichageProMethod = 
              io.grpc.MethodDescriptor.<org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire, org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "affichagePro"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("affichagePro"))
                  .build();
          }
        }
     }
     return getAffichageProMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule,
      org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule> getAffichageVehiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "affichageVehi",
      requestType = org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule.class,
      responseType = org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule,
      org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule> getAffichageVehiMethod() {
    io.grpc.MethodDescriptor<org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule, org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule> getAffichageVehiMethod;
    if ((getAffichageVehiMethod = ImmatriculationServiceGrpc.getAffichageVehiMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getAffichageVehiMethod = ImmatriculationServiceGrpc.getAffichageVehiMethod) == null) {
          ImmatriculationServiceGrpc.getAffichageVehiMethod = getAffichageVehiMethod = 
              io.grpc.MethodDescriptor.<org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule, org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "affichageVehi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("affichageVehi"))
                  .build();
          }
        }
     }
     return getAffichageVehiMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImmatriculationServiceStub newStub(io.grpc.Channel channel) {
    return new ImmatriculationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImmatriculationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImmatriculationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImmatriculationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImmatriculationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ImmatriculationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * déclarer les methodes
     * </pre>
     */
    public void affichagePro(org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire request,
        io.grpc.stub.StreamObserver<org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire> responseObserver) {
      asyncUnimplementedUnaryCall(getAffichageProMethod(), responseObserver);
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public void affichageVehi(org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule request,
        io.grpc.stub.StreamObserver<org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule> responseObserver) {
      asyncUnimplementedUnaryCall(getAffichageVehiMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAffichageProMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire,
                org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire>(
                  this, METHODID_AFFICHAGE_PRO)))
          .addMethod(
            getAffichageVehiMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule,
                org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule>(
                  this, METHODID_AFFICHAGE_VEHI)))
          .build();
    }
  }

  /**
   */
  public static final class ImmatriculationServiceStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceStub> {
    private ImmatriculationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * déclarer les methodes
     * </pre>
     */
    public void affichagePro(org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire request,
        io.grpc.stub.StreamObserver<org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAffichageProMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public void affichageVehi(org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule request,
        io.grpc.stub.StreamObserver<org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAffichageVehiMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ImmatriculationServiceBlockingStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceBlockingStub> {
    private ImmatriculationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * déclarer les methodes
     * </pre>
     */
    public org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire affichagePro(org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire request) {
      return blockingUnaryCall(
          getChannel(), getAffichageProMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule affichageVehi(org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule request) {
      return blockingUnaryCall(
          getChannel(), getAffichageVehiMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ImmatriculationServiceFutureStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceFutureStub> {
    private ImmatriculationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * déclarer les methodes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire> affichagePro(
        org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire request) {
      return futureUnaryCall(
          getChannel().newCall(getAffichageProMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule> affichageVehi(
        org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule request) {
      return futureUnaryCall(
          getChannel().newCall(getAffichageVehiMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AFFICHAGE_PRO = 0;
  private static final int METHODID_AFFICHAGE_VEHI = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImmatriculationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImmatriculationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AFFICHAGE_PRO:
          serviceImpl.affichagePro((org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire) request,
              (io.grpc.stub.StreamObserver<org.sdia.immatriculation.GRPC_Service.stubs.Immat.proprietaire>) responseObserver);
          break;
        case METHODID_AFFICHAGE_VEHI:
          serviceImpl.affichageVehi((org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule) request,
              (io.grpc.stub.StreamObserver<org.sdia.immatriculation.GRPC_Service.stubs.Immat.vehicule>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ImmatriculationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImmatriculationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.sdia.immatriculation.GRPC_Service.stubs.Immat.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImmatriculationService");
    }
  }

  private static final class ImmatriculationServiceFileDescriptorSupplier
      extends ImmatriculationServiceBaseDescriptorSupplier {
    ImmatriculationServiceFileDescriptorSupplier() {}
  }

  private static final class ImmatriculationServiceMethodDescriptorSupplier
      extends ImmatriculationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImmatriculationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImmatriculationServiceFileDescriptorSupplier())
              .addMethod(getAffichageProMethod())
              .addMethod(getAffichageVehiMethod())
              .build();
        }
      }
    }
    return result;
  }
}
