/* Abstract class test. The goal of this example is to have a subclass inherit from an abstract class, and give definitions for the abstract
methods. 

The abstract class will represent some overgeneralize abstraction of an animal. Abstract methods will be type of animal, habitat, and mode of
transportation, seeing as these don't really have general answers for all animals. The subclass, in this case fish, will disambiguate.*/

abstract class Animal
{
	//General characteristics of animal
	protected String type;
	protected String mvmt;
	protected String home;

	//Actions corresponding to general characteristics
	abstract String species();
	abstract String moves();
	abstract String lives();
}	

//Inherits from abstract class.
class Fish extends Animal
{
	//Constructor specifies what the general characteristics from the abstract class mean for a fish
	Fish()
	{
		this.type = "fish";
		this.mvmt = "swims";
		this.home = "ocean";
	}

	//Methods which print out each characteristic
	String species()
	{
		return type;
	}
	String moves()
	{
		return mvmt;
	}
	String lives()
	{
		return home;
	}

}


public class AbsTest
{	
	//Show that the inheritance has worked
	public static void main(String[] args)
	{
		Fish nemo = new Fish();

		System.out.println("Nemo is a " + nemo.species() );

		System.out.println("Nemo lives in the " + nemo.lives() );

		System.out.println("To get to work, Nemo " + nemo.moves() );
	}
	

}