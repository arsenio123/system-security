package com.system.credit.service;

import com.system.credit.io.ValidationRequest;
import com.system.credit.io.ValidationResponse;
import org.malagueta.fintech.domain.entity.RoleEntity;

import java.util.List;

public interface  ValidarionService {
    public ValidationResponse validaToken(ValidationRequest token);
    public ValidationResponse autorizationValidation(String uri, List<RoleEntity> roles);
}
