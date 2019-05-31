import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
public class CalculatorTest {
	Calculator calc;
	
	@Before
	public void setup() {
		calc= new Calculator();
	}
	
    @Test
    public void testAdd() {
        assertEquals("Falied",2, calc.add(1,1));
    }
}