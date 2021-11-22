package Streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamexample1 {

	public static void main(String[] args) {

		Integer [] marks = {10,20,50,60,70,};
		
		//Build streams form arrays
		Stream<Integer> stream = Stream.of(marks);
		
		stream.forEach(i->System.out.println(i));
		
		//Build stream from collection
		List<Integer> grades = new ArrayList<Integer>();
		grades.add(169); 
		grades.add(100);
		grades.add(150);
		grades.add(95);
		grades.add(50);
		grades.add(10);
		
		Stream<Integer> strm = grades.stream();
		//strm.forEach(i->System.out.println(i));
		
		System.out.println("************ArrauList Content*********");
		strm.forEach(System.out::println);
		
		List<Integer> squares = grades.stream().map(m-> m*m).collect(Collectors.toList());
		System.out.println("*************Double of Grades**********");
		System.out.println(squares);
	}

}
