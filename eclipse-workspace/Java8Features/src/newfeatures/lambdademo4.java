package newfeatures;

// perform arithmetic operation using lambda
public class lambdademo4 {
	public static void main(String[] args) {
	
		Addition op1=(a,b) -> (a+b);
		System.out.println("addition of two number is :" +op1.calculate(200,155));
		
		Addition op2=(a,b) -> (a-b);
		System.out.println("Subtraction of two number is :" +op2.calculate(200,155));

		
		Addition op3=(a,b) -> (a*b);
		System.out.println("Multiplication of two number is :" +op3.calculate(200,155));

		
		Addition op4=(a,b) -> (a/b);
		System.out.println("Division of two number is :" +op4.calculate(200,155));

		
	}
	
}
