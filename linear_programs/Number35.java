package by.it_academy.tr.linear_programs;

public class Number35 
{

	public static void main(String[] args) 
	{
		int M = 1000;
		int N = 55;
		
		double result = (double) M/N;
        int younger = (int) (result % 10);
        int older = (int) ((result * 10) % 10);
        
        System.out.println(M + " / " + N + " = " + result);
        System.out.println("Старшая цифра дробной части: " + older);
        System.out.println("Младшая цифра целой части: " + younger);
        

	}

}
