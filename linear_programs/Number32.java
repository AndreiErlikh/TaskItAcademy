package by.it_academy.tr.linear_programs;

public class Number32 
{

	public static void main(String[] args)
	{
	     	int mHour = 23;
	        int mMin = 23;
	        int mSec = 14;

	        int p = 23;
	        int q = 59;
	        int r = 59;

	        int currentInSeconds = mHour * 3600 + mMin * 60 + mSec;
	        int intervalInSeconds = p * 3600 + q * 60 + r;

	        int finalInSeconds = currentInSeconds + intervalInSeconds;

	        int hoursFinal = (finalInSeconds / 3600);

	        int temp = finalInSeconds - (hoursFinal * 3600);
	        int minutesFinal = temp / 60;

	        int secondsFinal = temp - (minutesFinal * 60);

	        int hours24Format = 0;
	        if (hoursFinal > 23){
	            temp = (hoursFinal / 24);
	            hours24Format = hoursFinal - temp * 24;
	        }
	        else {
	            hours24Format = hoursFinal;
	        }

	        System.out.println("Сейчас: " + mHour + " ч. " + mMin + " мин. " + mSec + " c.");
	        System.out.println("Через: " + p + " ч. " + q + " мин. " + r + " c.");
	        System.out.println("Будет: " + hours24Format + " ч. " + minutesFinal + " мин. " + secondsFinal + " c.");

	}

}
