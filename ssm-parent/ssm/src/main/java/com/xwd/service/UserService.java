package com.xwd.service;

import com.xwd.model.User;

public interface UserService {

  public void addUser(User u);

  public boolean updateUser(User u);

public Boolean deleteUserById(Long id);

public User findUserById(int id);

}
