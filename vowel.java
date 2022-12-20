/*Write a Java program that takes the user to provide a single character from the 
alphabet. Print Vowel or Consonant, depending on the user input. If the user input 
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error 
message.*/
import java.util.Scanner;


public class vowel {

	public vowel() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		char ch;
		System.out.print("Enter Charactor :");
		Scanner p =new Scanner (System.in);
		ch=p.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			
			System.out.print("Charactor Is Vowel");
		}
		else
		{
			System.out.print("Consonant");
		}
		
	}

}
