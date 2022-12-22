package coreJava;

import java.util.ArrayList;
import java.util.List;

public class Update_Array {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("H");
		
		System.err.println(list);
		
		list.set(2, "List");
		System.out.println(list);
	}
}