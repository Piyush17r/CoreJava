package coreJava;

import java.util.Scanner;

public class ASCII_value_of_a_given_character {
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter any Character and see ASCLL Value : ");
			String str = sc.nextLine();
			int c = str.codePointAt(0);
			System.out.print("Characters Values is : "+c);
	}
}