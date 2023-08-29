package org.malagueta.fintech.domain.service;

import org.malagueta.fintech.domain.entity.RoleEntity;
import org.malagueta.fintech.domain.repository.RuleRepository;

import java.util.List;

public class RulesServiceDomain {
    RoleEntity createRule(RoleEntity rule, RuleRepository repository){
        return repository.addRule(rule);
    }
    RoleEntity editRule(RoleEntity rule, RuleRepository repository){
        return repository.updateRule(rule);
    }
    public List<RoleEntity> searchRuleById(Long ruleID, RuleRepository repository){
        return repository.findByID(ruleID);
    }
}
