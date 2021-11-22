package newfeatures;

import java.util.Base64;
import java.util.Scanner;

// java program to encrypt & decrypt
public class Base64demo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String username, password;
		
		System.out.println("*******Welcome to coforge technologies********");
		System.out.println("Enter your Name");
		
		username = s.next();
		System.out.println("Enter your password:");
		
		password = s.next();
		
		//Encoding the string to base64
		String encodedpassword = Base64.getEncoder().encodeToString(password.getBytes());
		
		System.out.println("Login successfully!!!!");
		System.out.println("User Name:" + username);
		System.out.println("Password" +encodedpassword);
		
		System.out.println("*********Decrypt the password********");
		
		//decode Base64 format to Byte array
		
		String decodedpassword = new String(Base64.getDecoder().decode(encodedpassword));
		System.out.println("The Password is:" +decodedpassword);
		
		System.out.println("************ URL Encoding*************");
		
		Base64.Encoder encoder = Base64.getUrlEncoder();
		String eUrl = encoder.encodeToString("https://www.coforge.com/industries/public-sector".getBytes());
		System.out.println("Encode URL: " +eUrl);
	}

}
