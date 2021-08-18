package a7_조건;

import java.util.Scanner;

public class Quiz14681 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("x축 : ");
		int x = in.nextInt();
		System.out.print("y축 : ");
		int y = in.nextInt();
		
		if(x>0 && y >0) {
			System.out.println("1");
		}else if (x<0 && y>0) {
			System.out.println("2");
		}else if (x<0 && y <0) {
			System.out.println("3");
		}else if (x>0 && y <0) {
			System.out.println("4");
		}else {
			System.out.println("두값이 0");
		}

		
	}

}
