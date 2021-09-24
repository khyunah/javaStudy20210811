package b19_����ƽ;

public class KIA {
	
	private static KIA instance = new KIA();
	private int serialNum = 20210001;
	
	private KIA() {
		
	}
	
	public static KIA getInstance() {
		
		//Ȥ�� ���� ���ų� �Ȼ����� ��츦 ����ؼ� 
		if(instance == null) {
			instance = new KIA();					
		}
		return instance;
	}
	
	public Car createCar(String model) {
		return new Car(serialNum++, model);
	}
}