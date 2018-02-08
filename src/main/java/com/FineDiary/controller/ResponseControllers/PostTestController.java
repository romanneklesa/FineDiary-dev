package com.FineDiary.controller.ResponseControllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class PostTestController {

    @RequestMapping(value = "/testPost", method = RequestMethod.POST)
    @ResponseBody
    public String  poster(HttpServletResponse response,
                          @RequestHeader(value = "Authorization", required=false) String token){//true if token is needed
        response.setStatus(200);
        response.setHeader("headers", "{ 'Content-Type': 'application/json' }");
        return "{\"message\": \"Test success!\"}";
    }


}
