package b12_상속;

public class Son extends Father{
	
	//Son만 가지고 있는 객체
	private int Bitcoin;
	
	public Son() {
		super("김",10000,"삼정타워");  //super가 생략되어 있어도 아빠생성자 존재해있는거 new Father 랑 똑같은거 
		System.out.println(super.toString());//여기서 super은 Father이랑 똑같음, 객체화를 안해줘서 바로접근
		System.out.println("아들 생성");
	}
	
	@Override //어노테이션이라고함 
	public void setLastName(String lastName) {
		super.setLastName(lastName);
	}
	
	@Override 
	public void setMoney(int money) {
		super.setMoney((int)(money * 1.1)); //0.01이라는 실수가 들어가니까 int로 형변환
	}
	
	public int getBitcoin() {
		return Bitcoin;
	}
	public void setBitcoin(int bitcoin) {
		Bitcoin = bitcoin;
	}
}
