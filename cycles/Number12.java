package by.it_academy.tr.cycles;

public class Number12
{

	public static void main(String[] args)
	{
        long N = 1L;
        int an = 1;

        for (int i = 2; i <= 10; i++) {
            an = 6 + an;
            N *= an;
        }

        System.out.println("Произведение первых 10 членов последовательности = " + N);
	}

}
