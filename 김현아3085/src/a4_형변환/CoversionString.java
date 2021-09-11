package a4_형변환;

public class CoversionString {

	public static void main(String[] args) {
		// 문자열(String)의 자동형변환
		int num = 10;
		int num2 = 10;
		String sNum = "10";
		//= String sNum = ""+10; 
		
		System.out.println(num + num2 + sNum );
		System.out.println(sNum + num + num2 );
		//문자열과 연산을 할때 순서 중요
		
		
		// 문자열 -> 다른 자료형(boolean, int, double)
		
		//1. int(정수) : integer.palseInt("문자열");
		int i = Integer.parseInt("10");  //이렇게하면 문자열인 10이 정수 10 이 된다
		//Integer클래스타입안에 int로 파싱해주는 것
		
		//2. double(실수)
		double d = Double.parseDouble("10.1");
		//int d = (int)Double.parseDouble("10.1"); 문자열을 더블로 바꾸고 다시 정수로 형변환 한것
		
		//3. boolean(논리)
		boolean b =Boolean.parseBoolean("true");
		
		
		//다른자료형 -> 문자열
		// int(정수) : Integer.toString(정수);
		String s = Integer.toString(10);
		
		Double.toString(10.2);
		Boolean.toString(false);

	}

}
