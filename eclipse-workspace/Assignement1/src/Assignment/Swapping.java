package Assignment;
import java.util.*;

public class Swapping {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		 System.out.println("Enter numbers to be swapped");
		x= sc.nextInt();
		y= sc.nextInt();
		
		
		x= x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swaping:" + " x = " + x + ", y = " + y);
		
	}
}
