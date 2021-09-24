package a5_연산자;

public class Operation1 {

	public static void main(String[] args) {

		int score = 85;
		
		System.out.println(score);
		
		// 선증가 연산자  : 앞에 붙은거는 즉시 증가 시키는것
		//score = score +1 을 줄여 위처럼 표현 , 순서가 정해져있는 소스 만들때 사용하는 
		System.out.println(++score);		
		
		// 후증가 연산자 : 뒤에 붙이면 다음 숫자에 증가시키는것 
		System.out.println(score++);
		
		System.out.println(score);
		System.out.println(++score);
		
		// 선감소 연산자
		System.out.println(--score);
		// 후감소 연산자
		System.out.println(score--);
	}
}
		/**
		 * 
		 * 관계연산자 : 참과 거짓을 구해주는 연산자
		 * 왼쪽 값을 기준으로 
		 * >, <, >=, <=, ==(같다), !=(같지않다, ! : not을 의미)
		 * 
		 * 복합대입연산자 
		 * 나자신을 포함해서 연산을 해라라고 명령할때
		 * 
		 */