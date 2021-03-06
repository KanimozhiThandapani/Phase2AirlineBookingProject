package com.sample.service;

import java.util.List;

import com.sample.pojo.Flight;
import com.sample.pojo.User;

public interface BaseService {
  public boolean login(String username, String password);
  public List<Flight> flightDetails(String source,String destination);
  public String registration(User user);
  public boolean bookedFlight(Flight flight,String username);
}