package hit.day6;

public class LoopingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		
		while(x>0) {
			if(x%2==0) {
				System.out.println("Even number......."+x);
			}
			else {
				System.out.println("odd number.........................."+x);
			}
			--x;
		}
		
		x=10;// re initializing the value of x to 10 again
		
		do {//post condition check...
			String s=(x%2==0)?"Even Number..."+x:"Odd Number....."+x;
			System.out.println(s);
			--x;
		}while(x>0);
	}

}
