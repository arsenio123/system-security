package com.system.credit.tables;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

@Entity
public class Role implements Serializable {
    @Id
    private UUID role_id;
    private String descricao;

    public UUID getRole_id() {
        return role_id;
    }

    public Role setRole_id(UUID role_id) {
        this.role_id = role_id;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Role setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
}
