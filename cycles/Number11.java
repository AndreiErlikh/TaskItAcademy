package by.it_academy.tr.cycles;

public class Number11 
{

	public static void main(String[] args)
	{
		
		long result = 0;
		
		System.out.print("Сумма произведений первых двухсот чисел = ");
		
		for(long i = 1;i<=200;i++) 
		{
			result -= Math.pow(i, 3);
		}
		
		System.out.println(result);
	}

}
