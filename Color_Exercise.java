package coreJava;

import java.util.Scanner;

@SuppressWarnings("unused")
public class Color_Exercise {
	public static void main(String[] args) {
		String st1 = "Red is favorite color.";
        String st2 = "Orange is also my favorite color.";

        String start = "Red";

        boolean starts1 = st1.startsWith(start);
        boolean starts2 = st2.startsWith(start);

        System.out.println( st1 + " starts with " + start + "? : " + starts1);
        System.out.println(st2 + " starts with " + start + "? : " + starts2);
	}	
}