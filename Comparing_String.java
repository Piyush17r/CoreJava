package coreJava;

import java.util.Scanner;

public class Comparing_String {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
//		String s = "Tops ";
//		String s1 = "Technologies!";
//		System.out.println(s.concat(s1));
//		System.out.println("Compare String Result in Boolean Value : "+s.equals(s1));
		
		
		//User input String and Compare String True or False 
		
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		System.out.print("Enter a String : ");
		String str2 = sc.nextLine();
		
		System.out.println("Compare String Result in Boolean Value : "+str.equals(str2));
	}

}