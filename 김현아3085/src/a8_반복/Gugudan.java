package a8_�ݺ�;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		int two = 2;
		int result = 0;
		
		for(int i = 0; i <9; i++ ) {//�����̶�� �����ȿ� �ִ��ؼ� ��������
			result = two * (i+1);
			System.out.println(two +"+"+(i+1)+"="+result);
		
		}
		/////////////////////////////////////////
		System.out.println("�ܼ��� �Է����ּ���");
		int dan = 0;
		String n = "��";
		Scanner sc = new Scanner(System.in);
		
		dan = sc.nextInt();
		
		System.out.println(dan+n);
		
		for(int i = 0; i <9; i++ ) {
			int i2 = i+1;
			System.out.println(dan+ "X" + i2+"="+(dan*i2));
		}
		///////////////////////////////
//		int i = 0; //����ó�� �ȿ��ִ°Ÿ��� �ۿ� �ִ°� ����������� ��
//		int i2 = i +1;
//		int result =2*i2;
//		
//		while(i<9) {
//			System.out.println("2 X "+i2+"="+result);
//			i++;
		int i =0;
		
		while(i<9) {
			int i2 = i+1;
			System.out.println("2 X "+i2+"="+(2*i2));
			i++;
		
		}
		
		
		
		

	}

}
