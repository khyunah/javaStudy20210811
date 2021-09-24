package b12_상속;

public class ExtendsEx1 {

	public static void main(String[] args) {

		Son s = new Son();
		
		//재정의해준것 (Son클래스에서 재정의한것으로 계산되서 나옴)
		s.setMoney(10000);
		s.setBuilding("삼정타워2");
		System.out.println(s);

	}
}
