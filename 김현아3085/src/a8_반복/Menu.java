package a8_반복;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		boolean mainFlag = true;
		
		while(mainFlag) { //트루로 해놓으면 종료가 안되고 계속 반복됨 그래서 변수화해줌
			System.out.println("[프로그램 메뉴]");
			System.out.println("1. 김준일 강사 폴더");
			System.out.println("q. 프로그램 종료");
			System.out.print("명령을 입력하세요: ");
			String selecter = in.nextLine(); //문자열 입력
			
			if (selecter.equals("1")) {
				while(true) {
				System.out.println("[김준일 강사 폴더]");
				System.out.println("1. javaStudy 폴더");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 프로그램 종료");
				System.out.print("명령을 입력하세요 : ");
				selecter = in.nextLine();		
				
					if(selecter.equals("1")) {
					System.out.println("[javaStudy 폴더]");					
					}else if(selecter.equals("b")) {
					break; //여기서 브레이크하면 이프와일을 탈출해서 처음 와일문으로 이동하게됨
					}else if(selecter.equals("q")) {
					System.out.println("프로그램 종료중...");//여기사 브레이크 하면 아예 종료되지는 않음 그래서 변수 써줘야함
					mainFlag = false; //위에서는 트루였는데 펄스가 됬기 때문에 브레이크땜에  종료됨.
					break;
					}else {
					System.out.println("잘못된 입력입니다.");
					}
				}

			}else if ( selecter.equals("q")) {
				System.out.println("프로그램 종료중...");
				break; //while문안에 있기때문에 무한반복한다 브레이크 써줘야 나감.
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}System.out.println("프로그램 종료 !");

	}

}
