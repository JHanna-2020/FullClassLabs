//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Triangle
{
	public int sideA, sideB, sideC;
	public double perimeter;

	public Triangle(int a, int b, int c)
	{
		sideA = a;
		sideB = b;
		sideC = c;


	}

	public double calcPerimeter()
	{
		perimeter = sideA + sideB +sideC;
		return perimeter;

	}

	public double getArea( )
	{
		return 0;
	}
}