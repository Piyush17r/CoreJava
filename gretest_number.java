import java.util.Scanner;

//Write a Java program to Take three numbers from the user and print the greatest 
//number.
public class gretest_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number");
		int x = sc.nextInt();
		System.out.println("Enter The Secent Number");
		int y =sc.nextInt();
		System.out.println("Enter The Third Number");
		int z = sc.nextInt();
		if(x>y)
			if(y>z)
				
			{
				System.out.println("Gretest Number :"+x);
			}		
		if(y>x)
			if (y>z)
			{
				System.out.println("Gretest Number :"+y);
			}
		if(z>x)
			if(z>y)
			{
				System.out.println("Gretest Number :"+z);
			}
			
	}
}
