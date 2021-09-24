package b19_스태틱;

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
 * 싱글톤패턴 
 * : 클래스를 하나만 만들때 
 *   예를들면 본사는 하나인것 처럼 하나만 존재해야할때, 
 *   자동차 번호는 겹치면 안되고 유일무이해야하니까 한군데서 관리 
 */