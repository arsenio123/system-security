package org.malagueta.fintech.domain.service.impl;

import org.malagueta.fintech.domain.entity.RoleEntity;
import org.malagueta.fintech.domain.repository.RuleRepository;
import org.malagueta.fintech.domain.service.RulesServiceDomain;

import java.util.List;

public class RulesServiceDomainImpl implements RulesServiceDomain {
    public RoleEntity createRule(RoleEntity rule, RuleRepository repository){
        return repository.addRule(rule);
    }
    public RoleEntity editRule(RoleEntity rule, RuleRepository repository){
        return repository.updateRule(rule);
    }
    public List<RoleEntity> searchRuleById(Long ruleID, RuleRepository repository){
        return repository.findByID(ruleID);
    }
}
