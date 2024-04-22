package org.malagueta.fintech.domain.service.factory;

import org.malagueta.fintech.domain.service.AuthorityServiceDomain;
import org.malagueta.fintech.domain.service.impl.AuthorityServiceDomainImpl;

public class AuthorityServiceDomainFactory {

    public static AuthorityServiceDomain getService(String service) {

        switch (service) {
            case "one":
                return new AuthorityServiceDomainImpl();
            case "":
                return new AuthorityServiceDomainImpl();
            default:
                new AuthorityServiceDomainImpl();

        }
        return new AuthorityServiceDomainImpl();

    }
}
