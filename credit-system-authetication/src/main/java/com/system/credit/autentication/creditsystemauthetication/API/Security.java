package com.system.credit.autentication.creditsystemauthetication.API;

import com.system.credit.autentication.creditsystemauthetication.io.ValidationResponse;
import com.system.credit.autentication.creditsystemauthetication.service.ValidarionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Security {
    @Autowired
    public ValidarionService service;

    @PostMapping("validate")
    public ValidationResponse validateToken(@RequestBody String token){
       return service.validaToken(token);
    }
}
