package a9_메소드;

//void:메소드 리턴을 해야하지만 보이든 한번 하고 끝.
/* 자바안에서 함수는 함수라고 안함 메소드라고 한다.
 * 클래스 안에 정의된 함수는 전부 메소드.
 * (c언어에서는 클래스가 없어서 함수라고 부른다. 클래스안에서 정의되었으면 메소드 밖이면 함수)
 * 메소드를 사용할때는 ()를 사용한다 (단, 키워드는 제외 ex, for문 while문)
 * 메소드 선언 :
 * boolean       regStudent   (String name){
 * (리턴(반환)타입) (메소드이름)    (파라미터, 매개변수(인자값)
 *                             : String형태의 저장공간(그릇)만 받을수있다.                            
 *                 : 저런 동작을 한다라는 의미 (레지스트)
 *                 변수명 짓는것과 똑같음.  
 *                 변수명과 메소드 다른것 : 메소드는 동작을 하
 *                 는것 (동사형)
 *                 					   변수는 이름이라 명사 타입
 * ..........
 * return true; (트루자리에 변수 , 값 , 상수 ,false일수도있음)
 *        (반환값(변수또는 상수)
 * }
 * 
 */
public class Bingsu {
	
	String toMake(String material, int materialCount, String material2) {
		String bingsu = material +materialCount +"개와 "+material2+"가 들어간 빙수";
		 return bingsu;	 	
	}
	
	void voidTest() {
		System.out.println("보이드 테스트 메소드");
	}

	public static void main(String[] args) {	
		Bingsu b = new Bingsu();
		
		String material = "딸기";
		
		String bingsu1 = b.toMake(material, 10, "연유");//위에 클래스에서 선언된 순서대로 대입된다.
		String bingsu2 = b.toMake("청포도", 10, "연유");
		String bingsu3 = b.toMake("망고", 10, "연유");
		String bingsu4 = b.toMake("초코", 10, "연유");
		
		System.out.println(bingsu1);
		System.out.println(bingsu2);
		System.out.println(bingsu3);
		System.out.println(bingsu4);
		b.voidTest();
		
	}

}
