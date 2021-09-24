package b18_컬렉션;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	
	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>();
		
		
		for(int i = 0; i<10; i++) {
			sList.add(new Student("김준일"+i, 202100+i));
		}
		
		for(Student s : sList) {
			System.out.println(s);
		}
		
		System.out.println();
		
		//제거될 대상의 객체를 가지고 옴, 내가 어떤걸 지웠나 잘 지웠나 확인하는 작업
		Student s = sList.remove(3);
		System.out.println(s);
		
	}

}
