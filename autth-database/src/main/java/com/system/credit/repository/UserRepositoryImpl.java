package com.system.credit.repository;

import com.system.credit.dto.DTO_User;
import com.system.credit.tables.User;
import org.malagueta.fintech.domain.entity.UserEntity;
import org.malagueta.fintech.domain.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class UserRepositoryImpl extends GenericJDBCRepository<User> implements UserRepository {

    private UserJPARepository userUUIDJpaRepository;
    private Logger log= LoggerFactory.getLogger(UserRepositoryImpl.class);

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
        System.out.println("iniciando o teste");
        System.out.println("tamanho :"+testFindAll().size());
        return null;


        /*
        List<UserEntity> userEntities=new ArrayList<>();
        List<User> users= userUUIDJpaRepository.findAll();
        users.stream().forEach(user -> {
            userEntities.add(DTO_User.convertToUserEntity(user));
        });

        return userEntities;*/

    }
    public UserEntity findById(Long resourceID) {
        User user=userUUIDJpaRepository.findById(resourceID).orElse(null);
        return DTO_User.convertToUserEntity(user);
    }

    /**
     * TO-DELETE
     * @param
     * @return
     */
    public List<User> testFindAll() {
        List<User> users=getAll(new User());
        return users;
    }

}
