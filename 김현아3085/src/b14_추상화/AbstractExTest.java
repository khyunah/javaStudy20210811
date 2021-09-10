package b14_추상화;

public class AbstractExTest {
	public static void main(String[] args) {
		//추상클래스는 생성은 불가능 하지만 업캐스팅하여 사용은 가능하다.
		//Abstract absEx = new AbstractEx(); 생성불가
		AbstractEx absEx = new AbstractExExten();
		AbstractEx absEx2 = new AbstractEx2Exten();
	
	

}
}