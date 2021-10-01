package b10_클래스;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car sonata = new Car(); 
		Car k7 = new Car();
		Car tesla_model3 = new Car();
		
		sonata.setCompany("현대자동차");
		sonata.setModel("소나타");
		sonata.setColor("블랙");
		sonata.setYear(2019);
		
		k7.setCompany("KIA자동차");
		k7.setModel("k7");
		k7.setColor("화이트");
		k7.setYear(2020);
		
		tesla_model3.setCompany("tesla");
		tesla_model3.setModel("tesla");
		tesla_model3.setColor("화이트");
		tesla_model3.setYear(2021);
		
		sonata.carInfo();
		k7.carInfo();
		tesla_model3.carInfo();
	}
}
