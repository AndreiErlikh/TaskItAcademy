package by.it_academy.tr.cycles;

public class Number8
{

	public static void main(String[] args)
	{
		int a = -5;
        int b = 12;
        int h = 1;
        int c = 1;
        int y;

        for (int i = a; i <= b; i += h)
        {
            if (i == 15) 
            {
                y = (i + c) * 2;
            } else
            {
                y = (i - c) + 6;
            }
            
            System.out.println("При х = " + i + " у = " + y);
        }	
	}

}
