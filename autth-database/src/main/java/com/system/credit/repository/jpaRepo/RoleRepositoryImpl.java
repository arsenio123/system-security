package com.system.credit.repository.jpaRepo;

import com.system.credit.tables.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepositoryImpl extends JpaRepository<Role, Long> {
    public Role getRoleByName(String name);
}
