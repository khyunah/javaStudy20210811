package a7_조건;

public class SwitchCase {

	public static void main(String[] args) {
		
		//1번째 예
		char select = 'b';		
		switch(select) {
			case 'a' :
				System.out.println("a입니다.");
				break;
			case 'b' : 
				System.out.println("b입니다.");
				break;
			case 'c' : 
				System.out.println("c입니다.");
				break;
			    //break  제어문 탈출해주는 아이	
			default :
				System.out.println("a,b,c가 아닙니다.");
			//디폴트에는 항상 끝이기때문에 브레이크 필요없음			
		}
		
		//2번째 예제
		int score = 88;
		switch (score / 10) {
			case 10 :System.out.println("100점"); break;
			case 9 :System.out.println("90점대");break;
			case 8 :System.out.println("80점대");break;
			case 7 :System.out.println("70점대");break;
			case 6 :System.out.println("60점대");break;
			case 5 :System.out.println("50점대");break;
			case 4 :System.out.println("40점대");break;
			case 3 :System.out.println("30점대");break;
			case 2 :System.out.println("20점대");break;
			case 1 :System.out.println("10점대");break;
			default :System.out.println("1점대");
		}	
	}
}
