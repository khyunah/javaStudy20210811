package a4_����ȯ;

public class Conversion {

	public static void main(String[] args) {
		//��ĳ����
		//1. ���ڸ� ������ 
		char c = 'A';
		int i_c = c;
		System.out.println("���� -> ����: " + i_c);
		
		int num = 100;
		double d_num = num;
		System.out.println("���� -> �Ǽ� : " + d_num);
		
		
		//���� + ���� = ����
		System.out.println("���� + ���� : " + (c + num));
		
		
		//�ٿ�ĳ����
		//1. ������ ���ڷ� 
		int i = 67;
		//char c_i = i; �̷����ϸ� ������
		char c_i = (char)i;
		System.out.println("���� -> ���� : " + c_i);
		
		double d_num2 = 1.45;
		int num2 = (int)d_num2;
		
		System.out.println("�Ǽ� -> ���� : " + num2);

		
		
	}

}
