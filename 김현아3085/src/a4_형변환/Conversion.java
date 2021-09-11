package a4_형변환;

public class Conversion {

	public static void main(String[] args) {
		//업캐스팅
		//1. 문자형 -> 정수
		char c = 'A';
		int i_c = c;
		System.out.println("문자 -> 정수: " + i_c);
		//2. 정수 -> 실수
		int num = 100;
		double d_num = num;
		System.out.println("정수 -> 실수 : " + d_num);
		//3. 문자형 + 정수 = 정수
		System.out.println("문자 + 정수 = " + (c + num));
		
		
		//다운캐스팅
		//1. 정수를 문자로 
		int i = 67;
		//char c_i = i; 이렇게하면 오류남. 작은그릇에 큰그릇에 있던걸 부으려니 넘쳐서 안됨.
		char c_i = (char)i;
		System.out.println("정수 -> 문자 : " + c_i);
		//2. 실수를 문자로
		double d_num2 = 1.45;
		int num2 = (int)d_num2;
		System.out.println("실수 -> 정수 : " + num2);

		
		
	}

}
