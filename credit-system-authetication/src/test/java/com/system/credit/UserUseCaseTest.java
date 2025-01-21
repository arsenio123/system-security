package com.system.credit;

import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.malagueta.fintech.domain.entity.UserEntity;
import org.malagueta.fintech.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

@SpringBootTest
@ContextConfiguration(classes = CreditSystemAutheticationApplication.class)
public class UserUseCaseTest {


    private UserRepository repository;
    @Autowired
   public UserUseCaseTest(UserRepository repository){
        this.repository=repository;
    }


    @Test
    public void findUserByName(){
        UserEntity  UserEntity= repository.findByName("admin");

        Assert.notNull(UserEntity,"tem que devolver 1 entrada da pequisa");
    }

     @Test
    public void findAll(){
        UserEntity  UserEntity= repository.findByName("admin");

        Assert.notNull(UserEntity,"tem que devolver 1 entrada da pequisa");
    }

    @Test
    public void testGetAll(){
        repository.getAll();
    }
}
