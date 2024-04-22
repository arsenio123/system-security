package com.system.credit;


import com.system.credit.API.Security;
import com.system.credit.io.ValidationRequest;
import org.hibernate.engine.spi.ManagedEntity;
import org.junit.jupiter.api.Test;
import org.malagueta.fintech.domain.entity.AuthorityEntity;
import org.malagueta.fintech.domain.entity.RoleEntity;
import org.malagueta.fintech.domain.repository.AuthoriteRepository;
import org.malagueta.fintech.domain.service.AuthorityServiceDomain;
import org.malagueta.fintech.domain.service.factory.AuthorityServiceDomainFactory;
import org.malagueta.fintech.exception.SerciceException;
import org.malagueta.fintech.exception.ServiceCatalogMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class AuthorityTest {


    @Autowired
    private Security securityApi;

    @Autowired
    private AuthoriteRepository repository;

    @Test
    public void validAuthoriTest(){

        ValidationRequest request= new ValidationRequest();
        request.setToken("");
        request.setUri("/credito/list/critirea/v2");
        Assert.isTrue(securityApi.validateToken(request).getStatusCodeValue()== HttpURLConnection.HTTP_UNAUTHORIZED,"essa autoridade ja foi dada tem que passar");
    }

    @Test
    public void authorityNoteValideTest(){
        String token="";
        AuthorityServiceDomain serviceDomain= AuthorityServiceDomainFactory.getService("");
        List<RoleEntity> role= new ArrayList<RoleEntity>();
        role.add(new RoleEntity().setName("admin"));
        AuthorityEntity authority=new AuthorityEntity();
        authority.setUriAcess("/credito/list/critirea/notValid");
        System.out.println();
        Assert.isTrue(!serviceDomain.isAuthorized(role, authority,repository),"essa autoridade ja foi dada tem que passar");
    }

    @Test
    public void changeIncorretPassTest() {
        try {
            String response = securityApi.changepass("admin", "changed", "1", "strong");
        } catch (SerciceException ex) {
            Assert.isTrue(ex.getMessage().equals(ServiceCatalogMessages.PASSWORD_INCORRECT.toString()),
                    ex.getMessage());
        }
    }

        @Test
        public void changePassTest(){
            try{
                String response =securityApi.changepass("admin","changed","1","strong");
            }catch (SerciceException ex){
                Assert.isTrue(ex.getMessage().equals(ServiceCatalogMessages.PASSWORD_INCORRECT.toString()),
                        ex.getMessage());
            }

    }
}
