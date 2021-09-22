//(c) A+ Computer Science
//www.apluscompsci.com

public class DogRunner
{
	public static void main( String[] args )
	{
	Dog myDog = new Dog("rover");
	System.out.println(myDog.getPeopleAge(7));
	myDog.increaseAgeByOne();
	myDog.increaseAgeByOne();
	System.out.println(myDog.getPeopleAge(11));
	System.out.println(myDog.getName());
	myDog.increaseAgeByOne();
	myDog.increaseAgeByOne();
	myDog.increaseAgeByOne();
	myDog.increaseAgeByOne();
	System.out.println(myDog.getPeopleAge(8));
	System.out.println("");
	Dog g = new Dog( 3, "bob" );
	System.out.println( g.getName() );
	System.out.println( g.getPeopleAge( 5 ) );



	}

}