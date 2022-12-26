package coreJava;
import java.util.Scanner;

public class Greatest_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Three Number to find Greatest of Them.");
		System.out.print("Enter First Number : ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b = sc.nextInt();
		System.out.print("Enter Third Number : ");
		int c = sc.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println("The Greatest Number is A : " + a);
			} else {
				System.out.println("The Greatest Number is C : " + c);
			}
		} else {
			if (b > c) {
				System.out.println("The Greatest Number is B : " + b);
			} else {
				System.out.println("The Greatest Number is c : " + c);
			}
		}
	}
}