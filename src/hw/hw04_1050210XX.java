package hw;
import java.util.Scanner;
public class hw04_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("1.中細2.中粗3.菱形4.結束程式");
		int n = scn.nextInt();
		switch(n){
		case 1:
			int a = scn.nextInt();
			int h = a;
			for(int x =1;x<=a;x++){
				for(int y = 1;y<=h;y++){
					System.out.print("@");
				}
				h--;
				System.out.println("");
			}
			break;
		case 2:
			
			break;
		case 3:
			
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
