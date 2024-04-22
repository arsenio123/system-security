package org.malagueta.fintech.domain.service;

import org.malagueta.fintech.domain.entity.RoleEntity;
import org.malagueta.fintech.domain.repository.RuleRepository;

import java.util.List;

public interface RulesServiceDomain {
    RoleEntity createRule(RoleEntity rule, RuleRepository repository);
    RoleEntity editRule(RoleEntity rule, RuleRepository repository);
    public List<RoleEntity> searchRuleById(Long ruleID, RuleRepository repository);
}
