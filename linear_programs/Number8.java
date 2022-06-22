package by.it_academy.tr.linear_programs;

public class Number8 
{

	public static void main(String[] args)
	{
		double a = 1;
		double c = 2;
		double b = 3;
		
		double otvet = b + (Math.sqrt(Math.pow(b, 2)) + Math.sqrt((4*a*c)))/(2*a) - ((Math.pow(a, 3))*c)+Math.pow(a, -2);
		System.out.println(otvet);
	}

}
