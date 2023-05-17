package com.system.credit.autentication.creditsystemauthetication.service;

import com.system.credit.autentication.creditsystemauthetication.io.ValidationResponse;

public interface  ValidarionService {
    public ValidationResponse validaToken(String token);
}
