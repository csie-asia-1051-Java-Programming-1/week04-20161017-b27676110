package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex02_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		char d = scn.next().charAt(0);
		int sum = 0;
		d = 'Y';
		while(d=='Y'){
			if(a>=0&&b>=0){
				System.out.println(a*b);
			}
			System.out.println("繼續續請按Y結束請按n");
			char c = scn.next().charAt(0);
			if(c=='Y'){
				d = 'Y';
			}else{
				if(c=='n'){
					d = 'n';
				}
				
				
			}
		}
	}
	}
