package b18_컬렉션;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentSet {

	public static void main(String[] args) {
		Set<Student> sSet = new HashSet<Student>();
		
		sSet.add(new Student("김준일", 202101));
		sSet.add(new Student("김준일1", 202102));
		sSet.add(new Student("김준일2", 202103));
		
		//반복자 Iterator :  얘를 만나면 순서가 정렬이된다. 
		Iterator ir = sSet.iterator();
		
		//hasNext : 다음값이 있냐고 물어보는것, 커서가 다음 행으로 넘어간다 값이 있으면 다음 행으로 넘어가고 값을 출력한다 값이 없어지면 false고 탈출한다.
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
	}
}
