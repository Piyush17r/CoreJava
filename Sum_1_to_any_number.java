package coreJava;

import java.util.Scanner;

public class Sum_1_to_any_number {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		System.out.print("Enter 1 to any number : ");
		int n = sc.nextInt();
		for (int i = 1; i <=n; ++i) {
			sum += i;
		}
		System.out.println("1 to "+n+" Sum is : "+sum);	
	}
}