package b21_����ó��;

public class ExceptionEx {
	
	public static void arrTest() throws ArrayIndexOutOfBoundsException{
		
		int [] arr = new int[5];
		
		for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}	
	}

	public static void main(String[] args) throws Exception{ //���θ޼ҵ忡�� throws���ָ� jvm�� ó������
		
		//try�ȿ��� ������ ���Ͱ��� �ڵ带 �־��ش�
		try {
			ExceptionEx.arrTest();	
			
		} catch(ArrayIndexOutOfBoundsException e) {	
			System.out.println("�迭�� ũ�⸦ �ʰ��Ͽ� �����Ͽ����ϴ�.");
			
		} catch (Exception e) {//������� ������ ���� Exception(�ֻ��)���� ��� ó���� �����ϴ�.
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����.");
	}
}

/*
 * Exception ���� 
 * 1. ����(�ҽ��ڵ�)����
 * 2. �����Ͽ���
 * 3. ���� : �����ڰ� �ǵ��Ѵ�� �۵�����������(������ �ٸ���) (�����ʹ� �ٸ� ����)
 * 
 * throws ȣ���� ��ġ�� ���̷ܹ��
 * 
 * 
 */