package a8_�ݺ�;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		boolean mainFlag = true;
		
		while(mainFlag) { //Ʈ��� �س����� ���ᰡ �ȵǰ� ��� �ݺ��� �׷��� ����ȭ����
			System.out.println("[���α׷� �޴�]");
			System.out.println("1. ������ ���� ����");
			System.out.println("q. ���α׷� ����");
			System.out.print("����� �Է��ϼ���: ");
			String selecter = in.nextLine(); //���ڿ� �Է�
			
			if (selecter.equals("1")) {
				while(true) {
				System.out.println("[������ ���� ����]");
				System.out.println("1. javaStudy ����");
				System.out.println("b. �ڷΰ���");
				System.out.println("q. ���α׷� ����");
				System.out.print("����� �Է��ϼ��� : ");
				selecter = in.nextLine();		
				
					if(selecter.equals("1")) {
					System.out.println("[javaStudy ����]");					
					}else if(selecter.equals("b")) {
					break; //���⼭ �극��ũ�ϸ� ���������� Ż���ؼ� ó�� ���Ϲ����� �̵��ϰԵ�
					}else if(selecter.equals("q")) {
					System.out.println("���α׷� ������...");//����� �극��ũ �ϸ� �ƿ� ��������� ���� �׷��� ���� �������
					mainFlag = false; //�������� Ʈ�翴�µ� �޽��� ��� ������ �극��ũ����  �����.
					break;
					}else {
					System.out.println("�߸��� �Է��Դϴ�.");
					}
				}

			}else if ( selecter.equals("q")) {
				System.out.println("���α׷� ������...");
				break; //while���ȿ� �ֱ⶧���� ���ѹݺ��Ѵ� �극��ũ ����� ����.
			}else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}System.out.println("���α׷� ���� !");

	}

}
