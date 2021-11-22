package Assignment;
import java.util.*;

public class evenodd {

	public static void main(String[] args) {
		
		int X;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number");
		X= sc.nextInt();
	
		
		
		if(X%2!=0){  
		System.out.println(X);  
		System.out.println("Odd Numbers:");  
		}  
		 
		  

		if(X%2==0){  
		System.out.println(X);  
		System.out.println("Even Numbers:");
	}

	}
}
