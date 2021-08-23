package a8_반복;

public class While {

	public static void main(String[] args) {
		
		int num = 1;
		int result = 0;
		while(num<=100) {
			result +=num;
			num++; //반복후 작업처리
					
		}
		
		System.out.println(result);

	}

}
