package by.it_academy.tr.cycles;

public class Number9
{

	public static void main(String[] args) 
	{
		double result = 0;
		
		System.out.print("Сумма квадратов первых ста чисел = ");
		
		for(double i = 1;i<=100;i++) 
		{
			result += Math.pow(i, 2);
		}
		
		System.out.println(result);
	}

}
