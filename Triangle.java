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
		double s = perimeter/2;
		double side1 = s-sideA;
		double side2 = s-sideB;
		double side3 = s-sideC;

		double result = Math.sqrt(s*side1*side2*side3);

		return result ;
	}
}