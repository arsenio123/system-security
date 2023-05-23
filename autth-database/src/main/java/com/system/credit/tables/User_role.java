package com.system.credit.tables;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

@Entity
public class User_role implements Serializable {
    @Id
    private UUID user_id;
    @Id
    private UUID role_id;

    public UUID getUser_id() {
        return user_id;
    }

    public User_role setUser_id(UUID user_id) {
        this.user_id = user_id;
        return this;
    }

    public UUID getRole_id() {
        return role_id;
    }

    public User_role setRole_id(UUID role_id) {
        this.role_id = role_id;
        return this;
    }
}
