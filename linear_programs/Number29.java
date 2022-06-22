package by.it_academy.tr.linear_programs;

public class Number29
{

	public static void main(String[] args)
	{

        double a = 5.0;
        double b = 5.0;
        double c = 5.0;

        double cornerARad = Math.acos((b * b + c * c - a * a) / (2 * b * c));
        double cornerADegr = cornerARad * 180 / Math.PI;

        double cornerBRad = Math.acos((a * a + c * c - b * b) / (2 * a * c));
        double cornerBDegr = cornerBRad * 180 / Math.PI;

        double cornerCRad = Math.acos((a * a + b * b - c * c) / (2 * a * b));
        double cornerCDegr = cornerCRad * 180 / Math.PI;

        System.out.println("Треугольник со сторонами " + a + " " + b + " " + c);
        System.out.println("Угол 1 = " + cornerARad + " Радиан. " + cornerADegr + " = градусов.");
        System.out.println("Угол 2 = " + cornerBRad + " Радиан. " + cornerBDegr + " = градусов.");
        System.out.println("Угол 3 = " + cornerCRad + " Радиан. " + cornerCDegr + " = градусов.");
	}

}
