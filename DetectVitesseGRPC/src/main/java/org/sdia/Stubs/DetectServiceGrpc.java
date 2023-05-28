package org.sdia.Stubs;

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
    comments = "Source: Detect.proto")
public final class DetectServiceGrpc {

  private DetectServiceGrpc() {}

  public static final String SERVICE_NAME = "DetectService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.sdia.Stubs.Detect.DetectVitesse,
      org.sdia.Stubs.Detect.Response> getEnvoyerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "envoyer",
      requestType = org.sdia.Stubs.Detect.DetectVitesse.class,
      responseType = org.sdia.Stubs.Detect.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.sdia.Stubs.Detect.DetectVitesse,
      org.sdia.Stubs.Detect.Response> getEnvoyerMethod() {
    io.grpc.MethodDescriptor<org.sdia.Stubs.Detect.DetectVitesse, org.sdia.Stubs.Detect.Response> getEnvoyerMethod;
    if ((getEnvoyerMethod = DetectServiceGrpc.getEnvoyerMethod) == null) {
      synchronized (DetectServiceGrpc.class) {
        if ((getEnvoyerMethod = DetectServiceGrpc.getEnvoyerMethod) == null) {
          DetectServiceGrpc.getEnvoyerMethod = getEnvoyerMethod = 
              io.grpc.MethodDescriptor.<org.sdia.Stubs.Detect.DetectVitesse, org.sdia.Stubs.Detect.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "DetectService", "envoyer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.Stubs.Detect.DetectVitesse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.Stubs.Detect.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new DetectServiceMethodDescriptorSupplier("envoyer"))
                  .build();
          }
        }
     }
     return getEnvoyerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DetectServiceStub newStub(io.grpc.Channel channel) {
    return new DetectServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DetectServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DetectServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DetectServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DetectServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DetectServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<org.sdia.Stubs.Detect.DetectVitesse> envoyer(
        io.grpc.stub.StreamObserver<org.sdia.Stubs.Detect.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getEnvoyerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnvoyerMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.sdia.Stubs.Detect.DetectVitesse,
                org.sdia.Stubs.Detect.Response>(
                  this, METHODID_ENVOYER)))
          .build();
    }
  }

  /**
   */
  public static final class DetectServiceStub extends io.grpc.stub.AbstractStub<DetectServiceStub> {
    private DetectServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DetectServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DetectServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DetectServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.sdia.Stubs.Detect.DetectVitesse> envoyer(
        io.grpc.stub.StreamObserver<org.sdia.Stubs.Detect.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getEnvoyerMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class DetectServiceBlockingStub extends io.grpc.stub.AbstractStub<DetectServiceBlockingStub> {
    private DetectServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DetectServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DetectServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DetectServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class DetectServiceFutureStub extends io.grpc.stub.AbstractStub<DetectServiceFutureStub> {
    private DetectServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DetectServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DetectServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DetectServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ENVOYER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DetectServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DetectServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENVOYER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.envoyer(
              (io.grpc.stub.StreamObserver<org.sdia.Stubs.Detect.Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DetectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DetectServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.sdia.Stubs.Detect.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DetectService");
    }
  }

  private static final class DetectServiceFileDescriptorSupplier
      extends DetectServiceBaseDescriptorSupplier {
    DetectServiceFileDescriptorSupplier() {}
  }

  private static final class DetectServiceMethodDescriptorSupplier
      extends DetectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DetectServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DetectServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DetectServiceFileDescriptorSupplier())
              .addMethod(getEnvoyerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
