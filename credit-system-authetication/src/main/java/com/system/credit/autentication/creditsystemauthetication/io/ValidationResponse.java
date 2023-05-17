package com.system.credit.autentication.creditsystemauthetication.io;

public class ValidationResponse {
    String message;
    Status status;

    public String getMessage() {
        return message;
    }

    public ValidationResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public ValidationResponse setStatus(Status status) {
        this.status = status;
        return this;
    }
}
