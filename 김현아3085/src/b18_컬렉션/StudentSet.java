package b18_�÷���;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentSet {

	public static void main(String[] args) {
		Set<Student> sSet = new HashSet<Student>();
		
		sSet.add(new Student("������", 202101));
		sSet.add(new Student("������1", 202102));
		sSet.add(new Student("������2", 202103));
		
		//�ݺ��� Iterator :  �긦 ������ ������ �����̵ȴ�. 
		Iterator ir = sSet.iterator();
		
		//hasNext : �������� �ֳİ� ����°�, Ŀ���� ���� ������ �Ѿ�� ���� ������ ���� ������ �Ѿ�� ���� ����Ѵ� ���� �������� false�� Ż���Ѵ�.
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
	}
}
