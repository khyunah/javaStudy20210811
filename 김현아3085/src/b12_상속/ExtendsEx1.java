package b12_상속;
/*
 * 상속을 받으면 부모클래스 먼저 생성된다.
 * new Son 안에 
 * new Father
 * new Son 이렇게 아빠먼저 생성됨.
 * super(); 부모의 생성자를 호출하는 객체(this와 같은 개념)
 * super.set---이렇게 불러오고 수정함
 * 
 */

public class ExtendsEx1 {

	public static void main(String[] args) {

		Son s = new Son();
		s.setMoney(10000);
		System.out.println(s);


	}

}
