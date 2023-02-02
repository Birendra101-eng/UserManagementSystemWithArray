package com.ums.client;

import java.util.Scanner;

import com.ums.dao.impl.UserDAOImpl;

public class UserClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		UserDAOImpl daoImpl=new UserDAOImpl(); 
		while(true)
		{
System.out.println("----------------------------------------------------------");
System.out.println("           1)CreateAccount                                     ");
System.out.println("           2)SignIn                                     ");
System.out.println("           3)ForGotPassWord                                     ");
System.out.println("           4)Exit                                     ");


System.out.println("----------------------------------------------------------");

System.out.println("Enter The Choice");
int choice=sc.nextInt();
switch(choice)
{
	case 1:
		daoImpl.register();
		break;
	case 2:
		System.out.println("Enter Email");
		String email=sc.next();
		System.out.println("Enter Password");
		String pass=sc.next();
		boolean verifyEmailAndPassWord = daoImpl.verifyEmailAndPassWord(email, pass);
if(verifyEmailAndPassWord)
{
	System.out.println("Valid user");
}
else
	System.out.println("In-Valid user");

break;
	case 3:
		System.out.println("Enter Email");
		String forgotPassWord = daoImpl.forgotPassWord(sc.next());

		System.out.println("Your Password  is : "+forgotPassWord);
break;
	case 4:
		System.out.println("Thx for visting Us !");
		System.exit(0);
	default:
		System.out.println("Choose 1 to 4 Between");
		
}

	}
		
		
		
		
	}//end of while
}
