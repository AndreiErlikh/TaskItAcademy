package by.it_academy.tr.linear_programs;

public class Number5 
{

	public static void main(String[] args)
	{
		Arithmetic.sred(2.0 , 4.0 , 5.0 , 10.0 , 15.0);
	}

}
class Arithmetic
{
	public static double[] sred(double ... N) 
	{

		double result = 0.0;
	
		for(double i:N) 
		{
			result +=i;
		
		}
		System.out.println("Среднее арифметическое = " + result / N.length);	
		
		return N;
	}
}
