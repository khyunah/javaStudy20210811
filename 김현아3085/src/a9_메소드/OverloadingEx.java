package a9_�޼ҵ�;

public class OverloadingEx {
	
	public int add(int num1, int num2) {
		int result = num1 +num2;
		return result;
	}
	
	public int add (String num1, int num2) { //�����̸��� �����Ҽ��¾����� �Ű������� �ڷ����� �ٸ��� ������
		int result = Integer.parseInt(num1) +num2;
		return result;		
	}
	public int add(int num1) {
		int result = num1 +num1;
		return result;
	}	
	public int mul(int num1, int num2, int num3) {
		int result = num1*num2*num3;
		return result;
	}
	
	public double mul(int num1, double num2) {
		double result = num1*num2;
		return result;
	}
	public double mul(int num1, int num2) {
		double result = num1*num2;
		return result;
	}
	public void mainMethod() {//�ۺ��� ���������� �ǹ̷� ����̰� �̰��� ����Ҽ��ִٶ�¶� 
		int numberSum = add (10, 20);
		double numberMul = mul(2,10.5);
		System.out.println("�� ���� ����?"+numberSum);
		System.out.println("���� : + numberMul");
	}
	
	/*
	 * ��ü�� ���� �����ϴ� ������ �ǹ�
	 * ��ü���� ���輺�� ����ؼ� ���������� ����Ǹ� ���α׷� ����
	 * �ڵ���� ��ǰȭ���Ѽ� �����Ͽ� �̰����� ������ְ�
	 * ��ü�� ������(����)+���(�޼ҵ�)
	 * ��ü������ Ư¡ ��� ĸ��ȭ �߻�ȭ ������ 
	 * ��� : ���� Ŭ������ ������ ��ӹ޾� ���
	 * ĸ��ȭ : 
	 * �߻�ȭ : �߻����� ��ҵ��� ��� �з�
	 *  	  ��ȣ�ϰ� �����س��� ���߿� ��üȭ
	 * ������ : 
	 * 
	 *  ����
	 *  ���뼺 : ����� ���ؼ� ����(�θ� �ϱų����� �ٽ� ���ص���)
	 *  ���꼺 ��� : Ŭ�������� ������ �ϸ� �ȴ�
	 *  ���������� ����� : ������� ���� �������ϰų� ���׻������� �κкκм����� �����ϴ�
	 *  ����
	 *  ��ü�� ����ȭ�ؼ� �����ؾ��Ѵ� (�ð��� ���̰ɸ�)
	 *  ����ӵ��� ����������ٴ� ����
	 *  ����� �������� ���̵��� �������� 
	 *  
	 */



}


