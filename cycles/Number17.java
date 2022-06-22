package by.it_academy.tr.cycles;

public class Number17 
{

	public static void main(String[] args) 
	{
		int n = 8;
        double a = 2.5;
        double composition = 1;

        for (int i = 0; i < n; i++)
        {
            composition *= a + i;
        }
        
        System.out.println("Произведение равно " + composition);
	}

}
