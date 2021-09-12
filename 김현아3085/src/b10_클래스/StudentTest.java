package b10_클래스;

public class StudentTest {
	public static void main(String[] args) {

		Student kim = new Student("김현아","USA아이티",4);  //null :주소가없다라는 뜻 아무런 값이 없음
		kim.getFreebies();  //사은품 대상자인지
		Student lee = new Student("이지원", 2); //오버로딩을 할때에는(매개변수가 하나라도) 무조건 기본생성자가 있어야한다.
		lee.getFreebies();
		Student park = new Student("박호훈","코리아아이티",3);
		park.getFreebies();
		
		kim.showInfo();	
				
		Integer i = new Integer(100);
		
		System.out.println(kim.hashCode()); //주소값나오는데 이거는 힙메모리에 저장됨(빌려서저장된것)
		System.out.println(i.hashCode());   //hashCode : 주소값				
	}

}
