package b18_�÷���;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ArrayListTest {

	public static void main(String[] args) {
		//��ĳ���� 
		List<String> arrayList = new ArrayList<String>();
//		arrayList = new LinkedList<String>();
//		arrayList = new Vector<String>();
//		arrayList = new Stack<String>();
		
		arrayList.add("java");
		arrayList.add("c");
		arrayList.add("python");
		
		//���ϴ� �ε�����ȣ�� �� ã��
		System.out.println(arrayList.get(1)); //get�ڿ��� �ε�����ȣ
		
		//for each��
		for(String str : arrayList)
			System.out.println(str);
		
		//for��
		for(int i = 0; i<arrayList.size();i++) { //length�� �迭���� ���̴°�
			System.out.println(arrayList.get(i));
		}
		
		arrayList.remove(0);
		//System.out.println(arrayList.remove(0));
		
		System.out.println(arrayList);
	}

}
