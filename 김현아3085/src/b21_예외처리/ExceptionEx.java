package b21_예외처리;

public class ExceptionEx {
	
	public static void arrTest() throws ArrayIndexOutOfBoundsException{
		
		int [] arr = new int[5];
		
		for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}	
	}

	public static void main(String[] args) throws Exception{ //메인메소드에서 throws해주면 jvm이 처리해줌
		
		//try안에는 오류가 날것같은 코드를 넣어준다
		try {
			ExceptionEx.arrTest();	
			
		} catch(ArrayIndexOutOfBoundsException e) {	
			System.out.println("배열의 크기를 초과하여 대입하였습니다.");
			
		} catch (Exception e) {//어떤오류가 났는지 몰라도 Exception(최상급)으로 모두 처리가 가능하다.
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료.");
	}
}

/*
 * Exception 예외 
 * 1. 문법(소스코드)오류
 * 2. 컴파일오류
 * 3. 버그 : 개발자가 의도한대로 작동하지않을때(목적과 다르게) (오류와는 다른 느낌)
 * 
 * throws 호출한 위치로 예외미루기
 * 
 * 
 */