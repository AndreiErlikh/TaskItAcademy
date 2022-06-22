package by.it_academy.tr.linear_programs;

public class Number21 
{

	public static void main(String[] args)
	{
		double a = 123.321;
		
		int b = (int) a;
		double c = (a*1000);
		double d = c + b * 0.001;
		
		System.out.println("Начальное число = " + a);
		System.out.println("Конечное число = " + d);
	}

}
