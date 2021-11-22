package Assignment;

import java.util.*;

public class LCM { 
	public static void main(String args[])   
	{  
		Scanner sc = new Scanner(System.in);
		
	int a, b , gcd=1 ;  
	 
	System.out.print("enter first number");
	a=sc.nextInt();
	
	System.out.print("enter second number");

	b=sc.nextInt();
	
	for(int i = 1; i <= a && i <= b; ++i)   
	{  
	
	if(a % i == 0 && b % i == 0)  
		
	gcd = i;  
	}  

	int lcm = (a * b) / gcd;  

	System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);  
	}  
	}  

