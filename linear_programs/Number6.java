package by.it_academy.tr.linear_programs;

public class Number6 
{

	public static void main(String[] args)
	{
		MilkTin.tin(10.0);
	}

}
class MilkTin 
{
	public static void tin(double n) 
	{
		double liter = 80.0;
		double mDifference = 12.0;
		
		Double mTin =  (liter/n + mDifference);
		
		System.out.println("Если малых бидонов = " + n + ", в больших бидонах m = " + mTin);
	}	
}
