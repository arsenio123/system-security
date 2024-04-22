package com.system.credit;

import org.junit.jupiter.api.Test;
import org.malagueta.fintech.domain.entity.UserEntity;
import org.malagueta.fintech.domain.repository.UserRepository;
import org.malagueta.fintech.domain.service.UserServiceDomain;
import org.malagueta.fintech.domain.service.factory.UserServiceDomainFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class CreditSystemAutheticationApplicationTests {
    @Autowired
    UserRepository repository;



   // @Test
    void contextLoads() {
        repository.addUser(new UserEntity());
    }
  //  @Test
    void creatUser(){
        UserServiceDomain userService= UserServiceDomainFactory.getService("");
        UserEntity user=new UserEntity();
        user.setName("admin")
                .setSenha("strong");
        userService.createUser(user,repository);

    }

    //@Test
    void getUserByName(){
        UserServiceDomain userService=UserServiceDomainFactory.getService("");
        userService.getUserByName("admin",repository);

    }

}
