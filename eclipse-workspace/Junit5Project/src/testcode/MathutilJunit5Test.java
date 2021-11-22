package testcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import businesscode.Mathutils;
/*The @BeforeAll annotation denotes that the annotated method should be executed before all @Test, @RepeatedTest,
@ParameterizedTest, and @TestFactory methods in the current class. It is executed only once.
*/
	
class MathutilJunit5Test {

	private static List<Integer> vals;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		vals = List.of(2,1,-2,3,-3,-1,0,-2);
	}

	@Test
	@DisplayName("Test some values")
	void testSum() {
		int sum = Mathutils.sum(vals);
		assertEquals(Integer.valueOf(2),sum);
	}

	@Test	
	@DisplayName("Test some positive values")
	void testPositive() {
		var pValue = Mathutils.positive(vals);
		assertEquals(pValue.Listof(2,1,3));
	}

	@Test
	@DisplayName("Test some negative values")
	void testNegative() {
		var pValue = Mathutils.positive(vals);
		assertEquals(pValue.Listof(-2,-1,-2));;
	}

}
