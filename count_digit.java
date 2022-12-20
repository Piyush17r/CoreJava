//Write a Java program that reads a positive integer and count the number of digits the 
////number.
import java.util.Scanner;
public class count_digit {

	public count_digit() {
		
	}

	public static void main(String[] args) {
		
		int n,count=0;
		System.out.println("Enter Number : ");
		Scanner Sc =new Scanner(System.in); 
		n = Sc.nextInt();
		
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("Number Of Digit Is : "+count);
		String Size = Integer.toString(n);
	}
}
