package by.it_academy.tr.linear_programs;

public class Number28
{

	public static void main(String[] args)
	{
		double Rad = 1.0;
		
		double RadDegrees = 180/Math.PI * Rad;
		int degrees = (int) RadDegrees;
		
		double minutes = (RadDegrees - degrees) * 60;
		int minute = (int) minutes;
		
		double seconds = (minutes - minute) * 60;
		int second = (int) seconds;
		
		System.out.println("Если радиан = " + Rad + "\n" + "Угол = " + degrees + ", Минуты = " + minute 
				          + ", Секунды = " + second);
	}

}
