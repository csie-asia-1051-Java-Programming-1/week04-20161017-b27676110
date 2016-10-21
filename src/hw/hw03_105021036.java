package hw;
import java.util.Scanner;
public class hw03_105021036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=0;
		int a = 0,b= 0,c=0;
		while(n!=999){
			 n = scn.nextInt();
			if(n>0&&n!=999){
				a++;
			}else{
				if(n==0){
					b++;
				}else{
					if(n<0){
						c++;
					}
				}
			}
		}
		System.out.println("¥¿¼Æ"+a);
		System.out.println("¹s"+b);
		System.out.println("­t¼Æ"+c);
	}
	
	

}
