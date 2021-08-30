package b10_클래스;

public class GetterAndSetter {
	
	
	public static void main(String[] args) {
		Student kim = new Student();
		//kim.name = "김현아"; 이렇게 하면 프라이빗이라 안빌려짐
		//Setter() 그래서 세터 씀
		
		kim.setName("김현아");
		kim.setSchoolName("코리아아이티아카데미");
		kim.setYear(2);
		
		kim.showInfo();
		
	}


}
