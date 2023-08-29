package com.system.credit.dto;

import com.sun.istack.NotNull;
import com.system.credit.tables.Authority;
import org.malagueta.fintech.domain.entity.AuthorityEntity;

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
}
