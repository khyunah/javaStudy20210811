package b19_����ƽ;

public class SingleTon {
	
	public static void main(String[] args) {
		
		KIA factory1 =KIA.getInstance();
		KIA factory2 =KIA.getInstance();
		KIA factory3 =KIA.getInstance();
		KIA factory4 =KIA.getInstance();
		KIA factory5 =KIA.getInstance();
		
		Car k3 = factory1.createCar("k3");
		Car k5 = factory2.createCar("k5");
		Car k7 = factory3.createCar("k7");
		Car k8 = factory4.createCar("k8");
		Car ev6 = factory5.createCar("ev6");
		
		k3.catInpo();
		k5.catInpo();
		k7.catInpo();
		k8.catInpo();
		ev6.catInpo();
	}
}

/*
 * �̱������� 
 * : Ŭ������ �ϳ��� ���鶧 
 *   ������� ����� �ϳ��ΰ� ó�� �ϳ��� �����ؾ��Ҷ�, 
 *   �ڵ��� ��ȣ�� ��ġ�� �ȵǰ� ���Ϲ����ؾ��ϴϱ� �ѱ����� ���� 
 */