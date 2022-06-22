package by.it_academy.tr.cycles;


public class Number29
{

	public static void main(String[] args) 
	{
		int a = 21345;
		int b = 12554;
		
		int a1 = a;
		while(a1>0) 
		{
			int b1=b;
			int ia = a1%10;
			
			while(b1>0)
			{
				int ib = b1%10;
			
				if(ia == ib) 
				{
					System.out.println("Цифра = " + ia +" есть у "+ a + " и " + b);
				}
			
				b1 = b1/10;
		}
			a1 = a1/10;
		}
	}	
	
}