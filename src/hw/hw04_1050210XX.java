package hw;
import java.util.Scanner;
public class hw04_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("1.����2.����3.�٧�4.�����{��");
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
			System.out.println("���¨ϥ�");
			break;
			default:
				System.out.println("�п�J1-4");
				break;
			
		}

	}

}
