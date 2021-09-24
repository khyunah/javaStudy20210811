package b14_추상화;

public class AbstractExTest {
	public static void main(String[] args) {
		//추상클래스는 생성은 불가능 하지만 업캐스팅하여 사용은 가능하다.
		//AbstractEx absEx = new AbstractEx(); 생성불가
		
		//생성자가 아니기때문에 바로 호출해오지 않는다.
		AbstractEx absEx = new AbstractExExten();
		AbstractEx absEx2 = new AbstractEx2Exten();
		
		//따로 호출을 해줘야함
		absEx.printName();
		absEx2.printName();
	}
}

