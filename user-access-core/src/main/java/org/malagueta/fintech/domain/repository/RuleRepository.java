package org.malagueta.fintech.domain.repository;

import org.malagueta.fintech.domain.entity.RuleEntity;

import java.util.List;
import java.util.UUID;

public interface RuleRepository {
    RuleEntity addRule(RuleEntity rule);

    RuleEntity updateRule(RuleEntity rule);

    List<RuleEntity> findByID(Long ruleID);
}
