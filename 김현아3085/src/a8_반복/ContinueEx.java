package a8_�ݺ�;

public class ContinueEx {

	public static void main(String[] args) {
		for(int i = 0; i < 10 ; i++) {
			if(i%2 == 0) {
				System.out.println(i+"��(��) ¦���Դϴ�.");
				continue;
				//��Ƽ���� if �� ���ǽ��� �����Ҷ��� ��Ƽ�� ���Ͽ� �ִ� ����� �����ʰ� 
				//�ٽ� ó������ ���ư� ������Ű�� �����Ѵ� ������ �Ǿ� 3�� �Ǿ�����
				//if���ǽĿ� ���������Ƿ� ��Ƽ���� �۵��ȵǰ� �ؿ� Ȧ���Դϴٰ� ��µ�.
			}
			System.out.println(i+"��(��) Ȧ���Դϴ�.");
		}

	}

}
