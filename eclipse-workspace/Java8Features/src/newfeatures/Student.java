package newfeatures;

//pojo class
public class Student {

Integer rollnumber;

String name;
Double marks;
public Student(int rollnumber, String name, double marks) {
	super();
	this.rollnumber = rollnumber;
	this.name = name;
	this.marks = marks;
}

public Integer getRollnumber() {
	return rollnumber;
}
public String getName() {
	return name;
}
public Double getMarks() {
	return marks;
}

}


