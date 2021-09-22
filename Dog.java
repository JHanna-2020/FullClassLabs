//(c) A+ Computer Science
//www.apluscompsci.com

public class Dog
{
  private int age;
  private String name;
	
  public Dog( String n )  
  {
    age = 1;
    name = n;
  }
	public Dog( int a,  String n )
	{
      age = a;
      name = n;


	}
  
  public int increaseAgeByOne()
  {
  	 //fill in this method
    age= age+1;
    return age;
  }
  
  public int getPeopleAge( int val )
  {
  	 int peopleAge = age*val;
  	 return peopleAge;
  }
	
  public int getAge()    {

    return age;
  }
	
  public String getName()    {

    return name;
  }
	
  public String tester()    {
    return "Dog - " + name + " " + age;
  }
}
