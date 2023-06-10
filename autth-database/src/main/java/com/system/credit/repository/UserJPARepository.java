package com.system.credit.repository;

import com.system.credit.tables.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserJPARepository extends JpaRepository<User, Long> {
    User findByName(String name);

    List<User> getAllBy();
}
