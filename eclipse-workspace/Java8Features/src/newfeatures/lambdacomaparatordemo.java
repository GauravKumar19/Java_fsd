package newfeatures;

import java.util.*;

/*
 * 
Java lambda expression can be used in the collection framework. It provides efficient and concise way to iterate, filter and fetch data.
 */

public class lambdacomaparatordemo {

	public static void main(String[] args) {

		Student s1  = new Student(101,"Ayush",69.);
		Student s2  = new Student(102,"Gaurav",64);
		Student s3  = new Student(103,"Shrishti",75);
		Student s4  = new Student(104,"Rahul",78);
		Student s5  = new Student(105,"Aloo",66);
		
		List<Student> slist = new ArrayList<Student>();
		
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		slist.add(s5);
		
		System.out.println("sort Students based on Names:");
		
		//Implementing lambda expression  to sort user define objects using 
		//comparator inrerfaces's comparator() method
		
		Collections.sort(slist,(st1,st2)->{
			return st1.name.compareTo(st2.name);
			
		});
		
		//enhanced for loop
		for(Student s:slist) {
			
			System.out.println(s.rollnumber+" "+s.name+" "+s.marks);
		}
		
		//sort  in descending order of marks
		System.out.println("***********Descending order based on marks************:");

		Collections.sort(slist,(st1,st2)->{
			return st2.marks.compareTo(st1.marks);
		
	});
		slist.forEach(s-> System.out.println(s.rollnumber+" "+s.name+" "+s.marks));
	}

}

