package com.system.credit.io;

public enum Status {
    AUTORIZED(200,"AUTORIZED"),
    NOT_AUTORIZED(401,"NOT_AUTORIZED")
    ,NOT_AUTHENTICATED(2,"NOT_AUTHENTICATED");

    private final int value;
    private final String message;

    Status(final int value, final String message ) {
    this.value=value;
    this.message=message;
    }


}
