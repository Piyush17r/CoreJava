package coreJava;
import java.util.Scanner;
public class Exercise_1 {
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Your CBSE Board Marks..");
		System.out.println("");
		System.out.print("Enter a English Marks : ");
		float A = sc.nextFloat();
		
		System.out.print("Enter a SCI Marks : ");
		float B = sc.nextFloat();
		
		System.out.print("Enter a Social SCI Marks : ");
		float C = sc.nextFloat();
		
		System.out.print("Enter Maths Marks : ");
		float D = sc.nextFloat();
		
		System.out.println("");
		
		float E = A+B+C+D;
		System.out.println("Your Total Marks is : "+E);
		
		float F = E/4;
		System.out.println("Your Percentage : "+F);
		
		float CGPA = E/40;
		System.out.println("Your CGPA is : "+CGPA);
		
		if(F>70)
		{
			System.out.println("Congratulations!! You Got Distinction");
		}
		else if (F>60)
		{
			System.out.println("You got First Class");
		}
		else if (F>50)
		{
			System.out.println("You got Secound Class");
		}
		else if (F>33)
		{
			System.out.println("Pass Class");
		}
		else
		{
			System.out.println("Fail!!!");
		}
		
		System.out.println("");
		
		//Question : 3
		
		System.out.print("What is your Name : ");
		String name = sc.next();
		System.out.println("Hello " + name + " Have a Nice Day.....");
		
		
		System.out.println("");
		//Question 4
		
		System.out.print("Enter a Number : ");
		System.out.println(sc.hasNextInt());
		
		
		System.out.println("");
		//Question 5
		
      	System.out.println("Enter distance in KM : ");
		double distancekm = sc.nextDouble();
		
		double Y = distancekm * 0.621371;
		System.out.println("The Distance in Miles : "+Y);
	}
}