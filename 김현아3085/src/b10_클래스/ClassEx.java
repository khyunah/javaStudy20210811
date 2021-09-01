package b10_클래스;

/*
 *  자료형의 종류
 *  1. 일반 자료형 (int, double, char, boolean)
 *  2. 참조 자료형 (클래스, 배열)->String, 클래스명, 배열[]
 * 
 */

class Phone{
	private String company;
	private String model;
	private String color;
	private String newsAgency;
	private int d_ram;
	private String phoneCase;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}	
	
	public Phone() {
		System.out.println("새로운 phone을 생성하였습니다.");
	}
	public Phone (String company) {
		System.out.println("두번째 생성자로 만든 Phone");
		this.company=company;
	}
	

}

public class ClassEx {
	public static void main(String[] args) {
		System.out.println(new Phone("Apple")); //뉴는 주소값을 생성한다 그래서 생성된 생성자의 변수명을 이용하면 그 주소값을 참조해서 그 클래스안의 변수이용가능
		Phone p = new Phone() ;
		Phone p2 = new Phone();
		
		p.setModel("iPhone");
		p2.setModel("galaxy");
		p.getModel();

		
		
	}

}
