package newfeatures;

import java.util.*;

/* 
 * forEach() Method In Iterable Interface
Java 8 has introduced a “forEach” method in the interface java.lang.Iterable that can iterate over the elements in the collection. 
“forEach” is a default method defined in the Iterable interface. It is used by the Collection classes that extend the Iterable interface to iterate elements.
The “forEach” method takes the Functional Interface as a single parameter i.e. you can pass Lambda Expression as an argument.
 */
public class foreachdemo {

	public static void main(String[] args) {
		
		List<String> lang = new ArrayList<String>();
	
	lang.add("Java");
	lang.add("Python");
	lang.add("Scala");
	lang.add("HTML");
	lang.add("C++");
	lang.add("Jquery");
	
	System.out.println("--------------------Programming Languages-------------");
	lang.forEach(i -> System.out.println(i));
	
	System.out.println("*************print element using method reference**********");
	lang.forEach(System.out::println);
	
	// i -- input parameter-- left hand side is of lambda operator
	//SOP -  right hand side is method body
	// lambda is basically is a anonymous method i.e method without name
	
	//declaring map of customer Integer is key value and String is name
	Map<Integer,String> Cust = new HashMap<Integer,String>();
	
	//Adding elements into map 
	Cust.put(101, "Alex");
	Cust.put(102, "Ryan");
	Cust.put(103, "Sofia");
	Cust.put(104, "Jenna");
	Cust.put(105, "Laxmi");
	Cust.put(106, "Alok");
	
	System.out.println("------------------ Accoun No. & N ame------------");
	
	Cust.forEach((k,v) -> System.out.println("Customer Id="+ k +"--> Customer Name ="+v));
	
	ArrayList<Integer> arr1 = new ArrayList<Integer>();
	
	arr1.add(1);
	arr1.add(2);
	arr1.add(3);
	arr1.add(4);
	arr1.add(5);

	//Use lambda expression to print element of arraylist
	System.out.println("*********Array list content*********");
	arr1.forEach(i-> System.out.println(i));
	
	//Use lambda expression to print even element of arraylist
	System.out.println("*********Array list Even Numbers*********");
	arr1.forEach(n-> {if(n%2==0) System.out.println(n);});
	}
}
