package coreJava;
import java.util.ArrayList;

public class Replace_Element_Arraylist {
	public static void main(String[] args) {

		ArrayList<String> shoes = new ArrayList<String>();

		shoes.add("Puma");
		shoes.add("Gucci");
		shoes.add("Armani");

		System.out.println("Original Array List : " + shoes);

		String new_shoes1 = "Reebok";
		String new_shoes2 = "Nike";

		shoes.set(1, new_shoes1);
		shoes.set(2, new_shoes2);

		System.out.println("\nReplace Second & Third Element : ");
		for (int i = 0; i < shoes.size(); i++) {
			System.out.println(shoes.get(i));
		}
	}
}