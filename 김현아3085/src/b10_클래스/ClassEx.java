package b10_Ŭ����;

/*
 *  �ڷ����� ����
 *  1. �Ϲ� �ڷ��� (int, double, char, boolean)
 *  2. ���� �ڷ��� (Ŭ����, �迭)->String, Ŭ������, �迭[]
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
		System.out.println("���ο� phone�� �����Ͽ����ϴ�.");
	}
	public Phone (String company) {
		System.out.println("�ι�° �����ڷ� ���� Phone");
		this.company=company;
	}
	

}

public class ClassEx {
	public static void main(String[] args) {
		System.out.println(new Phone("Apple")); //���� �ּҰ��� �����Ѵ� �׷��� ������ �������� �������� �̿��ϸ� �� �ּҰ��� �����ؼ� �� Ŭ�������� �����̿밡��
		Phone p = new Phone() ;
		Phone p2 = new Phone();
		
		p.setModel("iPhone");
		p2.setModel("galaxy");
		p.getModel();

		
		
	}

}
