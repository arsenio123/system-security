package org.malagueta.fintech.domain.entity;

public class RuleEntity {
    private Long id;
    private String name;
    private String description;

    public Long getId() {
        return id;
    }

    public RuleEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RuleEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RuleEntity setDescription(String description) {
        this.description = description;
        return this;
    }

}
