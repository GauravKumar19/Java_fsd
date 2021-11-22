package com.company;
import java.util.*;

public class firstclass {

	
	
	    void addition(int x, int y) {
		int result = x + y;
		
		System.out.println(result);
	}
	
	void multiplication(int x, int y) {
		
		int result = x * y;
		
		System.out.println(result);
	}
	void division(int x, int y) {
		int result = x / y;
		
		System.out.println(result);
	
	}
	void subtraction(int x, int y) {
		int result = x - y;
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		firstclass ob = new firstclass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");

		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");

		int num2 = sc.nextInt();
		
		System.out.println("Enter operation to be perform");
		
		int choose = sc. nextInt();

		switch(choose) {
		
		case 1 :
				ob.addition( num1, num2);
				break;
		case 2 :
			ob.multiplication( num1, num2);
			break;
		case 3 :
			ob.division( num1, num2);
			break;
		case 4  :
			ob.subtraction( num1, num2);
			break;
			
		default :
			System.out.println("Enter right choice");
				break;
		}
		
	}

}
