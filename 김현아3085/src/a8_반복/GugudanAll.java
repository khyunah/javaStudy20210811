package a8_반복;

import java.util.Scanner;

public class GugudanAll {

	public static void main(String[] args) {
		//구구단 전체
		for(int i =0; i<8; i++) {
			int i2 = i+2;
			System.out.println( i2 +"단");
			for(int j = 0; j<9; j++) {
				int j2 = j +1;
				System.out.println(i2 +"X"+j2 + "="+(i2*j2));
			}
			System.out.println();
		}
		
		//원하는 단 입력받기
		System.out.println("몇단부터 몇단까지 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		for(num1 =0; num1 <num2+1; num1++) {//포문안에서 보통은 <=이거 자주 안쓴다 그래서 <> 이걸로 이용하고 변수에 +1 이런식으로 해주기
//		for(; num1 <num2+1; ++)	이렇게 생략도 가능, 세미콜론 저거는 지우면안된다.
			System.out.println( num1 +"단");
			for(int j = 0; j<9; j++) {
				int j2 = j +1;
				System.out.println(num1 +"X"+j2+ "="+(num1*j2));
		
			}
			System.out.println();
		}

	}

}
