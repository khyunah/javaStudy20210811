package a8_�ݺ�;

import java.util.Scanner;

public class StarEx1 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("���� ���� : ");
		int star = in.nextInt();
		
		for(int i = 0; i<star; i++) {
			
			for(int j= 0; j<i+1;j++) {
				System.out.print("*"); //ln�� �ƴ϶� ������ ����
			}
			System.out.println();
		}

	}

}
