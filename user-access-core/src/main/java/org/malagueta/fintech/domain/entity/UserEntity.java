package org.malagueta.fintech.domain.entity;

import java.util.UUID;

public class UserEntity {
    private UUID id;
    private String name;
    private String senha;
    private RuleEntity entity;

    public UUID getId() {
        return id;
    }

    public UserEntity(UUID id) {
        this.id = id;
    }
    public UserEntity(){
        this.id=UUID.randomUUID();
    }

    public UserEntity setId(UUID id) {
        this.id = id;
        return this;
    }

    public RuleEntity getEntity() {
        return entity;
    }

    public UserEntity setEntity(RuleEntity entity) {
        this.entity = entity;
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
}
