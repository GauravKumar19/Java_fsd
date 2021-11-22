package newfeatures;


//Functional Interface
@FunctionalInterface
interface myFI{
	
	public String sayHello();
}

public class lambdademo1 {

	public static void main(String[] args) {

		/*functional interface object*/myFI msg = () -> { return "Hello world";};
		System.out.println(msg.sayHello());
	}

}
