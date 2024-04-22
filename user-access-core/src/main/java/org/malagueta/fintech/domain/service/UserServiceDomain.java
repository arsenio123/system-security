package org.malagueta.fintech.domain.service;

import org.malagueta.fintech.domain.entity.UserEntity;
import org.malagueta.fintech.domain.repository.UserRepository;

import java.util.List;

public interface UserServiceDomain {
       public UserEntity createUser(UserEntity user, UserRepository repository);
    public UserEntity getUserByName(String name, UserRepository repository);

    public List<UserEntity> getAllUsers(UserRepository repository);

    public String changePassword(String id, String oldPassword, String newPassword,UserRepository repository) ;
}
