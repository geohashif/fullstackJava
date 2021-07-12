package labExercise;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = scanner.nextDouble();
		//Area = PI*radius*radius
		double area = Math.PI * (radius * radius);
		System.out.println("The area of circle is: " + area);
		//Circumference = 2*PI*radius
		double circumference= Math.PI * 2*radius;
		System.out.println( "The circumference of the circle is:"+circumference) ;
	}

}
