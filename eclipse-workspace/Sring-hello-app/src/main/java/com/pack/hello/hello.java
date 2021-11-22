package com.pack.hello;

public class hello {
	private String message;

	   public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   public void showMessage()

	   {
		   System.out.println("Hello Spring inside showMessage()...");
		   
	   }
}
