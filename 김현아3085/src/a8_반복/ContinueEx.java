package a8_반복;

public class ContinueEx {

	public static void main(String[] args) {
		for(int i = 0; i < 10 ; i++) {
			if(i%2 == 0) {
				System.out.println(i+"은(는) 짝수입니다.");
				continue;
				//컨티뉴는 if 저 조건식을 만족할때에 컨티뉴 이하에 있는 명령을 하지않고 
				//다시 처음으로 돌아가 증감시키고 실행한다 증감이 되어 3이 되었을때
				//if조건식에 맞지않으므로 컨티뉴가 작동안되고 밑에 홀수입니다가 출력됨.
			}
			System.out.println(i+"은(는) 홀수입니다.");
		}

	}

}
