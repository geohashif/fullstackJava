package almamatter;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of i ..");
		int i = scan.nextInt();
		System.out.println("Enter value of j..");
		int j = scan.nextInt();
		int mul = i*j;
		System.out.println("The multiplication of i and j is..: "+mul);
		
	}

}
