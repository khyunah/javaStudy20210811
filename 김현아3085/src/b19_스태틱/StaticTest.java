package b19_����ƽ;

public class StaticTest {

	public static void main(String[] args) {
		Connector.connect();
		
		//Integer.parseInt
		//Ŭ������ ����Ҷ� �̷������� �ؾ��ϴµ� static�� �ٷ� ���� ����
		//Integer i = new Integer(10);
		
		Student s1 = new Student("������");
		Student s2 = new Student("�����");
		Student s3 = new Student("������");
		Student s4 = new Student("������");
		
		//static�� �������� �й��� ��� 20210001�ε� static���� ��ü������ �����ؼ���
		s1.showInpo();
		s2.showInpo();
		s3.showInpo();
		s4.showInpo();

	}
}
