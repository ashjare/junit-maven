import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator;

public class MultiplyTest {

	@Test
	public void test() {
		calculator cal = new calculator();
		int result = cal.mul(3,4);
		assertEquals( 12 , result);
	}

}
