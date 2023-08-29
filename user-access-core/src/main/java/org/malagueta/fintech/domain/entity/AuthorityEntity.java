package org.malagueta.fintech.domain.entity;

public class AuthorityEntity {
    long authID;
    String uriAcess;
    String description;

    public long getAuthID() {
        return authID;
    }

    public AuthorityEntity setAuthID(long authID) {
        this.authID = authID;
        return this;
    }

    public String getUriAcess() {
        return uriAcess;
    }

    public AuthorityEntity setUriAcess(String uriAcess) {
        this.uriAcess = uriAcess;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AuthorityEntity setDescription(String description) {
        this.description = description;
        return this;
    }
}
