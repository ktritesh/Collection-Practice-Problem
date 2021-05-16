package com.bridgelabz.collection;

import java.util.*;

public class CollectionPracticeProblem {

	public static void main(String[] args) {
		doList();
	}
	
	private static void doList() {
		System.out.println("In doList Problem");
		//Creating List
		List<String> l = new LinkedList<>();
		//Adding object to the list
		l.add("Ritesh");
		l.add("KT");
		l.add("Karan");
		l.add("Vikash");
		
		Iterator<String> itr = l.iterator();
		while(itr.hasNext()) {
			Object element = itr.next();
	        System.out.println(element + " ");
		}
		System.out.println();
	}
}
