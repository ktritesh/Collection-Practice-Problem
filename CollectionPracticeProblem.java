package com.bridgelabz.collection;

import java.util.*;

public class CollectionPracticeProblem {

	public static void main(String[] args) {
		doList();
		doStack();
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
	
	private static void doStack() {
		System.out.println("In doStack problem");
		//Creating Stack
		Stack<String> s = new Stack<>();
		//Adding object to the Stack
		s.push("Amit");
		s.push("Rahul");
		s.push("Ankit");
		s.push("Saurabh");
		String pop = s.pop();
		
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			Object element = itr.next();
	        System.out.println(element + " ");	
		}
		
	}
}
