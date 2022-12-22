package coreJava;

import java.util.ArrayList;
import java.util.List;

public class Join_Two_Array {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Sonu");
		list.add("Deepak");
		list.add("Mayur");
		list.add("Rishi");
		list.add("Bheru");
		list.add("Raju");
		System.out.println("List of First : "+list);
		
		List<String> list1 = new ArrayList<String>();
		
		list1.add("Ravi");
		list1.add("Piyush");
		list1.add("sonu");
		list1.add("Rana");
		list1.add("Jatt");
		list1.add("Bheru");
		System.out.println("List of Secound : "+list1);
		
		ArrayList<Object> dh = new ArrayList<>();
		dh.addAll(list);
		dh.addAll(list1);
		
		System.out.println("New Array : "+dh);
	}
}