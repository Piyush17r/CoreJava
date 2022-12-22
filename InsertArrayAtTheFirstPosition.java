package coreJava;

import java.util.ArrayList;
import java.util.List;

public class InsertArrayAtTheFirstPosition {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("E");
		
		System.out.println(list);
		list.add(0,"Tirth");
		list.add(3,"Piyush");
		
		System.out.println(list);
	}
}