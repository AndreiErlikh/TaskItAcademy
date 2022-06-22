package by.it_academy.tr.cycles;

public class Number23 
{

	public static void main(String[] args) 
	{
        double a = 0.1;
        double b = 10.0;
        double h = 0.5;
        double y = 0.0;

        System.out.println(" -----------------------");
        System.out.println("|     x     |     y     |");

        for (double i = a; i <= b; i += h) 
        {
            y = 1 / Math.tan(i / 3) + Math.sin(i) / 2;
            System.out.println(" -----------------------");
            System.out.printf("|%-11f|%-11f|\n", i , y);
        }

        System.out.println(" -----------------------");
	}

}
