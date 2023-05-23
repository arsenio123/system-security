package com.system.credit.repository;

import com.system.credit.dto.DTO_User;
import com.system.credit.tables.User;
import org.malagueta.fintech.domain.entity.UserEntity;
import org.malagueta.fintech.domain.repository.UserRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration
@Component//Scan("com.system.credit.repository")
public class UserRepositoryImpl extends GenericJDBCRepository<User> implements UserRepository {
    @Override
    public UserEntity addUser(UserEntity userEntity) {
       User user= DTO_User.convertToUserTable(userEntity);
        UserEntity entity=DTO_User.convertToUserEntity(saveUpdate(user));
        return entity;
    }

    @Override
    public UserEntity updateUser(UserEntity user) {
        return null;
    }
}
