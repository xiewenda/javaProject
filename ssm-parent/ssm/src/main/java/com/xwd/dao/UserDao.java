package com.xwd.dao;

import com.xwd.model.User;

public interface UserDao {

	public void addUser(User u);

	public boolean updateUser(User u);

	public Boolean deleteUserById(Long id);

	public User findUserById(int id);

}
