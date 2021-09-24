package b19_스태틱;

public interface Connector {

	public static void connect() {
		System.out.println("연결되었습니다.");
	}
}

/*
 * Static 
 * : 사전적으로 정적이다 라는 뜻.(정적 : 초기에 만들어져 있어서 움직이지 않는, 동적 : 추가 삭제가 가능하며 움직이는)
 *   메모리의 주소가 변하지않는다.
 *   컴파일할때 static먼저 시작이야 제일 먼저 올라간다.
 *   생성을 하지않아도 주소가 정해지며 호출을 할수있다.(예를들면 Integer.parseInt 처럼 Integer는 인터페이스이고 인터페이스는 생성이 안됨 하지만 .을 찍고 사용가능하다)
 *   static은 이탤릭체로 자동변경됨(글씨체가 옆으로 누워있는거)
 *   private으로 생성한 생성자는 외부에서 생성을 못한다 그거를 static 으로 리턴할수 있다 (get을 통해서)
 *   싱글톤패턴 변수는 보통 instance로 쓴다
 *   
 */
