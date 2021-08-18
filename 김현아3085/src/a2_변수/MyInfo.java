package a2_변수;

public class MyInfo {

	public static void main(String[] args) {
		/** <자료형> 
		* 논리형 (boolean) = true, false 
		* boolean 변수명 = true;
		* boolean 변수명 = false;
		* 
		* 문자형 (char) 캐릭터 = 한글자만 입력가능  
		* char 변수명 = 'a';
		* char 변수명 = '가';
		* char 변수명 = '1';
		* 
		* 문자열 (String) = "문자열을 저장할 수 있습니다."
		* String 변수명 = "안녕하세요. 김현아입니다."
		* 
		* 
		* 정수형 (int) Integer = 십진수를 표현
		* int 변수명 = 100;
		* 
		* 실수형 (double) = 0.1 등 실수단위 (소숫점)표현
		* double 변수명 = 100.2333;
		* 
		*  
		*  
		*   헝가리안 표기법 
		*   변수명이 어떤자료형으로 선언되었는지 확인하러 올라가야하는 번거러움을 줄이려 만들어짐
		*   헝가리사람이 만들었다.
		*   c_name 이런식으로 언더바 사용
		*   int는 n_ 으로 쓰임 
		*   
		*   기본형이 아닌 자료형을 쓸때는 값 마지막에 대문자로 써줘야함
		*   
		*  상수는 항상 변하지 않는 값이다
		*  상수는 변수명을 전부 대문자로 
		*  
		*  
		*  
		*  
		* 
		*/
		
		int year = 1995;
		int month = 02;
		int day = 20;
		
		char f = '김';
		char s = '현';
		char th = '아';
		
		String name = "김현아";
		
		
		double left = 1.0;
		double right = 1.2;
		
		boolean malefemale = false;
		
		
		System.out.print("생년월일 : ");
		System.out.print(year);
		System.out.print(month);
		System.out.println(day);
		System.out.print("이름 : ");
		System.out.print(f);
		System.out.print(s);
		System.out.print(th);
		// 이름을 하나하나 문자형으로 말고 문자열을 입력할 수 있는 String으로 입력할 수 있다.
		System.out.print(name);
		
	
		System.out.print("시력 (L) : ");
		System.out.println(left);
		System.out.print("시력 (R) :");
		System.out.println(right);
		System.out.print("성별 : ");
		System.out.println(malefemale);
	

	}

}
