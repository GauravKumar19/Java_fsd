package Assignment;
import java.util.*;


public class INteger{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
int a=sc.nextInt();
System.out.println("You entered "+ a);
int firstDigit=a%10;
int remaining=a/10;
int secondDigit=remaining%10;
remaining=remaining/10;
int thirdDigit=remaining%10;
remaining=remaining/10;
int fourthDigit=remaining%10;

int sum= firstDigit+secondDigit+thirdDigit+fourthDigit;
System.out.println("The sum is: "+ sum);

}
}
