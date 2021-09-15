package b18_컬렉션;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ArrayListTest {

	public static void main(String[] args) {
		//업캐스팅 
		List<String> arrayList = new ArrayList<String>();
//		arrayList = new LinkedList<String>();
//		arrayList = new Vector<String>();
//		arrayList = new Stack<String>();
		
		arrayList.add("java");
		arrayList.add("c");
		arrayList.add("python");
		
		//원하는 인덱스번호의 값 찾기
		System.out.println(arrayList.get(1)); //get뒤에는 인덱스번호
		
		//for each문
		for(String str : arrayList)
			System.out.println(str);
		
		//for문
		for(int i = 0; i<arrayList.size();i++) { //length는 배열에서 쓰이는것
			System.out.println(arrayList.get(i));
		}
		
		arrayList.remove(0);
		//System.out.println(arrayList.remove(0));
		
		System.out.println(arrayList);
	}

}
