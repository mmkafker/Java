/* 
This is a simple program to illustrate the use of exceptions. Standard example of defining a division function, and having it 
throw an arithmetic exception when given zero as a denominator.
*/

public class Except
{
	//Division method. The exception must be included in the method header. Static so as to be called on doubles in the main method.
	public static double divide(double numerator, double denominator) throws ArithmeticException 
	{
		if (denominator == 0.0)
		{
			throw new ArithmeticException("Division by Zero (Attempt to Destroy Universe)");
		}	
		else
		{
			return numerator/denominator;
		}
	}

	//Main method. Give one example of a valid division. Then give invalid division and have it throw the exception.
	public static void main(String[] args)
	{
		//Variables
		double numerator = 1.5;
		double denominatorOne = 1.5;
		double denominatorTwo = 0.0;

		System.out.println("1.5/1.5 = " + divide(numerator,denominatorOne));
		System.out.println("1.5/0 = ");
		divide(numerator, denominatorTwo);
	}
}