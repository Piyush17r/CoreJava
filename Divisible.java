package coreJava;

import java.util.Scanner;

public class Divisible {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter 1 to any Number and divisible in 3 : ");
		int a = sc.nextInt();
		
		System.out.println("You Enter "+a+" and 0 to "+a+ " Divisible in 3 : ");
		for (int i = 1; i <= a; i++) {
			if(i%3==0)
			{
				System.out.print(i+".");
			}
		}
		System.out.println("\n");
		System.out.print("Enter 1 to any Number and divisible in 5 : ");
		int n = sc.nextInt();
		
		System.out.println("You Enter "+n+" and 0 to "+n+ " Divisible in 5 : ");
		for (int i = 1; i <=n; i++) {
			if(i%5==0)
			{
				System.out.print(i+".");
			}
		}
		System.out.println("\n");
		
		System.out.println("Divisible 3 or 5 : ");
		for (int i = 1; i <=a; i++) {
				if(i%5==0 && i%3==0)
				{
					System.out.print(i+".");
				}
			}
		for(int j = 1; j <= n; j++)
		{
			if(j%5==0 && j%3==0)
			{
				System.out.print(j+",");
			}
		}
	}
}