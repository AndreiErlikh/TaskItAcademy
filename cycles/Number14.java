package by.it_academy.tr.cycles;

public class Number14 
{

	public static void main(String[] args)
	{
		double n = 10.0;
        double result = 0.0;

        for (double i = 1; i <= n; i++) 
        {
        	result += 1 / i;
        }
        System.out.println("При n = " + n + " сумма = " + result);
	}

}
