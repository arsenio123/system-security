package com.system.credit.tables;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String descricao;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name ="role_Autorite",
            joinColumns = @JoinColumn(name="id"),
            inverseJoinColumns = @JoinColumn(name="auth_id"))
    private Set<Authority> authoritys;


    public Long getId() {
        return id;
    }


    public String getDescricao() {
        return descricao;
    }
    public String getName() {
        return name;
    }

    public Role setName(String name) {
        this.name = name;
        return this;
    }

    public Set<Authority> getAuthoritys() {
        return authoritys;
    }

    public Role setAuthoritys(Set<Authority> authoritys) {
        this.authoritys = authoritys;
        return this;
    }
}
