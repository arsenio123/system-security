package org.malagueta.fintech.domain.service.factory;

import org.malagueta.fintech.domain.service.UserServiceDomain;
import org.malagueta.fintech.domain.service.impl.UserServiceDomainImpl;

public class UserServiceDomainFactory {
    public static UserServiceDomain getService(String service) {

        switch (service) {
            case "one":
                return new UserServiceDomainImpl();
            case "":
                return new UserServiceDomainImpl();
            default:
                new UserServiceDomainImpl();

        }
        return new UserServiceDomainImpl();

    }
}
