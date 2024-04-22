package org.malagueta.fintech.exception;

public class SerciceException extends RuntimeException{
    public SerciceException(ServiceCatalogMessages messages){
        super(messages.toString());
    }
}
