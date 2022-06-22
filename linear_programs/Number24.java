package by.it_academy.tr.linear_programs;

public class Number24
{

	public static void main(String[] args) 
	{
		double a = 10.0;
		double b = 5.0;
		double corner = 45.0;
		
		double cornerRad = corner * Math.PI / 180.0;
		double S = (Math.pow(a,2) - Math.pow(b, 2)) * Math.tan(cornerRad)/4;
		
		System.out.println("Плозадь трапеции = " + S);
	}

}
