package com.sample.service;

import com.sample.dao.BaseDao;
import com.sample.dao.BaseDaoImpl;
import com.sample.pojo.User;

public class BaseServiceImpl implements BaseService {

 private BaseDao loginDao = new BaseDaoImpl();

 @Override
 public boolean login(String username, String password) {
  return loginDao.login(username, password);
 }

 @Override
 public String registration(User user) {
  return loginDao.register(user);
 }

}