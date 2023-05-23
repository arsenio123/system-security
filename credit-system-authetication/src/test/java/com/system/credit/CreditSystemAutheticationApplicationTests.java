package com.system.credit;

import org.junit.jupiter.api.Test;
import org.malagueta.fintech.domain.entity.UserEntity;
import org.malagueta.fintech.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CreditSystemAutheticationApplicationTests {
    @Autowired
    UserRepository repository;//=new UserRepositoryImpl();

    @Test
    void contextLoads() {
        repository.addUser(new UserEntity());
    }

}
