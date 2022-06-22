package by.it_academy.tr.linear_programs;

public class Number13 
{

	public static void main(String[] args) 
	{
		 double x1 = 1;
		 double x2 = 2;
		 double x3 = 3;
		 double y1 = 2;
		 double y2 = 1;
		 double y3 = 3;
				   
		 double a = Math.sqrt( Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
		 double b = Math.sqrt( Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		 double c = Math.sqrt( Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		
		 double P = a + b + c;
		 double halfP = P / 2.0;
		 double S = Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
		 
	     System.out.println("Периметр треугольника P = " + P);
	     System.out.println("Площадь треугольника S = " + S);
	}

}
