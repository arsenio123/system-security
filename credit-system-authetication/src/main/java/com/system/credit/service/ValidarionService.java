package com.system.credit.service;

import com.system.credit.io.ValidationResponse;

public interface  ValidarionService {
    public ValidationResponse validaToken(String token);
}
