package com.system.credit.dto;

import com.sun.istack.NotNull;
import com.system.credit.tables.User;
import org.malagueta.fintech.domain.entity.UserEntity;
import org.springframework.lang.NonNull;

public class DTO_User {
    public static User convertToUserTable( UserEntity userEntity) {
        if(userEntity==null) return null;
            User user=new User();
            user.setId(userEntity.getId())
                    .setName(userEntity.getName())
                    .setSenha(userEntity.getSenha());
            return user;
    }

    public static UserEntity convertToUserEntity(User userTable) {
        if(userTable==null) return null;
            UserEntity userEntity=new UserEntity();
            return userEntity.setId(userTable.getId())
                    .setName(userTable.getName())
                    .setSenha(userTable.getSenha());


    }
}
