package com.system.credit.repository;

import com.system.credit.dto.DTO_User;
import com.system.credit.tables.User;
import org.malagueta.fintech.domain.entity.UserEntity;
import org.malagueta.fintech.domain.repository.UserRepository;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Component
public class UserRepositoryImpl extends GenericJDBCRepository<User> implements UserRepository {

    private UserJPARepository userUUIDJpaRepository;

    public UserRepositoryImpl(UserJPARepository userUUIDJpaRepository) {
        this.userUUIDJpaRepository = userUUIDJpaRepository;
    }

    @Override
    public UserEntity addUser(UserEntity userEntity) {
       User user= DTO_User.convertToUserTable(userEntity);
        UserEntity entity=DTO_User.convertToUserEntity(saveUpdate(user));
        return entity;
    }

    @Override
    public UserEntity updateUser(UserEntity userEntity) {
        User user=DTO_User.convertToUserTable(userEntity);
        userUUIDJpaRepository.changePassword(user.getSenha(),user.getId());//

        return userEntity;
    }


    public UserEntity findByName(String name) {
        User user=userUUIDJpaRepository.findByName(name);
        UserEntity entity=DTO_User.convertToUserEntity(user);
        return entity;
    }

    @Override
    public List<UserEntity> getAll() {
        List<UserEntity> userEntities=new ArrayList<>();
        List<User> users= userUUIDJpaRepository.findAll();
        users.stream().forEach(user -> {
            userEntities.add(DTO_User.convertToUserEntity(user));
        });

        return userEntities;
    }
    public UserEntity findById(Long resourceID) {
        User user=userUUIDJpaRepository.findById(resourceID).orElse(null);
        return DTO_User.convertToUserEntity(user);
    }


}
