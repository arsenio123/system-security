package com.system.credit.repository;

import com.system.credit.dto.DTO_Authority;
import com.system.credit.repository.jpaRepo.RoleRepositoryImpl;
import com.system.credit.tables.Authority;
import com.system.credit.tables.Role;
import org.malagueta.fintech.domain.entity.AuthorityEntity;
import org.malagueta.fintech.domain.entity.RoleEntity;
import org.malagueta.fintech.domain.repository.AuthoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthoriteRepositoryImpl implements AuthoriteRepository {

    @Autowired
    RoleRepositoryImpl roleRepository;

    @Override
    public boolean roleHasAuthorit(List<RoleEntity> roles, AuthorityEntity authorityEntity) {
        Authority authority =DTO_Authority.convertToAuthority(authorityEntity);

        for (RoleEntity role:roles) {
            Role tableRole = roleRepository.getRoleByName(role.getName());
            for (Authority curAuthority: tableRole.getAuthoritys()) {
                if(curAuthority.getAutorize_uri().equalsIgnoreCase(authority.getAutorize_uri()))
                    return true;
            }
        }
        return false;
    }
}
