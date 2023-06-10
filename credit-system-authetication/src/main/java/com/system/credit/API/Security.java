package com.system.credit.API;

import com.system.credit.io.ValidationRequest;
import com.system.credit.io.ValidationResponse;
import com.system.credit.service.ValidarionService;
import org.malagueta.fintech.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RestController
public class Security {
    @Autowired
    public ValidarionService service;

    @Autowired
    public UserRepository repository;

    @PostMapping("/validate")
    @CrossOrigin
    //@PreAuthorize("AUTENTICATED")
    public ValidationResponse validateToken(@RequestBody ValidationRequest token){

        return service.validaToken(token);
    }
}
