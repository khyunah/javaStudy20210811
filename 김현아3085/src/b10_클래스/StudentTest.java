package b10_Ŭ����;

public class StudentTest {
	public static void main(String[] args) {

		Student kim = new Student("������","USA����Ƽ",4);  //null :�ּҰ����ٶ�� �� �ƹ��� ���� ����
		kim.getFreebies();  //����ǰ ���������
		Student lee = new Student("������", 2); //�����ε��� �Ҷ�����(�Ű������� �ϳ���) ������ �⺻�����ڰ� �־���Ѵ�.
		lee.getFreebies();
		Student park = new Student("��ȣ��","�ڸ��ƾ���Ƽ",3);
		park.getFreebies();
		
		kim.showInfo();	
				
		Integer i = new Integer(100);
		
		System.out.println(kim.hashCode()); //�ּҰ������µ� �̰Ŵ� ���޸𸮿� �����(����������Ȱ�)
		System.out.println(i.hashCode());   //hashCode : �ּҰ�				
	}

}
