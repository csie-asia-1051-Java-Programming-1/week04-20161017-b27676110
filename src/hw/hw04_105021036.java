package hw;
import java.util.Scanner;
public class hw04_105021036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("1.中細2.中粗3.菱形4.結束程式");
		int x = scn.nextInt();
		switch(x){
		case 1:
			int n = scn.nextInt();
			int n1 = (n+1)/2;
			int h =n1;
			for(int i = 1;i<=n1;i++){
				for(int j = 1;j<=h;j++){
					System.out.print("@");	
				}
				System.out.println("");
				h--;
		    }
			
			int n2 = n - (n+1)/2;
			int k1 = 2;
			for(int i = 1;i<=n2;i++){
				for(int j = 1;j<=k1;j++){
					System.out.print("@");	
				}
				System.out.println("");
				k1++;
		    }
			break;
		case 2:
			int d = scn.nextInt();
			int d1 = (d+1)/2;
			int h1 = 1;
			for(int i =1;i<=d1;i++){
				for(int j = 1;j<=h1;j++){
					System.out.print("%");
				}				
				System.out.println("");
				h1++;
			}
			int d2 = d - (d+1)/2;
			int k2 = d2;
			for(int i = 1;i<=d2;i++){
				for(int j = 1;j<=k2;j++){
					System.out.print("%");
				}
				System.out.println("");
				k2--;
			}
		    break;
		case 3:
			int a = scn.nextInt();
			int b = (a+1)/2;
			
			for(int i = 1;i<=b;i++){
				for(int j = 0;j<b-i;j++){
					System.out.print(" ");
					
				}
				for(int k = 0;k<i*2-1;k++){
					System.out.print("#");
				}
				System.out.println("");
				
		    }
			
			int c = a - b;
			for(int i = 1;i<=c;i++){
				for(int j = 0;j<i;j++){
					System.out.print(" ");
				}
				for(int k = 0;k<a-i*2;k++){
					System.out.print("#");
				}
				System.out.println("");
			}
			

			break;
		case 4:
			System.out.println("謝謝使用");
			break;
			default:
				System.out.println("請輸入1-4");
				break;
			
		}

	}

}
