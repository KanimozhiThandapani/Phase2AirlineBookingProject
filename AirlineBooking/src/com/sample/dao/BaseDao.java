package com.sample.dao;

import java.util.List;

import com.sample.pojo.Flight;
import com.sample.pojo.User;

public interface BaseDao {
 public boolean login(String username, String password);
 public String register(User user);
 public List<Flight> flightDetails(String source,String destination);
 public boolean bookedFlight(Flight flight, String username);
}
