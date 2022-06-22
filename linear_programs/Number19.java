package by.it_academy.tr.linear_programs;

public class Number19 
{

	public static void main(String[] args) 
	{
		double a = 3;
		
		double S = Math.pow(a, 2) * Math.sqrt(3)/4;
		double h = a * Math.sqrt(3) / 2;
		double rInner = a / (2 * Math.sqrt(3));
		double rOuter = a / Math.sqrt(3);
		
        System.out.println("Площадь треугольника = " + S);
        System.out.println("Высота треугольника = " + h);
        System.out.println("Радиус вписанной окружности = " + rInner);
        System.out.println("Радиус описанной окружности = " + rOuter);
	}

}
