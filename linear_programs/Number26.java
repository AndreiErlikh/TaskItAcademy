package by.it_academy.tr.linear_programs;

public class Number26 
{

	public static void main(String[] args)
	{
		double a = 5;
		double b = 10;
		double corner = 45;
		
		double cornerRad = corner * Math.PI / 180.0;
		double S = (1.0/2.0) * a * b * Math.sin(cornerRad);
		
		System.out.print("Площадь треугольника = "+ S);
	}

}
