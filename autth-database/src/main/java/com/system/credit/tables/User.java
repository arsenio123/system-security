package com.system.credit.tables;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

@Entity
public class User implements Serializable {
    @Id
    private UUID id;
    private String name;
    private String senha;

    public UUID getId() {
        return id;
    }

    public User(UUID id) {
        this.id = id;
    }
    public User() {
        this.id = UUID.randomUUID();
    }
    public User setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public User setSenha(String senha) {
        this.senha = senha;
        return this;
    }
}
