package com.system.credit.API;

import com.system.credit.io.ValidationRequest;
import com.system.credit.io.ValidationResponse;
import com.system.credit.service.ValidarionService;
import org.malagueta.fintech.domain.entity.UserEntity;
import org.malagueta.fintech.domain.repository.UserRepository;
import org.malagueta.fintech.domain.service.UserServiceDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RestController
public class Security {
    @Autowired
    public ValidarionService service;

    @Autowired
    public UserRepository repository;

  // @Autowired
   // public UserServiceDomain  userServiceDomain;

    @PostMapping("/validate")
    @CrossOrigin
    //@PreAuthorize("AUTENTICATED")
    public ValidationResponse validateToken(@RequestBody ValidationRequest token){

        return service.validaToken(token);
    }
    @GetMapping("user/login")
    @CrossOrigin
    public UserEntity getUsers(@RequestParam("userName") String name){
        System.out.println(name);
        return repository.findByName(name);

    }

/*
    @PostMapping("Security/user/create")
    public UserEntity create(@RequestBody UserEntity userEntity){
        return userServiceDomain.createUser(userEntity,repository);
    }*/
}
