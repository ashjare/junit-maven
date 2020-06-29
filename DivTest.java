import static org.junit.Assert.*;

import org.junit.Test;
import com.calculator;

public class DivTest {

	@Test
	public void test() {
		calculator cal = new calculator();
		double result = cal.div(8,4);
		assertEquals(2, result, 0.001);
	}

}
