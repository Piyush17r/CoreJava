package coreJava;

import java.util.ArrayList;
import java.util.List;

public class Search_Array {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
	
		System.out.println(list);
		
		if(list.contains("A")) {
			System.out.println("Found The Element");
		}
		else {
			System.out.println("Data not found");
		}
	}
}