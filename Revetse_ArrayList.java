package coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Revetse_ArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Piyush");
		list.add("Bheru");
		list.add("Sunit");
		list.add("Ravi");
		list.add("Mani");
		list.add("Raju");
		
		System.out.println("Before Reversing : "+list);
		
		Collections.reverse(list);
		
		System.out.println("After Reversing : "+list);
	}
}