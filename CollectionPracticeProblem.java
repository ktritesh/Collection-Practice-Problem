package com.bridgelabz.collection;

import java.util.*;

public class CollectionPracticeProblem {

	public static void main(String[] args) {
		doList();
		doStack();
		doQueue();
		doSet();
		doMap();
	}
	
	private static void doList() {
		System.out.println("In doList Problem");
		//Creating List
		List<String> l = new LinkedList<>();
		//Adding objects to the list
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
		//Adding objects to the Stack
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
		System.out.println();
		
	}
	
	private static void doQueue() {
		System.out.println("In doQueue problem");
		//Creating Queue
		PriorityQueue<String> q = new PriorityQueue<>();
		//Adding objects to the Queue
		q.add("Ritesh KT");
		q.add("Abhishek Abhinav");
		q.add("Sumit Kr");
		q.add("Vikash Kumar");
		System.out.println("head: "+q.element());
		System.out.println("head: "+q.peek());
		System.out.println("Iterating the queue elements: ");
		
		Iterator<String> itr = q.iterator();
		while(itr.hasNext()) {
			Object element = itr.next();
	        System.out.println(element + " ");	
		}
		q.remove();
		q.poll();
		System.out.println("After removing two elements: ");
		Iterator<String> itr2 = q.iterator();
		while(itr2.hasNext()) {
			Object element = itr2.next();
	        System.out.println(element + " ");	
		}
		System.out.println();
	}
	
	private static void doSet() {
		System.out.println("In doSet problem");
		//Creating Set
		Set<String> s = new LinkedHashSet<>();
		s.add("Amit");
		s.add("Rahul");
		s.add("Prashant");
		s.add("Alpesh");
		
		//Traversing Set through ForEach Loop
		for (String str : s ) {
			System.out.println(str);
		}
		System.out.println();
	}
	
	private static void doMap() {
		System.out.println("In doMap Problem");
		//Creating Map
		Map<Integer, String> m = new HashMap<>();
		m.put(100, "Ritesh");
		m.put(101, "Pawan");
		m.put(102, "Amrit");
		m.put(103, "Niraj");
		
		//Traversing Set through ForEach loop
		for (Map.Entry m1 : m.entrySet()) {
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
	}
}
