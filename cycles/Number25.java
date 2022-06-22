package by.it_academy.tr.cycles;

public class Number25
{

	public static void main(String[] args)
	{
		F.task(10);
	}

}

class F
{
	public static void task(int a) 
	{
		int factor = 1;
        if (a != 0)
        {
        	
        	for (int i = 1; i <= a; i++)
        	{
        		factor *= i;
        	}
        	 
        } else 
        {
        	factor = 1;
        }

        System.out.println("Факториал числа " + a + " = " + factor);
	}
}
