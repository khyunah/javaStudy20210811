package b16_�⺻Ŭ����;

public class ObjectEx{
	//��ӹ޾����ִ� Ŭ������ ������Ʈ Ŭ������ ���뵵 ��ӵǾ��ִ� ������ �� �θ�Ŭ������ ��ӹ����� ����
	//������Ʈ �ڵ� ��� �޾����ֱ⶧���� 
	
	private String className ="ObjectEx";
	
	
	@Override
	public String toString() {
		return className;
	}
	
	@Override
	public int hashCode() { //���� �ּҷ� �������� ���Ҷ��� �������ּҷ� ���ϰԵȴ�.
		return 100;
	}
	
	@Override
	public boolean equals(Object obj) {

		return super.equals(obj);
	}
	
	
	
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.toString());
		
		ObjectEx oex = new ObjectEx();
		ObjectEx oex2 = new ObjectEx();
		System.out.println(oex.toString()); //extends Object �� �����Ǿ��ִ� � Ŭ�������� ��ӹ޾����ִ»��� �ֻ���Ŭ����.
		                                                 //��ü���� ���� �ּҰ��� ����ֱ⶧���� ����Ʈ����� �ּҰ�����
		String str1 = "������";
		String str2 = "������";
		String str3 = new String("������");
		
		
		
		//toString()�޼ҵ�
		/*
		String[] toStringArray = new String[10];
		
		for(int i = 0; i < toStringArray.length; i++) {
			Student s1 =new Student("������", "�ڸ��ƾ���Ƽ��ī����", 1, 1, 1,
				20210001, "�λ� ������", "010-0000-0000");
			toStringArray[i]= s1.toString();
		}
		
		//����ġ������ �ٷ� ���� �Է��ؼ� �����ϴ°� �ȵ� �ݺ��� ���ִ°�. ���� �ȳ־���.
	
		for(String s : toStringArray) {
			System.out.println(s);
		}

		*/
		
		System.out.println(oex.equals(oex2));
		
		System.out.println(str1+str2+str3);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		
		System.out.println(str1.equals(str3)); //���� ��
		System.out.println(str1==str3);  //��ü�� �ּҰ��� ��
		
		/*
		 * �������ּ� : �ϵ����
		 * �����ּ� : ����Ʈ����
		 */
		
		Student s1 = new Student("������", "�ڸ��ƾ���Ƽ��ī����", 1, 1, 1,
				20210001, "�λ� ������", "010-0000-0000");
		Student s2 = new Student("������", "�ڸ��ƾ���Ƽ��ī����", 1, 1, 1,
				20210001, "�λ� ������", "010-0000-0000");
		
		System.out.println(s1.equals(s2)); 
		System.out.println(s1==s2);
	}

}
