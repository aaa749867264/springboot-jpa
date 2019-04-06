package com.serve;

import java.util.List;

import org.springframework.data.domain.Page;

import com.bean.user;

public interface mpUserServce {
	List<user> getUserList();
	user getUserByName(String name);
	user addUserInfo(user userInfo);
	user updateUserInfoById(user userInfo);
    void deleteUserInfoById(Long Id);
    List<user>getCurrentUserList();
    Page<user> getPageUserList();
}
