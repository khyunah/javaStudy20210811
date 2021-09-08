package b12_상속;

public class Father {
	private String lastName;
	private int money;
	private String building;
	
	public Father() {
		 System.out.println("아버지 생성");
	}
	
	
	
	public Father(String lastName, int money, String building) {
		super();
		this.lastName = lastName;
		this.money = money;
		this.building = building;
	}



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
	/*
	 * 오버라이드 : 재정의하는것
	 * 오버라이드하게 되면 부모클래스의 변수가 자식 클래스의 것이 되는것처럼 자식꺼 실행
	 */
	
	
	

}
