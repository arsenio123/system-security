package com.system.credit.service;

import com.system.credit.io.Status;
import com.system.credit.io.ValidationRequest;
import com.system.credit.io.ValidationResponse;
import org.malagueta.fintech.domain.entity.AuthorityEntity;
import org.malagueta.fintech.domain.entity.RoleEntity;
import org.malagueta.fintech.domain.repository.AuthoriteRepository;
import org.malagueta.fintech.domain.service.AuthorityServiceDomain;
import org.malagueta.fintech.domain.service.factory.AuthorityServiceDomainFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class ValidarionServiceImpl implements ValidarionService{

    @Autowired
    AuthoriteRepository authoriteRepository;
    //AuthorityServiceDomain

    @Override
    public ValidationResponse validaToken(ValidationRequest token) {
        // get tokken role
        //map funcion with role

        ValidationResponse response=new ValidationResponse();
        response.setMessage("coloca valor certo aqui").setStatus(HttpStatus.OK);
        return response;
    }

    @Override
    public ValidationResponse autorizationValidation(String uri, List<RoleEntity> roles) {

        ValidationResponse response= new ValidationResponse();
        response.setStatus(HttpStatus.UNAUTHORIZED);
        AuthorityServiceDomain serviceDomain=AuthorityServiceDomainFactory.getService("");
        if(serviceDomain.isAuthorized(roles, new AuthorityEntity().setUriAcess(uri), authoriteRepository)){
            return response.setStatus(HttpStatus.OK);
        }

        return response;
    }

    public ValidationResponse isAutorizede(String service,String userRole){
        //find from db if userRole is autorized to performe action
        return null;
    }
}
