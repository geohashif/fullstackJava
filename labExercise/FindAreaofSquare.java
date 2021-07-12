package labExercise;

import java.util.Scanner;

public class FindAreaofSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Side of Square:");
		Scanner scanner = new Scanner(System.in);
		double side = scanner.nextDouble();
		//Area of Square = side*side
		double area = side*side;
		System.out.println("Area of Square is: "+area);
	}

}
