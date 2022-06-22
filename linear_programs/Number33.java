package by.it_academy.tr.linear_programs;

public class Number33 
{

	public static void main(String[] args)
	{
        char currentChar = 'A';


        int tablChar = (int) currentChar;

        int tablCharPrev = tablChar - 1;
        char prevChar = (char) tablCharPrev;

        int tablNext = tablChar + 1;
        char nextChar = (char) tablNext;

        System.out.println("char: " + currentChar + ", его номер: " + tablChar);
        System.out.println("Предыдущий char: " + prevChar + ", его номер: " + tablCharPrev);
        System.out.println("Следующий char: " + nextChar + ", его номер: " + tablNext);
	}

}
