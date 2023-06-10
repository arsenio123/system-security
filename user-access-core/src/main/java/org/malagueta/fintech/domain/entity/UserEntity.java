package org.malagueta.fintech.domain.entity;

import java.util.Set;

public class UserEntity {
    private Long id;
    private String name;
    private String senha;

    private Set<RuleEntity> rolles;

    public Long getId() {
        return id;
    }

    public UserEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public Set<RuleEntity> getRolles() {
        return rolles;
    }

    public UserEntity setRolles(Set<RuleEntity> rolles) {
        this.rolles = rolles;
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
    public void addRole(RuleEntity newRole){
        rolles.add(newRole);
    }
    public void RemoveRole(RuleEntity rule){
        rolles.remove(rule);
    }

}
