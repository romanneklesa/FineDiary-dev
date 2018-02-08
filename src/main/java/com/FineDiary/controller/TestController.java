package com.FineDiary.controller;


import com.FineDiary.entity.User;
import com.FineDiary.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

@Controller
public class TestController{
    @Autowired
    UserService svc;


    @RequestMapping(value = "/save",method = RequestMethod.GET)
    @ResponseBody
    public String saveTest(){
        User user = new User();

        Random random = new Random();
        int rand=random.nextInt();
        user.setName("romka");
        user.setPassword("040593");
        user.setEmail("test"+rand+"@test.test");
        user.setLastName("Kosiy");
        user.setSurrName("Stanislavovich");
        svc.create(user);
        return "User " + user.getName() + "with " + user.getEmail() + " email has been saved";
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public String test() {

        ArrayList<String> buffer = new ArrayList<>();

        try (Stream<User> stream = (Stream<User>) svc.findAll()) {
            stream.forEach((k)->buffer.add("User : " + k));
        }
        return "The first user in the database is : "+svc.findUserById(1).getEmail();

        //return "redirect:index.jsp/";
//        return buffer.get(1);
    }

    @RequestMapping(value = "/testName",method = RequestMethod.GET)
    @ResponseBody
    public String testNameFinder() {

        List testList = svc.findAll();//сетаем то, что мы будем искать
        User firstUserWIthName = (User) testList.get(0);//Возвращает первую запись

        return firstUserWIthName.getName();
    }

    @RequestMapping(value = "/testEmail",method = RequestMethod.GET)
    @ResponseBody
    public String testEmailFind() {

        User firstUserWithMail = svc.findByEmail("test@test.test");//сетаем то, что мы будем искать
        return "The user with " + firstUserWithMail.getEmail()+ " has ID: "+ firstUserWithMail.getId() + ", Name : "  + firstUserWithMail.getName()  + ", Password :  " + firstUserWithMail.getPassword();
    }



//    @RequestMapping(value = "/testJson",method = RequestMethod.GET)
//    @ResponseBody
//    public String testJson() {
//        List testList = svc.findByName("romka");
//        User firstUserWIthName = (User) testList.get(0);//Возвращает первую запись
//        Gson gs = new Gson();
//        String str = gs.toJson(firstUserWIthName);
//        return "status 200"+str;
//    }
//    //Find all users
//    @RequestMapping(value = "/all", method = RequestMethod.GET)
//    @ResponseBody
//    public String getAllUsers() {
//        String result = "";
//        List<User> users = new ArrayList<>();
//
//        users = svc.findAll();
//        for (User ob : users) {
//            result = result + ob.getId() + " " + ob.getName() + " " + ob.getLastName() + " " + ob.getEmail() + " " + ob.getPassword() + "\r\n";
//        }
//        return result;
//    }

}