package com.system.credit.dto;

import com.system.credit.tables.User;
import org.malagueta.fintech.domain.entity.UserEntity;

public class DTO_User {
    public static User convertToUserTable(UserEntity userEntity) {
        User user=new User();
       return user.setId(userEntity.getId())
                .setName(userEntity.getName())
                .setSenha(user.getSenha());
    }

    public static UserEntity convertToUserEntity(User userTable) {
        UserEntity userEntity=new UserEntity();
        return userEntity.setId(userTable.getId())
                .setName(userTable.getName())
                .setSenha(userTable.getSenha());
    }
}
