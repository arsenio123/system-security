package com.system.credit.io;

public enum Status {
    AUTORIZED(0,"AUTORIZED"),
    NOT_AUTORIZED(2,"NOT_AUTORIZED")
    ,NOT_AUTHENTICATED(2,"NOT_AUTHENTICATED");

    private final int value;
    private final String message;

    Status(final int value, final String message ) {
    this.value=value;
    this.message=message;
    }


}
