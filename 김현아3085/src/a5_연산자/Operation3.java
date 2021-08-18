package a5_연산자;

public class Operation3 {
	public static void main(String[] args) {
	
		// 위에 문장을 그대로 복사하고 싶을때 그 문장에 커서 올리고 컨트롤 알트 방향아래키
		//sysout 치고 컨트롤 스페이스 하면 시스템 아웃 프린트라인 나옴
		
		// 조건 연산자
		
		String weather = "비";
		
		System.out.println((weather == "맑음" ? "우산을 가져가지 않는다." :  "우산을 챙긴다.") == "우산을 챙긴다." ? "고데기를 안한다." : "고데기를 한다.");
	
		
		
	}

}
