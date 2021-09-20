//(c) A+ Computer Science
//www.apluscompsci.com

public class DogRunner
{
	public static void main( String[] args )
	{
	Dog myDog = new Dog("Rover");
	System.out.println(myDog.getPeopleAge(7));
	System.out.println(myDog.increaseAgeByOne());
	System.out.println(myDog.increaseAgeByOne());
	}
}