package com.sample.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.sample.pojo.BookedFlight;
import com.sample.pojo.Flight;
import com.sample.pojo.User;
import com.sample.util.HibernateUtil;

public class BaseDaoImpl implements BaseDao {

 @Override
 public boolean login(String username, String password) {
  Session session = HibernateUtil.getSession();
  if (session != null) {
   try {
    User user = (User) session.get(User.class, username);
    if (password.equals(user.getPassword())) {
     System.out.println("User: " + user.toString());
     System.out.println("First Name:"+user.getFirstName());
     return true;
    }
   } catch (Exception exception) {
    System.out.println("Exception occred while reading user data: "
      + exception.getMessage());
    return false;
   }

  } else {
   System.out.println("DB server down.....");
  }
  return false;
 }
 
 //@Override
 public List<Flight> flightDetails(String source, String destination) {
	 System.out.println("Source!!!!"+source);
	 System.out.println("destination!!!!"+destination);
  Session session = HibernateUtil.getSession();
  boolean flag =true;
  List<Flight> list=new ArrayList<Flight>();  
  if (session != null) {
   try {
	   
	   Transaction tx = session.beginTransaction();
	   
	  // String queryString = "FROM Flight F WHERE F.source = :source and F.destination=:destination";
	   //Query query = session.createQuery(queryString);
	   Query query = session.createQuery("from Flight F WHERE F.source = :source and F.destination=:destination");
	   query.setParameter("source", source);
	   query.setParameter("destination", destination);
	   
	    list = query.list();
	 
	   for(Flight row : list){
	   	System.out.println(row.getFlightcode());	  
	   }
	   //return flag;
   }catch(Exception ex) {
	   System.out.println(ex.getMessage());
   }
  }
return list;
  
 }


 @Override
 public String register(User user) {
  String msg = "Registration unsuccessful, try again.....";
  Session session = HibernateUtil.getSession();
  if (session != null) {
   try {
    if (user != null) {
     String username = (String) session.save(user);
     session.beginTransaction().commit();
     msg = "User " + username
       + " created successfully, please login...";
    }
   } catch (Exception exception) {
    System.out.println("Exception occred while reading user data: "
      + exception.getMessage());
   }

  } else {
   System.out.println("DB server down.....");
  }
  System.out.println("msg:" + msg);
  return msg;
 }

@Override
public boolean bookedFlight(Flight flight, String username) {
	Session session = HibernateUtil.getSession();
	if (session != null) {
    session.beginTransaction();
    try {
    	//Add new BookedFlight object
        BookedFlight bf = new BookedFlight();
        bf.setUsername(username);
        bf.setFlightcode(flight.getFlightcode());
        bf.setSource(flight.getSource());
        bf.setDestination(flight.getDestination());
        bf.setStarttime(flight.getStarttime());
        bf.setReachtime(flight.getReachtime());
        bf.setAirline(flight.getAirline());
        bf.setPrice(flight.getPrice());
        
        //Save the employee in database
        session.save(bf);
     
        //Commit the transaction
        session.getTransaction().commit();
        return true;
    } catch(Exception ex){
    	System.out.println("Exception occred while reading user data: "
    		      + ex.getMessage());
    }    
    
	// TODO Auto-generated method stub
	}else {
		System.out.println("DB server down.....");
	}
	return false;
}
}