package studentdatabaseapplication;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student First Name: ");
		this.firstName = sc.nextLine();
		
		System.out.print("Enter Student Last Name: ");
		this.lastName = sc.nextLine();
		
		System.out.print("1 - Martic\n2 - Intermediate\n3 - B.tech\n4 - M.tech\nEnter Student class level: ");
		this.gradeYear = sc.nextInt();
		
		setStudentID();
	}
	
	//Generate an ID
	private void setStudentID() {
		// Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;
		
	}
	
	public void enroll() {
		do {
			System.out.print("Enter Course to enroll (Q TO quit): ");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				//System.out.println("BREAK!");
				break;
			}
		} while(1 != 0);
		
	}
	
	//View Balance
	public void viewBalance() {
		System.out.println("Your Balance is: $" + tuitionBalance);
		
	}
	
	//Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter yout payment: ");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	// Show Status
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: " + gradeYear + 
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses + 
				"\nBalance: $" + tuitionBalance;
	}
	
}
