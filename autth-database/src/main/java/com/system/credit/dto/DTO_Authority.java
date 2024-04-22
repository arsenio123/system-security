package com.system.credit.dto;

import com.sun.istack.NotNull;
import com.system.credit.tables.Authority;
import org.malagueta.fintech.domain.entity.AuthorityEntity;

import java.util.HashSet;
import java.util.Set;

public class DTO_Authority {
    public static AuthorityEntity convertToAuthorityEntity(@NotNull  Authority authority){

        AuthorityEntity entity=new AuthorityEntity();

        return entity.setUriAcess(authority.getAutorize_uri())
                .setDescription(authority.getDescription())
                .setAuthID(entity.getAuthID());
    }

    public static Authority convertToAuthority(@NotNull AuthorityEntity entity){
        Authority authority=new Authority();
        return authority.setAuth_id(entity.getAuthID())
                .setAutorize_uri(entity.getUriAcess())
                .setDescription(entity.getDescription());

    }

    public static Set<AuthorityEntity> convertToAuthorityEntity(@NotNull  Set<Authority> tableAuthoritys){
        if (tableAuthoritys==null){return null;}
        Set<AuthorityEntity> authorityEntities=new HashSet<AuthorityEntity> ();
        tableAuthoritys.stream().forEach(authorityRow->{

            authorityEntities.add(convertToAuthorityEntity(authorityRow));
        });
        return authorityEntities;
    }
}
