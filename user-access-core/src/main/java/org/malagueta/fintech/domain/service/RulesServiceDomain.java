package org.malagueta.fintech.domain.service;

import org.malagueta.fintech.domain.entity.RuleEntity;
import org.malagueta.fintech.domain.entity.UserEntity;
import org.malagueta.fintech.domain.repository.RuleRepository;

import java.util.List;
import java.util.UUID;

public class RulesServiceDomain {
    RuleEntity createRule(RuleEntity rule, RuleRepository repository){
        return repository.addRule(rule);
    }
    RuleEntity editRule(RuleEntity rule, RuleRepository repository){
        return repository.updateRule(rule);
    }
    public List<RuleEntity> searchRuleById(UUID ruleID, RuleRepository repository){
        return repository.findByID(ruleID);
    }
}
