package com.xwd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xwd.dao.UserDao;
import com.xwd.model.User;
import com.xwd.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    UserDao userDao;
	
	
	@Override
	public void addUser(User u) {
		userDao.addUser(u);
	}


	@Override
	public boolean updateUser(User u) {
		// TODO Auto-generated method stub
		 return userDao.updateUser(u);
	}


	@Override
	public Boolean deleteUserById(Long id) {
		// TODO Auto-generated method stub
		return userDao.deleteUserById(id);
	}


	@Override
	public User findUserById(int id) {
		return userDao.findUserById(id);
	}

}
