package a4_����ȯ;

public class CoversionString {

	public static void main(String[] args) {
		// ���ڿ�(String)�� ����ȯ
		int num = 10;
		int num2 = 10;
		String sNum = "10";
		//= String sNum = ""+10; 
		
		System.out.println(num +num2 + sNum );
		System.out.println(sNum + num + num2 );
		//���ڿ��� ������ �Ҷ� ���� �߿�
		
		
		// ���ڿ� -> �ٸ� �ڷ���(boolean, int, double)
		//int(����) : integer.palseInt(���ڿ�);
		int i = Integer.parseInt("10");  //�̷����ϸ� ���ڿ��� 10�� ���� 10 �� �ȴ�
		//��Ƽ���ȿ� ��Ʈ�� �Ľ����ִ� �� 
		double d = Double.parseDouble("10.1");
	//	int d = (int)Double.parseDouble("10.1"); �������� ���������� ����ȯ�� ���ذ���
		boolean b =Boolean.parseBoolean("true");
		
		
		//�ٸ��ڷ��� -> ���ڿ�
		// int(����) : Integer.toString(����);
		Integer.toString(10);
		Double.toString(10.2);
		Boolean.toString(false);
		
		

	}

}
