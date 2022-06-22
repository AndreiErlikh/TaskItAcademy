package by.it_academy.tr.cycles;

public class Number5
{

	public static void main(String[] args) 
	{
		int i = 1;
		int summ = 0;
		
		System.out.println( "Все нечетные числа от 1 до 99 : " );
		
		while(i<=99) 
		{
		
			if(i%2 != 0) 
			{
				summ += i;
				System.out.println(i);
			}
			i++;
			
		}
		
		System.out.println("Сумма нечетных чисел от 1 до 99 = " + summ);
	}

}
