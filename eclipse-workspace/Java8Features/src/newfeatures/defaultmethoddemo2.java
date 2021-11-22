package newfeatures;

import java.time.LocalDate;

//java 8 allows to add functionality to interfaces
interface Parser{

	default void parse(){
    System.out.println("default Parsing logic");

	} 
	
	static void displaydate() {
		
		System.out.println(LocalDate.now());
	}
}

class textparser implements Parser{
	
	//this will inherit the default implementation of Parse
	public void display(){
	  System.out.println("Parsing text Files");
	}
}
class XMLParser implements Parser{
	
	//Overridden method
	public void parse(){
	    System.out.println("parsing XML Files");

		} 
}

public class defaultmethoddemo2 {

	public static void main(String[] args) {
		
		Parser p = new textparser(); //Up casting
		p.parse();// invoke default method in interface
		
		textparser p1 = new textparser();// reference child class text parser
		p1.display();
		
		p=new XMLParser();// References XML object child class
		p.parse(); //invoking overridden method
		
		System.out.println("Program exctue at");
		Parser.displaydate();//invoke static method
	}

}
