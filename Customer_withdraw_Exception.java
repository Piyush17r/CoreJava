package coreJava;

import java.util.Scanner;

public class Customer_withdraw_Exception {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);  
       //User Input String And concat string
		
		System.out.print("Enter String 1 : ");
		String str = sc.nextLine();
		
		System.out.print("Enter String 2 : ");
		String str1 = sc.nextLine();
		
		System.out.print("Enter String 3 : ");
		@SuppressWarnings("unused")
		String str2 = sc.nextLine();
		
		System.out.println();
		System.out.println(str.concat(str1));
	}
}