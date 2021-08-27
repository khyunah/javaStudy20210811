package b10_클래스;

public class Student {
	
		/*
		 * 객체 클래스를 통해 구현할수있는 모든 대상
		 * 객체가 구현된것을 인스턴스라고한다 
		 * 
		 */
	String name ;
	String schoolName;
	String year;//학년
	public void showInfo () {
		System.out.println("학생 정보");
		System.out.println("이름 : "+name);
		System.out.println("학교 : "+ schoolName);
		System.out.println("학년 : "+"year");
	}

}
