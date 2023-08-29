package com.system.credit.tables;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Authority {
    @Id
    private long auth_id;
    private String autorize_uri;
    private String description;

    public long getAuth_id() {
        return auth_id;
    }

    public Authority setAuth_id(long auth_id) {
        this.auth_id = auth_id;
        return this;
    }

    public String getAutorize_uri() {
        return autorize_uri;
    }

    public Authority setAutorize_uri(String autorize_uri) {
        this.autorize_uri = autorize_uri;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Authority setDescription(String description) {
        this.description = description;
        return this;
    }
}
