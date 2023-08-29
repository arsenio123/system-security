package com.system.credit.io;

public class ValidationRequest {
    String token;
    String uri;

    public String getToken() {
        return token;
    }

    public ValidationRequest setToken(String token) {
        this.token = token;
        return this;
    }

    public String getUri() {
        return uri;
    }

    public ValidationRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
}
