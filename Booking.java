package com.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {

	String passengerName,gender,emailId;
	int age;
	long phoneNo;
	String flightName;
	int flightNo;
	java.util.Date date;
	
	Booking(){
		Scanner sc = new Scanner(System.in);
		
		  System.out.println("Enter name of passenger: ");
		  passengerName = sc.next();
		  System.out.println("Enter gender: "); 
		  gender = sc.next();
		  System.out.println("Enter emailId : ");
		  emailId = sc.next();
		  System.out.println("Enter age : ");
		  age = sc.nextInt();
		  System.out.println("Enter passenger phoneNo : "); 
		  phoneNo = sc.nextLong();                             
		  System.out.println("Enter flight No : ");
	      flightNo = sc.nextInt();
		  System.out.println("Enter flight Name : "); flightName = sc.next();
		  System.out.println("Enter date yyyy-mm-dd");
		  String dateInput = sc.next();
		  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
public boolean isAvailable() throws SQLException {
		
		FlightDAO flightdao = new FlightDAO();
		BookingDAO bookingdao = new BookingDAO();
		int capacity = flightdao.getCapacity(flightNo);
		
		
		int booked = bookingdao.getBookedCount(flightNo, date);
		
		
		return booked<capacity;
		
	}

	
}
	   
		
			