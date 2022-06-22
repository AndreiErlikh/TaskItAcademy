package by.it_academy.tr.cycles;

public class Number7
{

	public static void main(String[] args) 
	{
		 int a = -4;
		 int b = 7;
	     int h = 1;
	     int y;

	     for (int i = a; i <= b; i += h)
	     {
	    	 if (i > 2)
	    	 {
	    		 y = i;
	    	 } else 
	    	 {
	    		 y = i * (-1);
	    	 }
	    	 
	    	 System.out.println("При х = " + i + " у = " + y);
	     }
	}
}
