package com.pack.hello;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");
	      hello obj = (hello)context.getBean("hw");
	      obj.getMessage();
	      obj.showMessage();
	}

}
