package b12_���;

public class Son extends Father{
	
	//Son�� ������ �ִ� ��ü
	private int Bitcoin;
	
	public Son() {
		super("��",10000,"����Ÿ��");  //super�� �����Ǿ� �־ �ƺ������� �������ִ°� new Father �� �Ȱ����� 
		System.out.println(super.toString());//���⼭ super�� Father�̶� �Ȱ���, ��üȭ�� �����༭ �ٷ�����
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
