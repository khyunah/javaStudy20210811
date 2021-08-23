package a8_반복;

import java.util.Scanner;

public class StarEx1 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("별의 갯수 : ");
		int star = in.nextInt();
		
		for(int i = 0; i<star; i++) {
			
			for(int j= 0; j<i+1;j++) {
				System.out.print("*"); //ln이 아니라서 옆으로 나열
			}
			System.out.println();
		}

	}

}
