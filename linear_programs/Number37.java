package by.it_academy.tr.linear_programs;

public class Number37 
{

	public static void main(String[] args)
	{
		T1.task1(34);
		T2.task2(1234);
		T3.task3(124);
		T4.task4(1, 1, 2, 3);
		T5.task4(123);
		T6.task6(4.0, 4.0, 6.0);
		T7.task7(123);
		T8.task8(2, 10);
		T9.task9(1.0,3.0,-4.0,1.0,0.0);
	}
}

class T1
{
	public static void task1(int N) 
	{
		System.out.print("Число " + N + " является четным двузначным числом ? -");
		
		if(N/100 == 0 && N % 2 == 0 ) 
		{
			System.out.print(" true");
		}
		else 
		{
			System.out.print(" false");
		}
	}	
}

class T2
{
	public static void task2(int a) 
	{
	int a2 = a;
	int summA = 0;
	int summB = 0;
	
	for(int i = 0;i<2;i++) 
	{
		summA += (a2 % 10);
		a2 = a2/10;
	}
	
	for(int i=0;i<2;i++) 
	{
		summB +=(a2 % 10);
		a2 = a2/10; 
	}
	
	System.out.print("\nРавна ли сумма первых двух чисел и последних двух чисел числа " + a + "?");
	
	if(summA == summB) 
	{
		System.out.print(" = true");
	}
	else
	{
		System.out.print(" = false");
	}
	
	}
}

class T3
{
	public static void task3(int N) 
	{
		
		int N2 = N;
		int summ = 0;
		int i = 0;
		
		while(i<4) 
		{
			summ += (N2 % 10);
			N2 = N2/10;
			i++;
		}
		
		System.out.print("\nСумма цифр данного трехзначного числа " + N +" является четным числом = ");
		
		if (summ % 2 == 0) 
		{
			System.out.print("true");
		}
		else
		{
			System.out.print("false");
		}
		
	}
}

class T4
{
	public static void task4(int x , int y , int m , int n) 
	{

		System.out.print("\nТочка с координатами (х, у) " + x +" "+ y + 
				         " принадлежит части плоскости, лежащей между прямыми х= m, х= n (т<п) " 
				         + m + " " + n);
		
        if (x >= m && x <= n) {
            System.out.print(" = true");
        }
        else{
            System.out.print(" = false");
        }
	}
}

class T5
{
	public static void task4(int N) 
	{
		int N2 = N;
		int summ = 0;
		for(int i=0;i<=3;i++) 
		{
			summ +=(N2%10);
			N2 = N2/10;
		}
		
		System.out.print("\nКвадрат заданного трехзначного числа " + N +" равен кубу суммы цифр этого числа ="); 
		
		if(Math.pow(N, 2) == Math.pow(summ,3)) 
		{
			System.out.println(" true");
		} 
		else
		{
			System.out.println(" false");
		}
	}
}

class T6
{
	public static void task6(double a,double b, double c) 
	{
		System.out.print("Треугольник со сторонами "+a+" "+ b +" "+ c + " является равнобедренным?");
		if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) 
		{
			System.out.print(" - true");
	    }
	    else
	    {
	    	System.out.print(" - false");
	    }
	}
}
class T7
{
	public static void task7(int N) 
	{
		int a = N;
		int a1 = a%10;
		a = a/10;
		int a2 = a%10;
		a = a/10;
		int a3 = a%10;
		 
		System.out.print("\nСумма каких-либо двух цифр заданного трехзначного натурального числа " 
		                   + N + " равна третьей цифре? -");
		
		if (a1 + a2 == a3 || a1 + a3 == a2 || a3 + a2 == a1) 
		{
			System.out.print(" true");
		}
	    else
	    {
	    	System.out.print(" false");
	    }
	}
}
class T8
{
	public static void task8(int N,int a) 
	{
		if(N>=0 && N<=4)
		{
			System.out.print("\nЧисло "+a +" в степени "+ N + " = " + Math.pow(a, N));
		}
		else 
		{
			System.out.print("\nСтепень N не лежит в отрезке от 0 до 4");
		}
	}
}

class T9
{
	public static void task9(double a, double b , double c , double x, double y) 
	{
		System.out.print("\nГрафик функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п) - ");
		
        if (y == a * x * x + b * x + c)
        {
        	System.out.print("true");
        }
        else
        {
        	System.out.print("false");
        }
	}
}











