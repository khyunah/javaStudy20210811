package b11_배열;

/*
 * 배열 Array
 * 같은 자료형끼리의 묶음.
 * index인덱스 
 * index연산자 기호 [] 대괄호
 * 
 */

public class ArrayEx1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		//배열 선언 및 대입방법 1
		int[] num = new int[100];
		//여기서의 num 은 배열의 시작주소값이 들어있음
		//이렇게 선언하고 
		//num = new int[] {10,20,30,40,50};
		//num = {10,20,30,40,50};
		//이렇게 사용불가, 하나씩 쓰거나 for문사용해야됨
		
		for(int i =0; i<100; i++) {
			num[i]=i*10;
		}
		for(int i =0; i<100;i++) {
			System.out.println(num[i]);
		}
		//밑에 값을 넣은거 for 문으로 한번에 값을 넣는다.
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		//방법 2
		int[] arr_i = new int[] {10,20,30,40,50};
		int[] arr_i2 = {10,20,30,40,50}; //뉴인트가 생략가능
		
		for(int i = 0; i<5; i++) {
			System.out.println(arr_i[i]);
		}
		for(int i = 0; i<5; i++) {
			System.out.println(arr_i2[i]);
		}		
	}


}
