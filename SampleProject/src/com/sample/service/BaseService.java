package com.sample.service;

import com.sample.pojo.User;

public interface BaseService {
 public boolean login(String username, String password);

 public String registration(User user);
}