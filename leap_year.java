import java.util.Scanner;

public class leap_year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Year : ");
		int year = sc.nextInt();

		if (year % 4 == 0) {
			if (year % 400 == 0) {
				if (year % 100 == 0) {
					System.out.println("Leap Year : " + year);
				} else {
					System.out.println("Not Leap Year : " + year);
				}
			} else {
				System.out.println("Leap Year : " + year);
			}
		} else {
			System.out.println("Not Leap Year : " + year);
		}
	}
}