package com.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.service.Service;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Welcome to Hospital");
		System.out.println("1.View Patient Data");
		System.out.println("2.Insert Patient Data");
		System.out.println("3.Update Patient Data");
		System.out.println("4.Delete Patient data");
		System.out.println("5.View Doctor Data");
		System.out.println("6.Insert Doctor Data");
		System.out.println("7.Update Doctor Data");
		System.out.println("8.Delete Doctor data");
		do
		{
		System.out.println("enter the choice");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Patient Data");
			new Service().view();
			break;
		case 2:
			System.out.println("Insert Patient Data");
			new Service().insertPatient();
			break;
		case 3:
			System.out.println("Update Patient Data");
			new Service().updatePatient();
			break;
		case 4:
			System.out.println("Delete Patient Data");
			new Service().deletePatient();
			break;
		case 5:
			System.out.println("Doctor Data");
			new Service().viewdoctor();
			break;
		case 6:
			System.out.println("Insert Doctor Data");
			new Service().insertDoctor();
			break;
		case 7:
			System.out.println("Update Doctor Data");
			new Service().updateDoctor();
			break;
		case 8:
			System.out.println("Update Doctor Data");
			new Service().deleteDoctor();
			break;
		}
		
		System.out.println("do you want to continue");
           s=sc.next();
           sc.close();
	}
	while(s.equals("y"));
	}

	}


