package coreJava;

import java.util.Enumeration;
import java.util.Vector;

public class Vectoreper {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Vector A = new Vector<>();
		
		A.add("Pi");
		A.add('P');
		A.add(12.25);
		A.add(1212121);
		A.add(-12);
		A.add(12.25);
		
		System.out.println(A);
		System.out.println("Size of Vector : "+A.size());
		
		A.remove(3);
		System.out.println(A);
		System.out.println("Size of Vector : "+A.size());
		
		System.out.println();
		@SuppressWarnings("rawtypes")
		Enumeration dh = A.elements();
		while(dh.hasMoreElements())
		System.out.println(dh.nextElement());
	}
}