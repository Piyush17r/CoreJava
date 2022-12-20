package coreJava;

import java.util.HashSet;

public class ArrayNumberHashSet {
	public static void main(String[] args) {
		HashSet<Object> list = new HashSet<>();
		list.add("Dhruv");
        list.add("Darshan");
        list.add("Tir	th");
        list.add("Piyush");
        list.add("Romil");
        list.add("Rushit");
        System.out.println(list.size());
	}
}