import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator;

public class AddTest {

	@Test
	public void test() {
		calculator cal = new calculator();
		int result = cal.add(3,4);
		assertEquals( 7 , result);
	}

}
