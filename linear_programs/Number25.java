package by.it_academy.tr.linear_programs;

public class Number25 
{

	public static void main(String[] args)
	{
        double a = 5;
        double b = 3;
        double c = -2;

        double d = b * b - 4 * a * c;
        double x1 = (- b + Math.sqrt(d)) / (2 * a);
        double x2 = (- b - Math.sqrt(d)) / (2 * a);

        System.out.println("x1 = " + x1 + ", x2 = " + x2);
	}

}
