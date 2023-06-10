package com.system.credit.repository;

import com.system.credit.dto.DTO_User;
import com.system.credit.tables.User;
import org.malagueta.fintech.domain.entity.UserEntity;
import org.malagueta.fintech.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.UUID;


@Component
public class UserRepositoryImpl extends GenericJDBCRepository<User> implements UserRepository {

    @Autowired
    private UserJPARepository userJPARepository;

    @Autowired
    private UserJPARepository userUUIDJpaRepository;

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


    public UserEntity findByName(String name) {
        User user=userUUIDJpaRepository.findByName(name);
        UserEntity entity=DTO_User.convertToUserEntity(user);
        return entity;
    }

}
