package a9_메소드;

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
<<<<<<< HEAD
		 * [별찍기 프로그램]
		 * 1. 문제1 
		 * 2. 문제2
		 * 3. 문제3
		 * 4. 문제4
		 * 5. 문제5
		 * q. 프로그램 종료
		 * 명령을 입력하세요:
		 *  
		 * 출력할 별의 개수를 입력하세요 : 

		 * static이 안붙어있으면 바로 사용이 가능하다 

		 * 
		 */

		//첫번째 입력 : 

		Scanner in = new Scanner(System.in);
		Quiz n = new Quiz();
		
		boolean mainFlag = true;
		
		while(mainFlag) {
			System.out.println("[별찍기 프로그램]");
			System.out.println("1. 문제1");
			System.out.println("2. 문제2");
			System.out.println("3. 문제3");
			System.out.println("4. 문제4");
			System.out.println("5. 문제5");
			System.out.println("q. 프로그램 종료");
			System.out.print("명령을 입력하세요: ");
			String selecter = in.nextLine(); 
			
			if (in.equals("1")) {
				while(true) {
				System.out.println("출력할 별의 개수를 입력하세요 : ");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 프로그램 종료");
				selecter = in.nextLine();		
				
				if(in.equals("10")) {
					n.procStart();
				}else if(in.equals("b")) {
					break;
				}else if(in.equals("q")) {
					System.out.println("프로그램 종료중...");
					mainFlag = false; 
					break;
				}else {
					System.out.println("잘못된 입력입니다.");
				}
				} 
			}else if (in.equals("q")) {
				System.out.println("프로그램 종료중...");
				break; 
			}else {
				System.out.println("잘못된 입력입니다.");
			}
			
						
		}System.out.println("프로그램 종료 !");

		
		
		
		

	}

}
