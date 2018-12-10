package com.taotao.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.taotao.pojo.User;
import com.taotao.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    //@Reference
    UserService UserService;
    @RequestMapping("save")
    public String save(){
        UserService.save();
        System.out.println("Seccuss save");
        return "save";

    }
    @RequestMapping("sellectAll")
    public String sellectAll(){
        List<User> li=UserService.sellectAll();
        for(User u:li){
            System.out.println("user: " + u.getUsername().toString());
        }
        return "success";
    }
    @RequestMapping("findByPage")
    public PageInfo<User> findByPage(int currentPage,int pageSize){
        PageInfo<User> page=UserService.findByPage(currentPage,pageSize);

        return page;
    }
}
