package com.coforge.training.mockitodemo;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Test;

public class Helloworld {

	@Test
	public void greetTest() {
		
		Idemo d =  mock(Idemo.class); // create mock object if Idemo
		
		
		//style of representing the test
		//when - specifies the behavior
		//then - describe the changes you expect by the specified behavior


		when(d.greet()).thenReturn(Idemo.S);
		System.out.println("Demo Greets"+ d.greet());
		
		assertEquals(d.greet(),Idemo.S);
	}

	}



