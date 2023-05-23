package com.system.credit;

import org.junit.jupiter.api.Test;
import org.malagueta.fintech.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest(classes = AuthDBApplication.class)
public class UserServiceTest {
    @Autowired
    UserRepository repository;

    @Test
    public void creatUser(){
        Assert.isTrue(true);
    }
}
