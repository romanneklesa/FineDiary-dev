package com.FineDiary.controller.securityContollers;


import com.FineDiary.entity.User;
import com.FineDiary.global.Constants;
import com.FineDiary.json.JsonRegister.PersonToRegisterEntity;
import com.FineDiary.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;

@Controller
public class RegistrationController {

    @Autowired
    private UserService service;


    @RequestMapping(value = "/auth/register", method = RequestMethod.POST, produces = Constants.MimeTypes.UTF_8_PLAIN_TEXT)
//TODO change to post
    @ResponseBody
    public String registrationPage(@RequestHeader(value = CONTENT_TYPE) String contentType,
                                   @RequestBody String body,
                                   HttpServletResponse response) {
        try {
            User user = new User();
            PersonToRegisterEntity newUser;
            try {
                newUser = new ObjectMapper().readValue(body, PersonToRegisterEntity.class);
            } catch (IOException e) {
                response.setStatus(402);
                response.setHeader("headers", "{\"Content-Type\":\"application/json\"}");
                return "{\"info\":\"Wrong data format!\"}";
            }

            //check for unique email
            User checkerUser = service.findByEmail(newUser.getEmail());
            if (checkerUser != null) {
                if (checkerUser.getEmail().equals(newUser.getEmail()))
                    throw new AuthenticationException();
            }


            user.setId(Integer.MAX_VALUE);//cant be null and cant be a number that is already registered
            user.setEmail(newUser.getEmail());
            user.setPassword(newUser.getPassword());
            user.setName(newUser.getName());
            user.setLastName(newUser.getSurname());
            user.setRole("user");
            service.create(user);

//            //because email sends for too long
//            new Thread(() -> mailSender.sendEmail(user)).start();


            response.setStatus(200);
            response.setHeader("headers", "{\"Content-Type\":\"application/json\"}");

            return "{\"info\":\"New User Registered!\"}";
        } catch (AuthenticationException e) {
            response.setStatus(401);
            response.setHeader("headers", "{\"Content-Type\":\"application/json\"}");
            return "{\"info\":\"Email is already in use!\"}";
        }
    }



}
