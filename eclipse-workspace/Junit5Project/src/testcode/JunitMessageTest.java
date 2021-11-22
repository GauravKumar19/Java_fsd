package testcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import businesscode.JunitMessage;

class JunitMessageTest {

	 String message ="Java";
	 
	 JunitMessage jm = new JunitMessage(message);
	 
	@Test
	void testPrintMessage() {
		System.out.println("Junit Message is Printing");
		jm.printMessage();
	}

	@Test
	void testPrintHiMessage() {
		message = "Hi " + message;
		System.out.println("Junit Hi Message is printing ");
		assertEquals(message, jm.printHiMessage());
		System.out.println("Suite Test 1 is successful " + message);
	}

}
