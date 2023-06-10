package com.system.credit.service;

import com.system.credit.io.ValidationRequest;
import com.system.credit.io.ValidationResponse;

public interface  ValidarionService {
    public ValidationResponse validaToken(ValidationRequest token);
}
