package a4_����ȯ;

public class CoversionString {

	public static void main(String[] args) {
		// ���ڿ�(String)�� �ڵ�����ȯ
		int num = 10;
		int num2 = 10;
		String sNum = "10";
		//= String sNum = ""+10; 
		
		System.out.println(num + num2 + sNum );
		System.out.println(sNum + num + num2 );
		//���ڿ��� ������ �Ҷ� ���� �߿�
		
		
		// ���ڿ� -> �ٸ� �ڷ���(boolean, int, double)
		
		//1. int(����) : integer.palseInt("���ڿ�");
		int i = Integer.parseInt("10");  //�̷����ϸ� ���ڿ��� 10�� ���� 10 �� �ȴ�
		//IntegerŬ����Ÿ�Ծȿ� int�� �Ľ����ִ� ��
		
		//2. double(�Ǽ�)
		double d = Double.parseDouble("10.1");
		//int d = (int)Double.parseDouble("10.1"); ���ڿ��� ����� �ٲٰ� �ٽ� ������ ����ȯ �Ѱ�
		
		//3. boolean(��)
		boolean b =Boolean.parseBoolean("true");
		
		
		//�ٸ��ڷ��� -> ���ڿ�
		// int(����) : Integer.toString(����);
		String s = Integer.toString(10);
		
		Double.toString(10.2);
		Boolean.toString(false);

	}

}
