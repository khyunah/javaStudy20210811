package b19_스태틱;

public class StaticTest {

	public static void main(String[] args) {
		
		Connector.connect();
		
		//클래스를 사용할때 이런식으로 해야하는데 static은 바로 접근 가능
		//Integer i = new Integer(10); (x)
		//Integer.parseInt             (o)
		
		Student s1 = new Student("김준일");
		Student s2 = new Student("정상우");
		Student s3 = new Student("김현아");
		Student s4 = new Student("김윤하");
		
		//static이 없었으면 학번이 모두 20210001인데 static으로 전체적으로 공유해서씀
		s1.showInpo();
		s2.showInpo();
		s3.showInpo();
		s4.showInpo();
	}
}
