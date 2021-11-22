package Assignment;
import java.util.*;

public class removecharacter {

	

		public static void main(String[] args) {
			
			String s;
			
			 Scanner in = new Scanner(System.in);
		        System.out.print("Input the string:");
		        String str = in.nextLine();
		        
		        System.out.print("Input the Character to remove:");
		        s = in.nextLine();

			System.out.println(str.replace(s, ""));
			
					}

	
}
