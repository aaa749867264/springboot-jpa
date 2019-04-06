package com.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.user;
import com.serve.userSerce;

@RestController
@RequestMapping(value = "/test")
public class UserController {
	 @Autowired
	 private user u;
	 @Resource
	 private userSerce us;

	
    @GetMapping(value = "/getUserList")
    public List<user> getUserList() {
        
    	return us.getUserList();
    }
    
    
    @GetMapping(value = "/getPageUserList")
    public Object getPageUserList() {
    	Page<user> ul = us.getPageUserList();
    	return ul.getContent();
    	
//    	return us.getPageUserList();
    }

}
