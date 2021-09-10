package b15_인터페이스;
/* 인터페이스(Interface)
 * 
 * : 예를들어 내가 빔을 켜려고 하는데 리모컨이 그사이를 연결해주는 기능을 하는 것(약속된것안에서)
 * 안에는 모든것이 추상클래스,메소드
 * 구현을 하게되면 오버라이드해줘야한다.(상속이아니라 구현이라 한다.implement)
 * 구현은 다중구현이 가능하다(상속은불가능)
 * 
 * 인터페이스안에는 abstract안붙여줘도 모든 메소드가 추상메소드이다.
 */

public interface Switch {
	public void on();
	public void off();
	
}
