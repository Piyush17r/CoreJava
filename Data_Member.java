package coreJava;

import java.util.Scanner;

class Member {
	int age, sal;
	String name, address;
	double mo;
	Scanner sc = new Scanner(System.in);

	Member() {

	}

	public Member(String name, int age, double mo, String address, int sal) {
		this.name = name;
		this.age = age;
		this.mo = mo;
		this.address = address;
		this.sal = sal;
	}

	public void printname() {
		System.out.print("Enter Name : ");
		name = sc.next();
	}

	public void printAge() {
		System.out.print("Enter Age : ");
		age = sc.nextInt();
	}

	public void printmo() {
		System.out.print("Enter Mobile Number : ");
		mo = sc.nextDouble();
	}

	public void printaddress() {
		System.out.print("Enter Address : ");
		address = sc.next();	
	}
	public void printSalary() {
		System.out.print("Your Salary : ");
		sal = sc.nextInt();
	}
}

public class Data_Member {
	public static void main(String[] args) {
		System.out.println("Data Members");
		System.out.println("...................");
		Member h = new Member();
		h.printname();
		h.printAge();
		h.printmo();
		h.printaddress();
		h.printSalary();
	}
}