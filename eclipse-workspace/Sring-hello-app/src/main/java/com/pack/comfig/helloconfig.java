package com.pack.comfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pack.hello.hello;

@Configuration
public class helloconfig {
	
	@Bean(name="hello")
	public hello getHello()
	{
		hello hw=new hello();
		hw.setMessage("Hello through Java configuration..");
		
		return hw;
		
	}
}
