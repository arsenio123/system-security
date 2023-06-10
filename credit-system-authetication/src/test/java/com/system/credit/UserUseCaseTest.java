package com.system.credit;



import com.system.credit.tables.User;
import org.junit.jupiter.api.Test;
import org.malagueta.fintech.domain.entity.UserEntity;
import org.malagueta.fintech.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;


public class UserUseCaseTest {

    @Autowired
    private UserRepository repository;


    @Test
    public void findUserByName(){
        UserEntity  UserEntity= repository.findByName("admin");

        Assert.notNull(UserEntity,"tem que devolver 1 entrada da pequisa");
    }

}
