package com.system.credit.service;

import com.system.credit.io.Status;
import com.system.credit.io.ValidationRequest;
import com.system.credit.io.ValidationResponse;
import org.springframework.stereotype.Component;

@Component
public class ValidarionServiceImpl implements ValidarionService{

    @Override
    public ValidationResponse validaToken(ValidationRequest token) {
        // get tokken role
        //map funcion with role

        ValidationResponse response=new ValidationResponse();
        response.setMessage("coloca valor certo aqui").setStatus(Status.AUTORIZED);
        return response;
    }

    public ValidationResponse isAutorizede(String service,String userRole){
        //find from db if userRole is autorized to performe action
        return null;
    }
}
