package by.it_academy.tr.cycles;

public class Number10 
{

	public static void main(String[] args)
	{

		long result = 1;
		
		System.out.print("Сумма произведений первых двухсот чисел = ");
		
		for(long i = 1;i<=200;i++) 
		{
			result *= Math.pow(i, 2);
		}
		
		System.out.println(result);
	}

}
