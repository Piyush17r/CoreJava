package coreJava;
import java.util.Scanner;		//User Input Values
public class User_input 
{
	public static void main(String[] args) {
		
												////Simple Calculator////
		
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);		//User Input Values
				
				System.out.print("Enter A : ");
//				boolean b1 = sc.hasNextInt();				//True and False Boolean
//				System.out.println(b1);
				
				float a = sc.nextFloat();
 				System.out.print("Enter B : ");
				float b = sc.nextFloat();
				System.out.print("Enter C : ");
				float c = sc.nextFloat();
				System.out.print("Enter D : ");
				float d = sc.nextFloat();
						
				System.out.println("");
				
				float y = a+b+c+d;
				System.out.println("Addition : "+y);
				
				float e = a-b-c-d;
				System.out.println("Subtracation : "+e);
				
				float f = a*b*c*d;
				System.out.println("Multiplication : "+f);
				
				float g = a/b/c/d;
				System.out.println("Division : "+g);
				
				float h = a%b%c%d;
				System.out.println("Modulo : "+h);
				
				System.out.println("");
				
				
				//practice//
				System.out.print("Enter Number 1 : ");
				int A = sc.nextInt();
				System.out.print("Enter Number 2 : ");
				int B = sc.nextInt();
				
				int sum = A + B;
				System.out.print("The sum of this Number : ");
				System.out.println(sum);
				
				System.out.println("");
				
				//String
				
				System.out.print("String : ");
				String str = sc.next();
				System.out.println(str);
				
	}
}