package by.it_academy.tr.cycles;

public class Number6 
{

	public static void main(String[] args)
	{
		T.task1(5);
	}

}
class T
{
	public static void task1(long a) 
	{
		long l = 1;
		long summ = 0;
		
		while(l<=a) 
		{
			summ += l;
			l++;
		}
		System.out.println("Сумма всех чисел от 1 до " + a + " = " + summ);
	}
}