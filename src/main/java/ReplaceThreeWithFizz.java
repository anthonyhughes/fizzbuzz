import java.lang.Integer;

public class ReplaceThreeWithFizz {

	public String convert(int inputNumber)
	{
		if (inputNumber % 3 == 0)
		{
			return "Fizz";
		}
		else
		{
			return new Integer(inputNumber).toString();
		}
	}
}
