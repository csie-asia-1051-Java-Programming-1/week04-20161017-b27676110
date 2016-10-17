package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex01_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入多個正整數");
		int n = scn.nextInt();

		int a = 0,sum =0,i=1,val=0;
		while(n != -1){
//			if(n>=0){
//				int f = scn.nextInt();
				sum = sum + n;
//				i++;
//				n=1;
//
//			}
		
			System.out.println("結束請打-1");
			n = scn.nextInt();

//						if(f==-1){
//							a=-1;
//						
//			}
		}
		System.out.println("總和"+sum);
		val = sum/i;
		System.out.println("平均"+val);
	}

}
