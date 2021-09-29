package a7_조건;

import java.util.Scanner;

public class Quiz2753 {

	public static void main(String[] args) {
		//윤년인가 아닌가 확인
		//해당년도 4의배수이면서 100의 배수가 아니거나 400의 배수이다.
		
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
			
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년입니다.");		
		}else {
			System.out.println("윤년이 아닙니다.");
		}
	}
}
