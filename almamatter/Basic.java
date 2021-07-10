package almamatter;
import java.util.Scanner;
public class Basic {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter i value..:");
		
		int i=scan.nextInt();
		
		System.out.println("Please enter j value...:");
		
		int j=scan.nextInt();
		
		int sum=i+j;
		
		System.out.println("The addtion of i and j is..:"+sum);
	}
}