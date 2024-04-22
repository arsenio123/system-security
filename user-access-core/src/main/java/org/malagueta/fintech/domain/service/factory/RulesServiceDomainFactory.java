package org.malagueta.fintech.domain.service.factory;

import org.malagueta.fintech.domain.service.RulesServiceDomain;
import org.malagueta.fintech.domain.service.impl.RulesServiceDomainImpl;

public class RulesServiceDomainFactory {
    public static RulesServiceDomain getService(String service) {

        switch (service) {
            case "one":
                return new RulesServiceDomainImpl();
            case "":
                return new RulesServiceDomainImpl();
            default:
                new RulesServiceDomainImpl();

        }
        return new RulesServiceDomainImpl();

    }
}
