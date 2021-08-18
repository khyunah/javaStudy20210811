package a7_조건;

public class ElseIf {

	public static void main(String[] args) {
		char c = 'a';		
		
		if(c == 'A') {
			System.out.println("알파벳 A(a)입니다.");
		}else if(c == 'a') {
			System.out.println("알파벳 A(a)입니다."); //원래는 엘스안에 이프문을 썼는데 정리를 하다 보니 깔끔하게 엘스이프문이 됨 
		}else {
			System.out.println("알파벳 A(a)가 아닙니다.");
		}
		//드래그하고 쉬프트 탭하면 나와쓰기 됨

	}

}
