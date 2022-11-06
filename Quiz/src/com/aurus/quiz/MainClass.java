package com.aurus.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MainClass extends Quiz{
	
	private static String name;

	public static void main(String[] args) throws SQLException {
		MainClass main=new MainClass();
		Quiz q=new Quiz();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Full Name :");
		 name=sc.nextLine();
		System.out.println("Hey "+name+ "\n Please read below information carefully");
		System.out.println("You have 10 question and answer should be in capital letter for all question i.e A,B,C,D");
		System.out.println("---Best Of Luck---");
		System.out.println();
		
		q.logic();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_table","root","Reader123*");
			//Display the list of student id,name with score in to console assorting order.
			PreparedStatement stmt =con.prepareStatement("insert into student(student_name,score)values(?,?)");
			stmt.setString(1,MainClass.name); 
			stmt.setInt(2, q.correctAns);	
			int i=stmt.executeUpdate();
			
			stmt.close();
			con.close();
		}
		catch( ClassNotFoundException e){
			e.printStackTrace();
		}
		
	}
		
	}

