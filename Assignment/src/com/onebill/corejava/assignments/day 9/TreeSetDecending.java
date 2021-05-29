package com.onebill.corejava.assignments.day9;


/*TreeSet class implements the Set interface that uses a tree for storage. 
 * It inherits AbstractSet class and implements the NavigableSet interface. 
 * The objects of the TreeSet class are stored in ascending order.
 */
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDecending {

	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>();//Creating a integer treeset
		t.add(10);//adding elements
		t.add(100);
		t.add(36);
		t.add(6);
		System.out.println(t);
		//descendingSet method gives decending order of the treeset
		//NavigableSet<Integer> descendingSet = t.descendingSet();
		TreeSet<Integer> descendingSet = (TreeSet<Integer>) t.descendingSet();  
		System.out.println(descendingSet);
		
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Hello");
		ts.add("Welcome");
		ts.add("To");
		ts.add("The");
		ts.add("Show");
		System.out.println(ts);
		NavigableSet<String> descendingSet2 = ts.descendingSet();
		System.out.println(descendingSet2);
	}

}
