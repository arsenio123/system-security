package org.malagueta.fintech.domain.service;

import org.malagueta.fintech.domain.entity.AuthorityEntity;
import org.malagueta.fintech.domain.entity.RoleEntity;
import org.malagueta.fintech.domain.repository.AuthoriteRepository;

import java.util.List;

public interface AuthorityServiceDomain {
    public boolean isAuthorized(List<RoleEntity> role, AuthorityEntity authority, AuthoriteRepository repository );
}
