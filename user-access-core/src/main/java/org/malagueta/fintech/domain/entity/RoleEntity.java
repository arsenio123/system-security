package org.malagueta.fintech.domain.entity;

import java.util.Set;

public class RoleEntity {
    private Long id;
    private String name;
    private String description;

    Set<AuthorityEntity> authorityEntities;

    public Long getId() {
        return id;
    }

    public RoleEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RoleEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RoleEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public Set<AuthorityEntity> getAutoritys() {
        return authorityEntities;
    }

    public RoleEntity setAuthorityEntity(Set<AuthorityEntity> authorityEntities)
    {
        this.authorityEntities=authorityEntities;
        return this;
    }
}
