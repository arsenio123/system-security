package org.malagueta.fintech.domain.repository;

import org.malagueta.fintech.domain.entity.RoleEntity;

import java.util.List;

public interface RuleRepository {
    RoleEntity addRule(RoleEntity rule);

    RoleEntity updateRule(RoleEntity rule);

    List<RoleEntity> findByID(Long ruleID);
}
