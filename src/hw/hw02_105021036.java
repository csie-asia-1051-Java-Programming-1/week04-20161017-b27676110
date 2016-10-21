package hw;
import java.util.Scanner;
public class hw02_105021036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int sum = 1,val=1,lol=1;
		int k = n - m;
		for(int i = 1;i<=n;i++){
			sum =sum*i;
			
		}
		for(int i = 1;i<=m;i++){
			val =val*i;
	}
		for(int i = 1;i<=k;i++){
			lol =lol*i;
}
System.out.println(sum/(val*lol));}}