package com.system.credit.repository.jpaRepo;

import com.system.credit.tables.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

public interface UserJPARepository extends JpaRepository<User, UUID> {

    @Query("select u from User u where u.name=:name")
    User findByName(String name);


    List<User> getAllBy();
}
