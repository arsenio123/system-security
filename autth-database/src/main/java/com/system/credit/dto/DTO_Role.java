package com.system.credit.dto;

import com.system.credit.mapper.Autority_Mapper;
import com.system.credit.tables.Role;
import org.malagueta.fintech.domain.entity.RoleEntity;

import java.util.HashSet;
import java.util.Set;

public class DTO_Role {
    public static Set<RoleEntity> convertToEntityRolles(Set<Role> roles) {
        Set<RoleEntity> ruleEntitySet = new HashSet<>();
        roles.stream().forEach(role -> {
            ruleEntitySet.add(convetToEntityRole(role));
        });
        return ruleEntitySet;
    }

    public static RoleEntity convetToEntityRole(Role role){
        RoleEntity roleEntity=new RoleEntity();
        return roleEntity.setDescription(role.getDescricao())
                .setName(role.getName())
                .setId(role.getId()).setAuthorityEntity(DTO_Authority.convertToAuthorityEntity(role.getAuthoritys()));

    }

    public static Set<Role> convertToTableRolles(Set<RoleEntity> entityRoles) {
        Set<Role> ruleEntitySet = new HashSet<>();
        entityRoles.stream().forEach(entityRole -> {
            ruleEntitySet.add(convertToTableRolle(entityRole));
        });
        return ruleEntitySet;
    }

    private static Role convertToTableRolle(RoleEntity entityRole) {
        Role role=new Role();
        role.setName(entityRole.getName())
                .setDescricao(entityRole.getDescription())
                .setAuthoritys(Autority_Mapper.convertToTable(entityRole.getAutoritys()));
        return role;
    }
}
