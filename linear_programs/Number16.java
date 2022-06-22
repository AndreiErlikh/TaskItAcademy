package by.it_academy.tr.linear_programs;

public class Number16 
{

	public static void main(String[] args) 
	{
		
		 int a = 1254;
	     int b = 1;

	     while (a > 0)
	     {
	    	 b = b * (a % 10);
	    	 a = a / 10;
	    	 
	     }
     System.out.println("Произведение цифр числа = " + b);

	}

}