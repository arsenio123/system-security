package com.system.credit.API;

import com.system.credit.io.Status;
import com.system.credit.io.ValidationRequest;
import com.system.credit.io.ValidationResponse;
import com.system.credit.service.ValidarionService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.malagueta.fintech.domain.entity.RoleEntity;
import org.malagueta.fintech.domain.entity.UserEntity;
import org.malagueta.fintech.domain.repository.UserRepository;
import org.malagueta.fintech.domain.service.UserServiceDomain;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;


@RestController
public class Security {

    public ValidarionService service;
    public UserServiceDomain userServiceDomain;
    public UserRepository repository;

    public Security(ValidarionService service, UserRepository repository) {
        this.service = service;
        this.repository = repository;
        this.userServiceDomain=new UserServiceDomain();
    }

    @PostMapping("/validate")
    @CrossOrigin
    //@PreAuthorize("AUTENTICATED")
    public ResponseEntity<ValidationResponse> validateToken(@RequestBody ValidationRequest request){
    String [] tokenConpose=request.getToken().split("\\.");
        Base64.Decoder decoder = Base64.getUrlDecoder();

        JSONObject payloadJSON = new JSONObject(new String(decoder.decode(tokenConpose[1])));

        JSONArray jsonRoles = payloadJSON.getJSONArray("authorities");

        List<RoleEntity> roles=new ArrayList<>();
        jsonRoles.forEach( jsonRole->{

            roles.add(new RoleEntity().setName((String) jsonRole));
        });
        ValidationResponse validationResponse= service.autorizationValidation(request.getUri(), roles);
        ResponseEntity response =ResponseEntity.status(validationResponse.getStatus()).body(validationResponse);
        return response;

    }


    @GetMapping("/getHttpPath")
    @CrossOrigin
    public String getHttpPath(HttpServletRequest request) {
        String httpPath = request.getRequestURI();
        return "HTTP Path: " + httpPath;
    }
    @GetMapping("user/login")
    @CrossOrigin
    public UserEntity getUsers(@RequestParam("userName") String name){
        System.out.println(name);
        return repository.findByName(name);

    }


    @PostMapping("Security/user/create")
    public UserEntity create(@RequestBody UserEntity userEntity){
        return userServiceDomain.createUser(userEntity,repository);
    }
    @GetMapping("user/list")
    public List<UserEntity> getAllUser(){
        return userServiceDomain.getAllUsers(repository);
    }
}
