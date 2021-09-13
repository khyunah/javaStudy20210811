package b16_기본클래스;

public class ObjectEx{
	//상속받아져있는 클래스도 오브젝트 클래스의 내용도 상속되어있다 이유는 그 부모클래스는 상속받은게 없음
	//오브젝트 자동 상속 받아져있기때문에 
	
	private String className ="ObjectEx";
	
	
	@Override
	public String toString() {
		return className;
	}
	
	@Override
	public int hashCode() { //논리적 주소로 들고오지만 비교할때는 물리적주소로 비교하게된다.
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
		System.out.println(oex.toString()); //extends Object 이 생략되어있다 어떤 클래스에도 상속받아져있는상태 최상위클래스.
		                                                 //객체명에는 원래 주소값이 담겨있기때문에 투스트링없어도 주소값나옴
		String str1 = "김준일";
		String str2 = "김준일";
		String str3 = new String("김준일");
		
		
		
		//toString()메소드
		/*
		String[] toStringArray = new String[10];
		
		for(int i = 0; i < toStringArray.length; i++) {
			Student s1 =new Student("김준일", "코리아아이티아카데미", 1, 1, 1,
				20210001, "부산 동래구", "010-0000-0000");
			toStringArray[i]= s1.toString();
		}
		
		//포이치문에서 바로 값을 입력해서 실행하는거 안됨 반복만 해주는것. 값은 안넣어줌.
	
		for(String s : toStringArray) {
			System.out.println(s);
		}

		*/
		
		System.out.println(oex.equals(oex2));
		
		System.out.println(str1+str2+str3);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		
		System.out.println(str1.equals(str3)); //값을 비교
		System.out.println(str1==str3);  //객체의 주소값을 비교
		
		/*
		 * 물리적주소 : 하드웨어
		 * 논리적주소 : 소프트웨어
		 */
		
		Student s1 = new Student("김준일", "코리아아이티아카데미", 1, 1, 1,
				20210001, "부산 동래구", "010-0000-0000");
		Student s2 = new Student("김준일", "코리아아이티아카데미", 1, 1, 1,
				20210001, "부산 동래구", "010-0000-0000");
		
		System.out.println(s1.equals(s2)); 
		System.out.println(s1==s2);
	}

}
