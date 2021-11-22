package testcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import businesscode.Colorbag;

class Colorbagjumit5Test {

	private Colorbag colorBag;
	
	@BeforeEach
	void setUp() throws Exception {
		
		colorBag = new Colorbag();
		colorBag.add("Red");
		colorBag.add("green");
		colorBag.add("yellow");
		colorBag.add("blue");
		colorBag.add("Pink");
		colorBag.add("Brown");
	}

	@Test
	@DisplayName("Added color should be in bag")
	void testAdd() {

		var newcolor = "Aqua";
		colorBag.add(newcolor);
		assertTrue(colorBag.contains(newcolor),"Faliure");
	}

	@Test
	@DisplayName("Remove color should not be in bag")
	void testRemove() {
		var color = "green";
		colorBag.remove(color);
		assertFalse(colorBag.contains(color),"Faliure");
	}

	@Test
	@DisplayName("Color Bag Should be transformed into List")
	void testToList() {
		var mylist =Arrays.asList("Red","Green","Yellow","Blue","Pink","Brown");
		
		var colorList = colorBag.toList();
		
		Collections.sort(mylist);
		Collections.sort(mylist);
		assertEquals(colorList, mylist,"failure");
	}



	@Test
	void testSize() {
		
		int bsize = colorBag.size();
		assertEquals(6,bsize,"failure");
	}

}
