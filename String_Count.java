package coreJava;

import java.util.Scanner;

public class String_Count {
	public static void main(String[] args) {
//		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		System.out.println("length of string : "+s.length());
		sc.close();
	}
}