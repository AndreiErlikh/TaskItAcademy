package by.it_academy.tr.cycles;

public class Number22 
{
	public static void main(String[] args) 
	{
	    double a = 0.0;
        double b = 11.0;
        double h = 0.5;
        double y = 0.0;

        System.out.println(" -----------------------");
        System.out.println("|     x     |     y     |");

        for (double i = a; i <= b; i += h)
        {

            y = Math.sin(i) * Math.sin(i);
            System.out.println(" -----------------------");
            System.out.printf("|%-11f|%-11f|\n", i , y);
        }

        System.out.println(" -----------------------");
	}

}
