package com.system.credit.io;

import org.springframework.http.HttpStatus;

public class ValidationResponse {
    String message;
    HttpStatus status;

    public String getMessage() {
        return message;
    }

    public ValidationResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public ValidationResponse setStatus(HttpStatus status) {
        this.status = status;
        return this;
    }
}
