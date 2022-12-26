package coreJava;
import java.util.Scanner;

public class Integer_Computes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Integer Any Number: ");
		int a = sc.nextInt();

		int b, c;
		b = ((10 * a) + a);
		c = ((100 * a) + (10 * a) + a);

		System.out.println("Accepts an Integer and Computes the Value : " + a + " + " + b + " + " + c + ""); // 5+55+555
																												// = 615
	}
}