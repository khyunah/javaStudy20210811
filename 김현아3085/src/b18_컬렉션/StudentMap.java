package b18_컬렉션;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {

	public static void main(String[] args) {
		Map<String, Student> sMap = new HashMap<String, Student>();
		
		for(int i = 0; i<10; i++) {
			sMap.put("김준일"+i, new Student("김준일"+i, 202100+i));
		}
		
		//키값이 있는지 먼저 확인해보기
		for(int i =0; i<sMap.size();i++) {
			boolean flag = sMap.containsKey("김준일9");
			if(flag == true) {
				System.out.println("키 값이 존재합니다.");
				break;
			}
		}
		
		//원하는 키값 출력하기
		System.out.println(sMap.get("김준일3"));//get을써서 값을 가져온다
	}

}
