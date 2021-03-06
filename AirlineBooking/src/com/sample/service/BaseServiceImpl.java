package com.sample.service;

import java.util.List;

import com.sample.dao.BaseDao;
import com.sample.dao.BaseDaoImpl;
import com.sample.pojo.Flight;
import com.sample.pojo.User;

public class BaseServiceImpl implements BaseService {

 private BaseDao loginDao = new BaseDaoImpl();

 @Override
 public boolean login(String username, String password) {
  return loginDao.login(username, password);
 }

 @Override
 public List<Flight> flightDetails(String source,String destination) {
	 return loginDao.flightDetails(source, destination);
 };
 
 @Override
 public String registration(User user) {
  return loginDao.register(user);
 }

@Override
public boolean bookedFlight(Flight flight, String username) {
	return loginDao.bookedFlight(flight, username);
}

}