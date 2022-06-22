package by.it_academy.tr.cycles;

public class Number19 
{

	public static void main(String[] args) 
	{
		 double sum = 0.0;
	     double e = 0.2;
	     double an = 0.0;
	     int n = 10;

	     for (int i = 0; i <= n; i++)
	     {
	    	 an = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
	    	 if (Math.abs(an) >= e ){
	                sum += an;
	            }
	        }

	        System.out.println("Сумма = " + sum);
	}

}
