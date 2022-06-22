package by.it_academy.tr.linear_programs;

public class Number22 
{

	public static void main(String[] args)
	{
		int T = 8500;
		
		int hour = T / 3600;
		int count = T - (hour * 3600);
		int minute = count/60;
		int second = count - (minute * 60);
		
		System.out.println("Часы:" + hour + " Минуты:" + minute + " Секунды:" + second );



		
	}

}
