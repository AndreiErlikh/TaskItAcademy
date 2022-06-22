package by.it_academy.tr.linear_programs;

public class Number40 
{

	public static void main(String[] args) 
	{
		double x = 5.0;

        double temp1 = 2 * x + 4 * x * x * x;
        double temp2 = 3 * x * x;

        double summ1 = - temp1 + temp2;
        double summ2 = temp1 + temp2 + 1;
        
        System.out.println("При х = " + x + " значения выражений = " + summ1 + " и " + summ2);
	}

}
