package org.malagueta.fintech.domain.service.impl;

import org.malagueta.fintech.domain.entity.UserEntity;
import org.malagueta.fintech.domain.repository.UserRepository;
import org.malagueta.fintech.domain.service.UserServiceDomain;
import org.malagueta.fintech.exception.SerciceException;
import org.malagueta.fintech.exception.ServiceCatalogMessages;

import java.util.List;

public class UserServiceDomainImpl implements UserServiceDomain {
    public UserEntity createUser(UserEntity user, UserRepository repository){
        return repository.addUser(user);
    }
    public UserEntity getUserByName(String name, UserRepository repository){
        return repository.findByName(name);
    }

    public List<UserEntity> getAllUsers(UserRepository repository) {
        return repository.getAll();
    }

    public String changePassword(String id,
                                 String oldPassword,
                                 String newPassword,
                                 UserRepository repository) {

        Long resourceID=Long.parseLong(id);
        UserEntity user=repository.findById(resourceID);
        if(user!=null){
            if(user.getSenha().equals(oldPassword)){
                user.setSenha(newPassword);
                UserEntity entity=repository.updateUser(user);
                return ServiceCatalogMessages.PASSWORD_ALTERADA_COM_SUCESSO.toString();
            }

            throw new SerciceException(ServiceCatalogMessages.PASSWORD_INCORRECT);
        }else{

            throw new SerciceException(ServiceCatalogMessages.USER_NAME_NOT_FOUND);
        }
    }
}
