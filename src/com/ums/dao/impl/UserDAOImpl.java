package com.ums.dao.impl;

import java.util.Scanner;

import com.ums.pojo.User;

public class UserDAOImpl {
Scanner sc=new Scanner(System.in);
	User[]addUsers=null;
	public void register()
	{
		System.out.println("How Many Users Do You Want to Register");
		int size=sc.nextInt();
		addUsers=new User[size];
		for(int i=0;i<size;++i)
		{
		System.out.println("Enter User Id");
		int id=sc.nextInt();
		System.out.println("Enter First Name");
		String fname=sc.next();
		System.out.println("Enter Last Name");
			String lname=sc.next();
			System.out.println("Enter Email");
			String email=sc.next();
			
		System.out.println("Enter PassWord");
			String pass=sc.next();
			System.out.println("Enter Mobile Number");
			long mn=sc.nextLong();
			User user=new User(id,fname,lname,email,pass,mn);
			addUsers[i]=user;
			System.out.println("User Added SuccessFully");
			
		}
		
	}
	public boolean verifyEmailAndPassWord(String email,String pass)
	{
		if(addUsers!=null)
		{
		for(User user:addUsers)
		{
			if(user!=null)
			{
			if(user.getEmail().equals(email)&&user.getPassword() .equals(pass))
			{
				return true;
			}
			}
		}
		}
		return false;
	}
	
	public String forgotPassWord(String email)
	{
		if(addUsers!=null)
		{
		for(User user :addUsers)
		{
			if(user!=null)
			if(user.getEmail().equals(email))
			{
				return user.getPassword();
			}
		}
		}
		return null;
	}
	
}
