package b10_Ŭ����;

public class CarTest {
	public static void main(String[] args) {
		
		Car sonata = new Car();
		Car k7 = new Car();
		Car tesla_model3 = new Car();
		
		sonata.setCompany("�����ڵ���");
		sonata.setModel("�ҳ�Ÿ");
		sonata.setColor("��");
		sonata.setYear(2019);
		
		k7.setCompany("KIA�ڵ���");
		k7.setModel("k7");
		k7.setColor("ȭ��Ʈ");
		k7.setYear(2020);
		
		tesla_model3.setCompany("tesla");
		tesla_model3.setModel("tesla");
		tesla_model3.setColor("ȭ��Ʈ");
		tesla_model3.setYear(2021);
		
		sonata.carInfo();
		k7.carInfo();
		tesla_model3.carInfo();
		
		
		//sonata ������
		//������ : ���� �ڵ���
		// �� : �ҳ�Ÿ
		//���� : ��
		//���� :2019
		
		//k7
		//������ : KIA�ڵ���
		//�� : k7
		//���� : ȭ��Ʈ
		//���� :2020
		
		//tesla_model3
		//������ : tesla
		//�� : model3
		//���� :ȭ��Ʈ
		//���� : 2021
		
		
	}

}
