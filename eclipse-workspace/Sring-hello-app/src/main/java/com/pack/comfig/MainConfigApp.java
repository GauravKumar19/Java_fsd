package com.pack.comfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pack.hello.hello;
public class MainConfigApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
ApplicationContext context= new AnnotationConfigApplicationContext(helloconfig.class);
		
		hello he=(hello) context.getBean("hello");
		//System.out.println(he);
	
	he.getMessage();
	}

}
