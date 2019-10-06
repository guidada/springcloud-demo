package com.laycoding.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/user/{id}")
    public  String getUser(@PathVariable("id") int id){
        if (id==1){
            return "库里";
        }else {
             return "科比";
        }
    }
}
