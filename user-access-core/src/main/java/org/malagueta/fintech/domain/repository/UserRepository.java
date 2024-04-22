package org.malagueta.fintech.domain.repository;

import org.malagueta.fintech.domain.entity.UserEntity;

import java.util.List;

public interface UserRepository {
    UserEntity addUser(UserEntity user);
    UserEntity updateUser(UserEntity user);
    UserEntity findByName(String name);
    List<UserEntity> getAll();

    UserEntity findById(Long resourceID);
}
