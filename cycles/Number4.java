package by.it_academy.tr.cycles;

public class Number4 
{

	public static void main(String[] args) 
	{
		int i = 2;
		
		System.out.println( "Все четные числа от 2 до 100 : " );
		
		while(i<=100) 
		{
			if (i % 2 == 0) 
			{
				System.out.println(i);
			}
			i++;
		}
	}

}
