package b12_���;

public class Son extends Father{

	private int Bitcoin;
	
	public Son() {
		super("��",10000,"����Ÿ��");  // ������ �Ǿ� �־ �ƺ������� �������ִ°� new Father �� �Ȱ����� 
		System.out.println(super.toString());
		System.out.println("�Ƶ� ����");
		

		
	}
	
	@Override //������̼��̶���� 
	public void setLastName(String lastName) {
		super.setLastName(lastName);
	}
	
	@Override 
	public void setMoney(int money) {
		super.setMoney((int)(money * 1.1)); //0.01�̶�� �Ǽ��� ���ϱ� int�� ����ȯ
	}
	

	public int getBitcoin() {
		return Bitcoin;
	}
	public void setBitcoin(int bitcoin) {
		Bitcoin = bitcoin;
	}


}
