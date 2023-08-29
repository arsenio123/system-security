package com.system.credit;


import org.junit.jupiter.api.Test;
import org.malagueta.fintech.domain.entity.AuthorityEntity;
import org.malagueta.fintech.domain.entity.RoleEntity;
import org.malagueta.fintech.domain.repository.AuthoriteRepository;
import org.malagueta.fintech.domain.service.AuthorityServiceDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class AuthorityTest {

    @Autowired
    private AuthoriteRepository repository;

    @Test
    public void validAuthoriTest(){
        String token="";
        AuthorityServiceDomain serviceDomain=new AuthorityServiceDomain();
        List<RoleEntity> role= new ArrayList<RoleEntity>();
        role.add(new RoleEntity().setName("admin"));
        AuthorityEntity authority=new AuthorityEntity();
        authority.setUriAcess("/credito/list/critirea/v2");
        System.out.println();
        Assert.isTrue(serviceDomain.isAuthorized(role, authority,repository),"essa autoridade ja foi dada tem que passar");
    }

    @Test
    public void authorityNoteValideTest(){
        String token="";
        AuthorityServiceDomain serviceDomain=new AuthorityServiceDomain();
        List<RoleEntity> role= new ArrayList<RoleEntity>();
        role.add(new RoleEntity().setName("admin"));
        AuthorityEntity authority=new AuthorityEntity();
        authority.setUriAcess("/credito/list/critirea/note");
        System.out.println();
        Assert.isTrue(!serviceDomain.isAuthorized(role, authority,repository),"essa autoridade ja foi dada tem que passar");
    }
}
