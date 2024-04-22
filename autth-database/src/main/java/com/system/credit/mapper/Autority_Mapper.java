package com.system.credit.mapper;

import com.system.credit.tables.Authority;
import org.malagueta.fintech.domain.entity.AuthorityEntity;

import java.util.HashSet;
import java.util.Set;

public class Autority_Mapper {
    public static Set<Authority> convertToTable(Set<AuthorityEntity> entityAutoritys) {
        if(entityAutoritys==null){
            return null;
        }
        Set <Authority> authorities = new HashSet<Authority>();
        entityAutoritys.stream().forEach(entityAutority ->{
            authorities.add(new Authority()
                    .setAuth_id(entityAutority.getAuthID())
                    .setAutorize_uri(entityAutority.getUriAcess())
                    .setDescription(entityAutority.getDescription())
            );
        });
        return authorities;
    }
}
