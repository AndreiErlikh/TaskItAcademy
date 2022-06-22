package by.it_academy.tr.cycles;

public class Number13
{

	public static void main(String[] args)
	{
        int a = -5;
        int b = 5;
        double y;

        for (double i = a; i <= b; i += 0.5) 
        {

            y = 5 - Math.pow(i, 2) / 2.0;
            System.out.println("Если х = " + i + " то у = " + y);
        }
	}

}
