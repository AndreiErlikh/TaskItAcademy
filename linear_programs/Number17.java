package by.it_academy.tr.linear_programs;

public class Number17
{

	public static void main(String[] args)
	{
		double a = 3;
		double b = 4;
		
		double sredArifm = (Math.pow(a, 1/3) + Math.pow(b, 1/3))/2;
		double sredGeom = Math.sqrt(Math.abs(a) * Math.abs(b));
		
		System.out.println("Среднее арифметическое кубов чисел = " + sredArifm);
		System.out.println("Среднее геометрическое модулей чисел = " + sredGeom);
	}

}
