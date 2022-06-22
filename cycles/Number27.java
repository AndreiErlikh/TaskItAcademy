package by.it_academy.tr.cycles;

public class Number27
{

	public static void main(String[] args)
	{
		int m = 20;
		int n = 100;
		int b = m;
		
		for(int i=b;i<n;i++) 
		{
			
			for(int i2 = 2;i2<b;i2++) 
			{
				if(i%i2 == 0) 
				{
					System.out.println("Делитель числа " + i + " = " + i2);
				}
			}
			b++;
		}
		
	} 
}



