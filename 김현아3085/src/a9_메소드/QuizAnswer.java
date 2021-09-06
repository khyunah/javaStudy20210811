package a9_�޼ҵ�;

import java.util.Scanner;

public class QuizAnswer {
	
	public void quiz1(int starCount) {
		for(int i = 0; i < starCount; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void quiz2(int starCount) {
		for(int i = 0; i < starCount; i++) {
			for(int j = 0; j < starCount-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void quiz3(int starCount) {
		for(int i = 0; i < starCount; i++) {
			for(int j = 0; j < starCount-i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void quiz4(int starCount) {
		for(int i = 0; i < starCount; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < starCount-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void quiz5(int starCount) {
		for(int i = 0; i < starCount; i++) {	
			for(int j = 0; j < starCount - i + 1; j++)	{				
				System.out.print(" ");					
			}
			for(int j = 0; j < (i*2)+1; j++)	{				
				System.out.print("*");				
			}
			System.out.println();			
		}	
	}
	
	public void procStart(String selector, int starCount) {
		if(selector.equals("1")) {
			quiz1(starCount);
		} else if(selector.equals("2")) {
			quiz2(starCount);
		} else if(selector.equals("3")) {
			quiz3(starCount);
		} else if(selector.equals("4")) {
			quiz4(starCount);
		} else {
			quiz5(starCount);
		}
	}
	
	public void mainMenuPrint() {
		System.out.println("[����� ���α׷�]");
		System.out.println("1. ����1");
		System.out.println("2. ����2");
		System.out.println("3. ����3");
		System.out.println("4. ����4");
		System.out.println("5. ����5");
		System.out.println("q. ���α׷� ����");
	}
	
	
	public static void main(String[] args) {
		QuizAnswer m = new QuizAnswer();
		Scanner in = new Scanner(System.in);
		boolean loopFlag = true;
		
		while(loopFlag) {
			m.mainMenuPrint();
			System.out.print("����� �Է��ϼ���: ");
			String selector = in.nextLine();
			
			if(selector.equals("1") || selector.equals("2") || selector.equals("3") 
					|| selector.equals("4") || selector.equals("5")) {
				
				System.out.print("����� ���� ������ �Է��ϼ���: ");
				int starCount = in.nextInt();
				in.nextLine();
				
				m.procStart(selector, starCount);
				
			}else if(selector.equals("q")) {
				
				System.out.println("���α׷� ������...");
				loopFlag = false;
				
			}else {
				
				System.out.println("�߸��� �Է��Դϴ�.");
				
			}
			System.out.println();
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
	}
	
	
	/*
	 * [����� ���α׷�]
	 * 1. ����1
	 * 2. ����2
	 * 3. ����3
	 * 4. ����4
	 * 5. ����5
	 * q. ���α׷� ����
	 * ����� �Է��ϼ���: 1
	 * 
	 * ����� ���� ������ �Է��ϼ���: 10
	 * 
	 * void procStart(��� ��ȣ, 10){
	* 		if(1���̸�){
	* 			void quiz1(���� ����){
	* 				for()
	* 			}
	* 		} else if(2���̸�){
	* 
	* 		}
	 * }
	 * 
	 */
	//ù��° �Է�: 
}