package org.malagueta.fintech.domain.repository;

import org.malagueta.fintech.domain.entity.AuthorityEntity;
import org.malagueta.fintech.domain.entity.RoleEntity;

import java.util.List;

public interface  AuthoriteRepository {
    public boolean roleHasAuthorit(List<RoleEntity> role, AuthorityEntity authority);
}
