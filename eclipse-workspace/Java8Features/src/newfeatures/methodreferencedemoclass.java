package newfeatures;

// program to demo method reference to an instance method of a class
@FunctionalInterface
interface Idemo{
	void sum(int x, int y);
}

class calculation{
	
	void addition(int a, int b) {
		System.out.println("The Addition is:"+(a+b));
	}
}
public class methodreferencedemoclass {

	public static void main(String[] args) {

		calculation c1= new calculation();
		
		//using lambda expression
		
		Idemo d1=(a,b)->System.out.println("The Addition is:"+(a+b));
		d1.sum(10, 15);
		
		//Using method Reference
		
		Idemo d2 =c1::addition;
		d2.sum(100,150);
		
	}

}
