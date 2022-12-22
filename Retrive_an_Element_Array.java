package coreJava;

import java.util.ArrayList;
import java.util.List;

public class Retrive_an_Element_Array {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Manish");
		list.add("Suresh");
		list.add("Krishna");
		list.add("Shiva");
		list.add("Rama");
		list.add("Hari");
		
		System.out.println(list);
		String element = (String) list.get(0);
		System.out.println("First Element : "+element);
		
		element = (String) list.get(2);
		System.out.println("Third Element : "+element);
	}
}