package a8_�ݺ�;

import java.util.Scanner;

public class GugudanAll {

	public static void main(String[] args) {
		//������ ��ü
		for(int i =0; i<8; i++) {
			int i2 = i+2;
			System.out.println( i2 +"��");
			for(int j = 0; j<9; j++) {
				int j2 = j +1;
				System.out.println(i2 +"X"+j2 + "="+(i2*j2));
			}
			System.out.println();
		}
		
		//���ϴ� �� �Է¹ޱ�
		System.out.println("��ܺ��� ��ܱ��� ���ڸ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		for(num1 =0; num1 <num2+1; num1++) {//�����ȿ��� ������ <=�̰� ���� �Ⱦ��� �׷��� <> �̰ɷ� �̿��ϰ� ������ +1 �̷������� ���ֱ�
//		for(; num1 <num2+1; ++)	�̷��� ������ ����, �����ݷ� ���Ŵ� �����ȵȴ�.
			System.out.println( num1 +"��");
			for(int j = 0; j<9; j++) {
				int j2 = j +1;
				System.out.println(num1 +"X"+j2+ "="+(num1*j2));
		
			}
			System.out.println();
		}

	}

}
