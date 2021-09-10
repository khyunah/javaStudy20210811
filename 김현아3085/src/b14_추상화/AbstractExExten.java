package b14_추상화;


//이 변수명을 쓰긴 쓸건데 오버라이드할게 생각이 안날때 잠시 보류 느낌으로 클래스앞에 abstract붙여줌
abstract class AbstractEx3Exten extends AbstractEx{

		
	
		
}

class AbstractEx2Exten extends AbstractEx{
	@Override
	void printName() {
		System.out.println("김 준일");
		
	}
		
}

public class AbstractExExten extends AbstractEx{
	@Override
	void printName() {
		System.out.println("김 준일");
		
	}
	

}
