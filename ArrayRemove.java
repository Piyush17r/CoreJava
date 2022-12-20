package coreJava;

import java.util.ArrayList;

public class ArrayRemove {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		list.add(12);
		list.add("Piyush");
		list.add('P');
		list.add(-12);
		list.add(12345678);
		System.out.println("Before Remove Array : "+list);
		list.remove(3);
		System.out.println("\nAfter Remove Array : "+list);
	}
}