package coreJava;
import java.util.Iterator;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Sum_and_average {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);

		float sum =0,n=0;
		for(int i=1;i<=5;i++)
		{
			System.out.print("Enter Number ["+i+"] : ");
			float A = sc.nextFloat();
			
			sum = sum + A;
		}
		System.out.print("Sum : "+sum);
		
		System.out.println("");
		n = sum/5;
		System.out.print("Average : "+n);
}
}