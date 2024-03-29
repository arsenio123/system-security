package org.malagueta.fintech.domain.service;

import org.malagueta.fintech.domain.entity.UserEntity;
import org.malagueta.fintech.domain.repository.UserRepository;

import java.util.List;

public class UserServiceDomain {
       public UserEntity createUser(UserEntity user, UserRepository repository){
       return repository.addUser(user);
    }
    public UserEntity getUserByName(String name, UserRepository repository){
        return repository.findByName(name);
    }

    public List<UserEntity> getAllUsers(UserRepository repository) {
           return repository.getAll();
    }
}
