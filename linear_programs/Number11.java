package by.it_academy.tr.linear_programs;

public class Number11
{

	public static void main(String[] args) 
	{
		double a = 3.0;
		double b = 5.0;
		
		double c = Math.sqrt(Math.pow(a, 2)) + Math.sqrt(Math.pow(b, 2));
		double P = a + b + c;
		double S = (a*b)/2;
		
		System.out.println("Периметр = " + P);
		System.out.println("Площадь = " + S);
	}

}
