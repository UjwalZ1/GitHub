package com.aurus.quiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz {
	int correctAns=0;
	int wrongAns=0;
	Scanner sc=new Scanner(System.in);
	
	public void logic() {
		Questions q1=new Questions("Q. What is the extension for java file?","A. .txt","B. .java","C. .xlsx","D. .csv");
		Questions q2=new Questions("Q. Number of primitive data types in Java are?","A. 8","B. 7","C. 5","D. 9");
		Questions q3=new Questions("Q. When is the object created with new keyword?","A. Run time","B. Compile time","C. Depends on code","D. None");
		Questions q4=new Questions("Q. In which of the following is toString() method defined?","A. java.lang.String","B. java.util.*","C. java.lang.Object","D.java.math.*");
		Questions q5=new Questions("Q. Total constructor string class have?.","A. 3","B. 7","C. 13","D. 1");
		Questions q6=new Questions("Q. Identify the return type of a method that does not return any value.","A. int","B. void","C. double","D. char");
		Questions q7=new Questions("Q. Output of Math.floor(3.6)?","A. 4","B. 4.0","C. 3.6","D. 3.0");
		Questions q8=new Questions("Q. What is Runnable?","A. Interface","B. Class","C. Object","D. Method");
		Questions q9=new Questions("Q. Which of the following exception is thrown when divided by zero statement is executed?.","A. NullPointerException","B. NumberFormatException","C. ArithmaticException","D. None of this");
		Questions q10=new Questions("Q. Which of the following is used to find and fix bugs in the program?","A. JVM","B. JRE","C. JDB","D. JDK");
		Map<Questions,Character> hmap=new HashMap<>();
		hmap.put(q1, 'B');
		hmap.put(q2, 'A');
		hmap.put(q3, 'A');
		hmap.put(q4, 'C');
		hmap.put(q5, 'C');
		hmap.put(q6, 'B');
		hmap.put(q7, 'D');
		hmap.put(q8, 'A');
		hmap.put(q9, 'C');
		hmap.put(q10, 'C');
		
		
		for(Map.Entry<Questions,Character> map:hmap.entrySet()) {
			System.out.println(map.getKey().getQuestion());
			System.out.println(map.getKey().getOption1());
			System.out.println(map.getKey().getOption2());
			System.out.println(map.getKey().getOption3());
			System.out.println(map.getKey().getOption4());
			System.out.println();
			System.out.println("Enter your answer");
			Character ans=sc.next().charAt(0);
			int ansc=Character.compare(ans,map.getValue());
			if(ans=='A' ||ans=='B' || ans=='C' || ans=='D') {
			if(ansc==0) {
				System.out.println("Correct");
				System.out.println();

				correctAns++;
			}
			else {
				System.out.println("Wrong");
				System.out.println();

				wrongAns++;
			}
			}
			else {
				System.out.println("You entered wrong answer");
			}
		}
		System.out.println("Your Result is below");
		System.out.println("Total number of questions " +hmap.size());
		System.out.println("Correct answer "+correctAns);
		System.out.println("Wrong Answer "+wrongAns);
	}

}
