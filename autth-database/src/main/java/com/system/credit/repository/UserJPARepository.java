package com.system.credit.repository;

import com.system.credit.tables.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserJPARepository extends JpaRepository<User, Long> {
    User findByName(String name);

    List<User> getAllBy();

    @Modifying
    @Query("update User u set u.senha = :senha where u.id = :id")
    void changePassword(@Param("senha") String senha, @Param("id") Long id);

}
