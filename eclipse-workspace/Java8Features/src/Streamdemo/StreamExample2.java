package Streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//Filter Operations on stream
public class StreamExample2 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Jhonny","Mitchel","Tori","Dani");
		
		//create a stream of type string
		
		Stream<String> n = names.stream();
		
		//Intermediate Operation
		Stream<String> ln = n.filter(str->str.length()>3);
		ln.forEach(System.out::println);
		
		System.out.println("**********************************");
		
		//Create a Stream---> Operations---> convert stream back to Collection
		List<String> name1 = names.stream().filter(str->str.length()>4)
				.collect(Collectors.toList());
		
		System.out.println(name1);
		
		List<Integer> grades = new ArrayList<Integer>();
		grades.add(169); 
		grades.add(100);
		grades.add(150);
		grades.add(95);
		grades.add(50);
		grades.add(10);
		
		//Build stream from collection
		Stream<Integer> strm = grades.stream();
		
		List<Integer> gradesEven = strm.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(gradesEven);
	}

}
