package a6_표준입력;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// String은 기본제공 클래스
		// Scanner는 외부 클래스
		// ctrl 쉬프트 o는 해야할거 전부 임폴트 시켜버림
		
		Scanner input = new Scanner(System.in);

		System.out.println("숫자 2개를 입력해 주세요.");
		
		System.out.print("첫번째 수  :");		
		String str = input.nextLine();
		
		System.out.print("두번째 수  :");
		String str2 = input.nextLine();

		System.out.print("결과 : ");
		System.out.println(Integer.parseInt(str)+Integer.parseInt(str2));
		
		//int i = Integer.parseInt(str);
		//int i2 = Integer.parseInt(str2); 위의 형변환이나 이거나 똑같이 변환됨
		//System.out.println(i+i2);
	}
}
