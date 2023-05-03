package com.lea.server.utils;
import com.lea.server.enums.ErrorType;

public class ServerException extends Exception {

    private ErrorType errorType;

    public ServerException(ErrorType errorType) {
        this.errorType = errorType;
    }

    public ServerException(ErrorType errorType, String message) {
        super(message);
        this.errorType = errorType;
    }

    public ServerException(Exception e, ErrorType errorType, String message) {
        super(message, e);
        this.errorType = errorType;
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}