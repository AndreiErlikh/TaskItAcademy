package by.it_academy.tr.linear_programs;

public class Number34 
{

	public static void main(String[] args)
	{
        long initBytes = 9999999999L;

        double kBytes = initBytes / Math.pow(2, 10);
        double mBytes = initBytes / Math.pow(2, 20);
        double gBytes = initBytes / Math.pow(2, 30);
        double tBytes = initBytes / Math.pow(2, 40);
        double pBytes = initBytes / Math.pow(2, 50);

        System.out.println(initBytes + " байт");

        System.out.println(kBytes + " Кб");
        System.out.println(mBytes + " Мб");
        System.out.println(gBytes + " Гб");
        System.out.println(tBytes + " Тб");
        System.out.println(pBytes + " Пб");
	}

}
