package a6_표준입력;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// String은 기본제공 클래스
		// Scanner는 외부 클래스
		// ctrl 쉬프트 o는 해야할거 전부 임폴트 시켜버림
		
		Scanner input = new Scanner(System.in);
		//new는 생성하라는 뜻,  시스템 . 인 이라는 운영체제를 품은 상태의 스캐너로 스캔
		System.out.println("숫자 2개를 입력해 주세요.");
		System.out.println("첫번째 수  :");		
		String str = input.nextLine();
		System.out.println("두번째 수  :");
		String str2 = input.nextLine();
		
		//next : 한단어 띄어쓰기를 만나기 전까지의 ,
		//nextLine : 한줄에 모든 글자 기호 띄어쓰기 다 포함
		
		System.out.println("결과 : ");
		System.out.println(Integer.parseInt(str)+Integer.parseInt(str2));
		//int i = Integer.parseInt(str);
		//int i2 = Integer.parseInt(str2); 위의 형변환이나 이거나 똑같이 변환됨
		//System.out.println(i+i2);
		

	}

}
