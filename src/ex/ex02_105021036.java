package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。

 * Date: 2016/10/17
 * Author: 105021036 鄭東欣

 */
import java.util.Scanner;
public class ex02_105021036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a=0,b=0;
		char d = 'N';

		while(true){
			a = scn.nextInt();
			b = scn.nextInt();
			System.out.println(a+"*"+b+"="+a*b);
			System.out.println("是否繼續Y/N");
			d = scn.next().charAt(0);
			
			if(d=='n'){
				break;
			}
		

	}
	}
}
