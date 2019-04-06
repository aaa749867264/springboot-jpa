package com.serve;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.bean.user;
import com.nterface.UserRepository;

@Service
public class userSerce implements mpUserServce {	
	@Autowired
    private UserRepository userRepository;

	@Override
	public List<user> getUserList() {
		
		return userRepository.findAll();
	}

	@Override
	public user getUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public user addUserInfo(user userInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public user updateUserInfoById(user userInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserInfoById(Long Id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<user> getCurrentUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<user> getPageUserList() {
		 Sort sort=new Sort(Sort.Direction.DESC,"id");
	        Pageable pageable=new PageRequest(0 ,2,sort);
	        return userRepository.findAll(pageable);
	}

}
