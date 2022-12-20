package coreJava;

import java.util.Scanner;

class student{
	static {
		System.out.println("Static block in student class");
	}
	int id;
	int per;
	static String cname = "Tops";
	public void input() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		System.out.println();
		System.out.print("Enter ID : ");
		id = sc.nextInt();
		System.out.print("Enter Per : ");
		per = sc.nextInt();
	}
	public void show() 
	{
		System.out.print("id : "+id+" per : "+per+" name : "+cname);
	}
	public static void another()
	{
		System.out.print("\n\nAnother methods in student class");
	}
}

public class ClassObject {
	static
	{
		System.out.println("Static block in main class");
	}
	public static void main(String[] args) {
		student h1 = new student();
		h1.input();
		h1.show();
		student h2 = new student();
		h2.input();
		h2.show();
		student h3 = new student();
		h3.input();
		h3.show();
		student.another();
	}
}