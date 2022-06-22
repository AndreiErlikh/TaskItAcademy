package by.it_academy.tr.cycles;

public class Number24 
{

	public static void main(String[] args) 
	{
		int n = 123456;
		int n1=n;
		int count=0;
		int summ=0;
		
		while(n1>0) 
		{
			int n2 = n1%10;
			n1 = n1/10;
			if(n2%2 == 0) 
			{
			summ += n2;
			}
			
			count++;
		}
		System.out.println("Сумма четных чисел = " + summ);
		
		int n3 = n;
		int r = 0;
		
		while(count!=0) 
		{
			int n4 = (n3%10);
			n3 = n3/10;
			
			r += n4*Math.pow(10,count-1);
			count--;
		}
		System.out.println("Число "+ n + " в обратном порядке " + r);
	}

}
