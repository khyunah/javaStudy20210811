package b14_�߻�ȭ;

public class AbstractExTest {
	public static void main(String[] args) {
		//�߻�Ŭ������ ������ �Ұ��� ������ ��ĳ�����Ͽ� ����� �����ϴ�.
		//AbstractEx absEx = new AbstractEx(); �����Ұ�
		
		//�����ڰ� �ƴϱ⶧���� �ٷ� ȣ���ؿ��� �ʴ´�.
		AbstractEx absEx = new AbstractExExten();
		AbstractEx absEx2 = new AbstractEx2Exten();
		
		//���� ȣ���� �������
		absEx.printName();
		absEx2.printName();
	}
}

