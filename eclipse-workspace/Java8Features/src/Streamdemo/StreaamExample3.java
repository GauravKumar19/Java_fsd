package Streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreaamExample3 {

	public static void main(String[] args) {

		List<String> names=new ArrayList<>();
		names.add("Amit");
		names.add("Shekar");
		names.add("Aman");
		names.add("Rahul");
		names.add("Sonam");
		names.add("Salman");
		names.add("Lokesh");
		names.add("Navin");
		
		names.stream().filter((s)->s.startsWith("A")).map(String::toUpperCase)
		.forEach(System.out::println);
		
		System.out.println("**********Sorted Operation*************");
		
		names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
	
		System.out.println("**********New List*************");
	
	    List<String> namesUpperCase = names.stream().sorted().map(String::toUpperCase)
	    		.collect(Collectors.toList());
	    	System.out.println(namesUpperCase);

	    	//Count Operations
	    	
	    	long cnt = names.stream().count();
	    	System.out.println("Number of Elements:" +cnt);
	    	
	    	long cnt1 = names.stream().filter((s)->s.startsWith("A")).count();
	    	System.out.println("Number of names starting with A:" +cnt1);
	    	
	    	//Reduce Operation
	    	Optional<String> red = names.stream().reduce((s1,s2)->s1 + "#"+s2);
	    	red.ifPresent(System.out::println);
	    	
			Integer [] marks = {10,20,50,60,70,};
			int sum= Arrays.stream(marks).reduce(0,(a,b)-> a+b);
			System.out.println("Sum of Marks:"+ sum);
			
			/*Display numbers 1-100
			 * 1,loops
			 * 2.Streams
			 */
			
			for(int i=1;i<=100;i++) {
				System.out.println(i+" ");
			}
			
			System.out.println("***Display number using Integer Stream***");
			
			IntStream.range(1,101).forEach(i->System.out.println(i+" "));
	}
}