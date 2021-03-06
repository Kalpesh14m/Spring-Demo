package com.java.springmvc.repo;

import com.java.springmvc.model.LoginForm;
import com.java.springmvc.model.User;

public interface UserRepository {

  void register(User user);

  User validateUser(LoginForm login);
}
