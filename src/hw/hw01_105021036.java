package hw;
import java.util.Scanner;
public class hw01_105021036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 1,b = 0,c = 0;
		for(int i = 1;i<=n;i++){
			
			c = a + b;
			
			System.out.print(c+"\t");
			a = b;b=c;
		}
		

	}

}
