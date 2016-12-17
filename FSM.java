/* Goal is to make a program of a finite state machine that we used in my discrete math class. Specifically,
if implemented correctly, this should work as a transducer. Not intended to be elegant. Wanted to
double check a homework problem. Pretty simple machine overall.

I have the inputs, outputs, and states defined as variables, even though I never actually use them.
The function "output" is based on a Moore machine output function, f:S ––> O.
The function "transition" represents, obviously, the transition-state function from (SxI) ––> S */

public class FSM
{
	//Define the input, output, and state sets
	int[] inputs = {0 , 1};
	char[] outputs = {'a', 'b' , 'c'};
	String[] states = {"S0" , "S1" , "S2"};

	//Output function
	static char output(String state)
	{
		switch(state)
		{
			case "S0":
				return 'c';

			case "S1":
				return 'a';

			case "S2":
				return 'b';
			default:
				return '?';
		}
	}

	//State-Transition Function
	static String transition(String state , String input)
	{
		switch(state)
		{
			case "S0":
				switch(input)
				{
					case "0":
						return "S1";
					case "1":
						return "S0";
				}
			case "S1":
				switch(input)
				{
					case "0":
						return "S1";
					case "1":
						return "S2";
				}
			case "S2":
				switch(input)
				{
					case "0":
						return "S1";
					case "1":
						return "S0";
				}
			default:
				return "Some invalid combination of inputs";
		}
	}

	//This method first invokes the transition-state function, then appends its output to some result string.
	public static String transduce(String inputString)
	{
		String input = inputString;
		String result = "";
		String currentState = "S0";

		for (int i = 0; i < input.length(); i++)
		{
			currentState = transition(currentState, String.valueOf(input.charAt(i)));
			result += output(currentState);
		}

		return result;	
	}

	public static void main(String[] args)
	{
		System.out.println(transduce("011010111111100101")); //Works!
	}

}