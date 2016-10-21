package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。


 * Date: 2016/10/17
 * Author: 105021036 鄭東欣
 */
import java.util.Scanner;
public class ex01_105021036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入多個正整數");
		int n = scn.nextInt();
		int i = 0,sum=0;
		while(n!=-1){
			sum=sum+n;
        	i++;
        	
        	System.out.println("結束請輸入-1");
        	n = scn.nextInt();
		}

        
        System.out.println("總和"+sum);
        System.out.println("平均"+(float)sum/i);
        
	}
	}
	
