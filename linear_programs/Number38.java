package by.it_academy.tr.linear_programs;

public class Number38
{

	public static void main(String[] args) 
	{
		Geometry.task1(1, 1);
		Geometry.task2(1, 3);
		Geometry.task3(5, 8);
	}

}
class Geometry
{
	public static void task1(int x,int y) 
	{
		System.out.print("Точка с координатами (" + x + ", " + y + ") принадлежит закрашенной области - ");
		
		if (y + Math.abs(x) <= 4 && y >= 0)
		{
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
	}	
	public static void task2(int x, int y) 
	{
		System.out.print("\nТочка с координатами (" + x + ", " + y + ") принадлежит закрашенной области - ");
		 
		if ((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4))
		{
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
       
	}
	public static void task3(int x, int y) 
	{
		System.out.print("\nТочка с координатами (" + x + ", " + y + ") принадлежит закрашенной области - ");
		
		if (((x * x + y * y <= 16) && y >= 0 && x >= 0) || ((x * x + y * y <= 25) && y <= 0 && x >= 0))
		{
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
        
	}
}
