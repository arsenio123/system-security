package org.malagueta.fintech.domain.service.impl;

import org.malagueta.fintech.domain.entity.AuthorityEntity;
import org.malagueta.fintech.domain.entity.RoleEntity;
import org.malagueta.fintech.domain.repository.AuthoriteRepository;
import org.malagueta.fintech.domain.service.AuthorityServiceDomain;

import java.util.List;

public class AuthorityServiceDomainImpl implements AuthorityServiceDomain {
    public boolean isAuthorized(List<RoleEntity> role, AuthorityEntity authority, AuthoriteRepository repository ){
        return repository.roleHasAuthorit(role,authority);
    }
}
