package a6_ǥ���Է�;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// String�� �⺻���� Ŭ����
		// Scanner�� �ܺ� Ŭ����
		// ctrl ����Ʈ o�� �ؾ��Ұ� ���� ����Ʈ ���ѹ���
		
		Scanner input = new Scanner(System.in);
		//new�� �����϶�� ��,  �ý��� . �� �̶�� �ü���� ǰ�� ������ ��ĳ�ʷ� ��ĵ
		System.out.println("���� 2���� �Է��� �ּ���.");
		System.out.println("ù��° ��  :");		
		String str = input.nextLine();
		System.out.println("�ι�° ��  :");
		String str2 = input.nextLine();
		
		//next : �Ѵܾ� ���⸦ ������ �������� ,
		//nextLine : ���ٿ� ��� ���� ��ȣ ���� �� ����
		
		System.out.println("��� : ");
		System.out.println(Integer.parseInt(str)+Integer.parseInt(str2));
		//int i = Integer.parseInt(str);
		//int i2 = Integer.parseInt(str2); ���� ����ȯ�̳� �̰ų� �Ȱ��� ��ȯ��
		//System.out.println(i+i2);
		

	}

}
