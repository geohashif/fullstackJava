package hit.day6;

public class ForloopDemo {
public static void main(String[] args) {

for(int n=0;n<10;n++) {
	if(n%2==0) {
		System.out.println("Even Number........................."+n);
	}
	//n++;
}

for(int i=0,j=10;i<10&&j>0;i++,j--) {
	System.out.println(i+":"+j);
}
}
}
