package a9_�޼ҵ�;

import java.util.Scanner;

public class Quiz {
	

	
	void procStart(){
	  if("1"){
	      void quiz1(){
	    	  for(int i=0; i<4; i++) {
					for(int j = 0; j<i+1;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				System.out.println();
	      }
	   } else if("2"){
		      void quiz2("10"){
		    	  for(i=0; i<4;i++) {
		  			for(int j = 0; j+4>i;j--) {
		  				System.out.print("*");
		  			}
		  			System.out.println();
		  		}
		  		System.out.println();
		      }
	    }else if("3"){
		      void quiz3("10"){
		    	  for(i=0;i<4;i++) {				
		  			for(int j = 0; j+3>i;j--) {								
		  			System.out.print(' ');				
		  			}
		  			for(int k = 0; k<i+1;k++) {
		  			System.out.print("*");
		  			}
		  			System.out.println();
		  		}
		  		System.out.println();
		      }
	    }else if("4"){
		      void quiz4("10"){
		    	  for(i=0;i<4;i++) {
		  			for(int j = 0; j<i;j++) {
		  			System.out.print(' ');
		  			}
		  			for(int k=0; k+4>i; k--) {
		  			System.out.print("*");		
		  			}
		  			System.out.println();			
		  		}
		  		System.out.println();
		      }
	    }else if("5"){
		      void quiz5("10"){
		    	  for(i=0; i<4;i++) {
		  			for(int j=0;j<3-i;j++) {
		  			System.out.print(" ");
		  			}			
		  			for(int k = 0; k<i+(i+1);k++) {				
		  			System.out.print("*");			
		  			}
		  			System.out.println();
		  		}
		  		System.out.println();
		  		
		      }
	    }
	}
		      
	    	  

	

	public static void main(String[] args) {
		

	
		
		
		/*
		 * [����� ���α׷�]
		 * 1. ����1 
		 * 2. ����2
		 * 3. ����3
		 * 4. ����4
		 * 5. ����5
		 * q. ���α׷� ����
		 * ����� �Է��ϼ���:
		 *  
		 * ����� ���� ������ �Է��ϼ��� : 
		 * 
		 * 
		 * ��ɿ��� 1-5������ ����� ���� ���� 
		 * �� ���� 10 
		 * 
		 * void procStart(��� ��ȣ){
		 * if(1���̸�){
		 *     void quiz1(���ǰ���){
		 *     		for()
		 *     }
		 *     for�� ������ ���� �ٽ� ����� ���α׷��� ������ 
		 * 
		 * }else if(2���̸�){
		 * }......
		 */
		//ù��° �Է� : 

		Scanner in = new Scanner(System.in);
		Num n = new Num();
		
		boolean mainFlag = true;
		
		while(mainFlag) {
			System.out.println("[����� ���α׷�]");
			System.out.println("1. ����1");
			System.out.println("2. ����2");
			System.out.println("3. ����3");
			System.out.println("4. ����4");
			System.out.println("5. ����5");
			System.out.println("q. ���α׷� ����");
			System.out.print("����� �Է��ϼ���: ");
			String selecter = in.nextLine(); 
			
			if (in.equals("1")) {
				while(true) {
				System.out.println("����� ���� ������ �Է��ϼ��� : ");
				System.out.println("b. �ڷΰ���");
				System.out.println("q. ���α׷� ����");
				selecter = in.nextLine();		
				
				if(in.equals("10")) {
					n.procStart();
				}else if(in.equals("b")) {
					break;
				}else if(in.equals("q")) {
					System.out.println("���α׷� ������...");
					mainFlag = false; 
					break;
				}else {
					System.out.println("�߸��� �Է��Դϴ�.");
				}
				} 
			}else if (in.equals("q")) {
				System.out.println("���α׷� ������...");
				break; 
			}else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			
						
		}System.out.println("���α׷� ���� !");
	}

}
