package com.lem.datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
	public static List<Integer> reverseLinkedList(List<Integer>list){
		LinkedList<Integer>reversedLinkedList=new LinkedList<Integer>();
		Iterator<Integer>iterator=list.iterator();
		
		
		while (iterator.hasNext()) {
			
			reversedLinkedList.addFirst(iterator.next());
		}
		
		return reversedLinkedList;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list =new LinkedList<Integer>();
		list.add(3);
		list.add(2);
		list.add(5);
		
		System.out.println(reverseLinkedList(list));

	}

}
