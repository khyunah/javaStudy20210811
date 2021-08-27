package a9_메소드;

public class OverloadingEx {
	
	public int add(int num1, int num2) {
		int result = num1 +num2;
		return result;
	}
	
	public int add (String num1, int num2) { //같은이름을 선언할수는없지만 매개변수의 자료형이 다르면 가능함
		int result = Integer.parseInt(num1) +num2;
		return result;		
	}
	public int add(int num1) {
		int result = num1 +num1;
		return result;
	}	
	public int mul(int num1, int num2, int num3) {
		int result = num1*num2*num3;
		return result;
	}
	
	public double mul(int num1, double num2) {
		double result = num1*num2;
		return result;
	}
	public double mul(int num1, int num2) {
		double result = num1*num2;
		return result;
	}
	public void mainMethod() {//퍼블릭은 공개적인의 의미로 모든이가 이것을 사용할수있다라는뜻 
		int numberSum = add (10, 20);
		double numberMul = mul(2,10.5);
		System.out.println("두 수의 합은?"+numberSum);
		System.out.println("곱셈 : + numberMul");
	}
	
	/*
	 * 객체는 세상에 존재하는 모든것을 의미
	 * 객체들의 관계성을 사용해서 순차적으로 수행되며 프로그램 동작
	 * 코드들을 부품화시켜서 조립하여 이것저것 만들수있게
	 * 객체는 데이터(변수)+기능(메소드)
	 * 객체지향언어 특징 상속 캡슐화 추상화 다형성 
	 * 상속 : 상위 클래스의 모든것을 상속받아 사용
	 * 캡슐화 : 
	 * 추상화 : 추상적인 요소들을 묶어서 분류
	 *  	  모호하게 설계해놓고 나중에 구체화
	 * 다형성 : 
	 * 
	 *  장점
	 *  재사용성 : 상속을 통해서 재사용(부모가 일궈놓은거 다시 안해도됨)
	 *  생산성 향상 : 클래스끼리 조립만 하면 된다
	 *  유지보수의 우수성 : 예를들면 고객이 불편해하거나 버그생겼을때 부분부분수정이 가능하다
	 *  단점
	 *  객체를 세분화해서 설계해야한다 (시간이 많이걸림)
	 *  실행속도가 절차지향언어보다는 느림
	 *  상속이 많아지면 난이도가 높아진다 
	 *  
	 */



}


