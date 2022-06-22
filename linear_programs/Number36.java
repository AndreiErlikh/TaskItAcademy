package by.it_academy.tr.linear_programs;

public class Number36
{

	public static void main(String[] args)
	{
		int n = 1234;
		int chet = 1;
		int nechet = 1;
		
		
		
		while(n != 0) 
		{
			int a = n%10;
			n = n/10;
			if(a%2 == 0) 
			{
				chet *= a;
			}
			else
			{
				nechet *=a;
			}
		}

		System.out.println("Частное произведение четных и нечетных цифр четырехзначного числа " + n + " = "
		                   + (double)chet/(double)nechet);
	}

}
