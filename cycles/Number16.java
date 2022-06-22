package by.it_academy.tr.cycles;

public class Number16
{

	public static void main(String[] args)
	{
		int summ = 1;
		long answer = 1;
		
		for(int i = 0; i<=10;i++) 
		{
			summ += i;
			answer *= summ;
		}
		System.out.println("Ответ = " + answer);
	}

}
