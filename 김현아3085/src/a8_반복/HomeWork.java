package a8_นÝบน;

public class HomeWork {

	public static void main(String[] args) {
		int i = 0;
		
		
		for(i=0; i<5; i++) {
			for(int j = 0; j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(i=0; i<5;i++) {
			for(int j = 0; j+5>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(i=0;i<5;i++) {				
			for(int j = 0; j+4>i;j--) {								
			System.out.print(' ');				
			}
			for(int k = 0; k<i+1;k++) {
			System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(i=0;i<5;i++) {
			for(int j = 0; j<i;j++) {
			System.out.print(' ');
			}
			for(int k=0; k+5>i; k--) {
			System.out.print("*");		
			}
			System.out.println();			
		}
		System.out.println();
	
		for(i=0; i<5;i++) {
			for(int j=0;j<4-i;j++) {
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
