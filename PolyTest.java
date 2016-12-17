/*The goal of this file is to implement a succesful polymorphism. Polymorphism presupposes a hierarchy of classes related to each other through 
inheritance. The idea is that a a call to a member method will cause a different implementation to be executed, depending on the type of the object
invoking the method (i.e. superclass or subclass).*/

//Superclass
class Computer
{
	//Constructor
	Computer()
	{
		//System.out.println("The superclass's constructor has run without issue");
	}
	//Variables all computers will have
	protected Boolean screen = true;
	protected Boolean keyboard = true;

	//Methods to test attributes
	void hasScreen()
	{
		if (this.screen == true)
		{
			System.out.println("Yes");
		}
		else { System.out.println("No"); }
	}
	void hasKeyboard()
	{
		if (this.keyboard == true)
		{
			System.out.println("Yes");
		}
		else { System.out.println("No"); }
	}

	void software()
	{
		System.out.println("This depends on the machine");
	}
}

class Mac extends Computer
{
	Mac()
	{
		//System.out.println("The subclass' constuctor has compiled without issue");
	}

	void software()
	{
		System.out.println("OS X");
	}

}


public class PolyTest
{
	public static void main(String[] args)
	{
		Computer pc = new Computer();
		Mac mbp = new Mac();
		Mac 


		System.out.print("There is a computer called pc. The pc's software, written pc.software() is, ");
		pc.software();


		System.out.print("There is a Mac, which is a type of Computer, called mbp. The Mac's software, written mpb.software() is, ");
		mbp.software();		
		//System.out.println("There is a Mac computer called mbp. The Mac's software, written mbp.software(), is, " + );


	}
	

}