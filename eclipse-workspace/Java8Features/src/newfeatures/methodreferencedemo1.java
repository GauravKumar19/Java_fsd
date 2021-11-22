package newfeatures;

//Method Reference- Shorthand of lambda reference to call method

@FunctionalInterface
interface myinterface{
	void mymethod();
}

class test //instance class
	{
		void display() //instance method
		{
			
			System.out.println("i am in instance method");
		}
	}
public class methodreferencedemo1 {

	public static void main(String[] args) {
		//Traditional approach
		test t1 = new test();
		t1.display();
		
		
		//Java8 method reference approach
		 myinterface m1ref = t1::display; //method reference to instance method of a object

		 //calling method of FI
		 m1ref.mymethod();
	}

}
