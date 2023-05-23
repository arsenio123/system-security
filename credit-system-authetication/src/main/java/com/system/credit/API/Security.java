package com.system.credit.API;

import com.system.credit.io.ValidationResponse;
import com.system.credit.service.ValidarionService;
import org.malagueta.fintech.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class Security {
    @Autowired
    public ValidarionService service;

    @Autowired
    public UserRepository repository;//=new UserRepositoryImpl();

    @PostMapping("validate")
    public ValidationResponse validateToken(@RequestBody String token){
       return service.validaToken(token);
    }
}
