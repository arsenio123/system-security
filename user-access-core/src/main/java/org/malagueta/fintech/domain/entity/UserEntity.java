package org.malagueta.fintech.domain.entity;

import java.util.Set;

public class UserEntity {
    private Long id;
    private String name;
    private String senha;

    private Set<RoleEntity> roles;

    public Long getId() {
        return id;
    }

    public UserEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public Set<RoleEntity> getRoles() {
        return roles;
    }

    public UserEntity setRoles(Set<RoleEntity> rolles) {
        this.roles = rolles;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public UserEntity setSenha(String senha) {
        this.senha = senha;
        return this;
    }
    public void addRole(RoleEntity newRole){
        roles.add(newRole);
    }
    public void RemoveRole(RoleEntity rule){
        roles.remove(rule);
    }

}
