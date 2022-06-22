package by.it_academy.tr.linear_programs;

public class Number10 
{

	public static void main(String[] args)
	{
		double x = 2;
		double y = 5;
		
		double otvet = (Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan((x*y));
		System.out.println(otvet);
	}

}
