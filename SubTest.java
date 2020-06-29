import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator;

public class SubTest {

	@Test
	public void test() {
		calculator cal = new calculator();
		int result = cal.sub(3,4);
		assertEquals( -1 , result);
	}

}
