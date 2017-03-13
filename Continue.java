//Returns a simple continued fraction expansion when given a rational number. Continued fraction represented in list form.

import java.util.*;

public class Continue
{
	/*
	The "expand" function actually computes the continued fraction. Takes in the (integral) numerator and denominator separately.
	Also takes in the ArrayList in which the continued fraction will be represented.

	The expansion is performed recursively. It works by separating the division into quotient and remainder.
	(1) The quotient is obtained via integer division, and is subsequently added to the list. The remainder is then itself expanded.


	The remainder takes the value (numerator%denominator)/denominator. If the remainder is 0––(2)––the program terminates and returns the 
	ArrayList.

	If the remainder is nonzero, the fact that remainder = 1/(1/remainder) is used. Then, 1/remainder is subsequently expanded––(3)––
	and the process repeats. With each call of expand(), the integer part of the fraction in question is appended to the
	ArrayList. 
	*/

	public static ArrayList<Integer> expand(int numer, int denom, ArrayList<Integer> listy)
	{
		listy.add(numer/denom);		//(1)

		if (numer % denom == 0)
		{
			return listy; 			//(2)
		}
		else
		{
			expand(denom , numer%denom , listy); 		//(3)
		}

		return listy;
	}

	//Only to make the output prettier
	public static void continuedFrac(int numerator, int denominator, ArrayList<Integer> listito)
	{
		System.out.print("The continued fraction expansion of " + numerator + "/" + denominator + " is ");
		System.out.println(expand(numerator, denominator, listito));
	}

	//Some examples
	public static void main(String[] args)
	{
		ArrayList<Integer> listerton0 = new ArrayList<>();
		ArrayList<Integer> listerton1 = new ArrayList<>();
		ArrayList<Integer> listerton2 = new ArrayList<>();

		continuedFrac(0 , 1 , listerton0);
		continuedFrac(293, 8 , listerton1);
		continuedFrac(185678994, 7 , listerton2);
	}
}