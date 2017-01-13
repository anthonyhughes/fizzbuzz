import static org.junit.Assert.*;

import org.junit.Test;

public class ReplaceThreeWithFizzTest {

	@Test
	public void IfNumberIsDivisbleByThreeReturnFizz()
	{
		assertEquals("Fizz", new ReplaceThreeWithFizz().convert(3));
	}
	
	@Test
	public void IfNumberIsNotDivisibleByThreeReturnNumber()
	{
		assertEquals("2", new ReplaceThreeWithFizz().convert(2));
	}
}
