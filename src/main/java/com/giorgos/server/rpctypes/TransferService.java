package com.giorgos.server.rpctypes;

import com.giorgos.models.TransferRequest;
import com.giorgos.models.TransferResponse;
import com.giorgos.models.TransferServiceGrpc;
import io.grpc.stub.StreamObserver;

public class TransferService extends TransferServiceGrpc.TransferServiceImplBase {

    @Override
    public StreamObserver<TransferRequest> transfer(StreamObserver<TransferResponse> responseObserver) {
        return new TransferStreamingRequest(responseObserver);
    }
}
