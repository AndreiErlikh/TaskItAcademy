package by.it_academy.tr.cycles;

public class Number18 
{

	public static void main(String[] args)
	{

		int a = 198354345;
		int e = 6;
		int summ = 0;
		while(a!=0) 
		{
			int del = a%10;
			a = a/10;
			
			if(Math.abs(del) >= e) 
			{
				summ+=del;
			}
		}
		System.out.println("сумма = " + summ);
	}

}
