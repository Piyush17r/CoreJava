package coreJava;

import java.util.HashSet;
import java.util.Iterator;

public class ArrayHashList {
	public static void main(String[] args) {
		HashSet<Object> list = new HashSet<>();
		list.add("Dhruv");
        list.add("Darshan");
        list.add("Tirth");
        list.add("Piyush");
        list.add("Romil");
        list.add("Rushit");
        
        Iterator<Object> dh = list.iterator();
        while(dh.hasNext()) {
        	System.out.println(dh.next());
        }
	}
}