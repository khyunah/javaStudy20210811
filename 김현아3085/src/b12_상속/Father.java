package b12_상속;

public class Father {
	//같이 쓸 객체
	private String lastName;
	private int money;
	private String building;
	
	//기본생성자는 클래스내에 하나는 무조건 필요하고, 만약없으면 컴파일러가 자동으로 생성해줌
	public Father() {
		 System.out.println("아버지 생성");
	}
	//생성자 Constructor
	public Father(String lastName, int money, String building) {
		super();
		this.lastName = lastName;
		this.money = money;
		this.building = building;
	}
	
	//private으로 선언을 했기때문에 재정의 하기위해서는 get, set이 필요
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	
	@Override 
	public String toString() {
		return "Father [lastName=" + lastName + ", money=" + money + ", Building=" + building + "]";
	}

}
