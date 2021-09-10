package b13_다형성;

import b12_상속.Animal; 


class Human extends Animal{
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Tiger extends Animal{
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
}

class Eagle extends Animal{
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
	
	@Override
	public void move() {
		System.out.println("독수리는 날개를 펴고 납니다.");
	}
}



public class AnimalTest {

	Animal[] list = new Animal [3];
	public void addAnimal() {
		list[0] = new Human();
		list[1] = new Tiger();
		list[2]= new Eagle();
		
	}
	
	public void animalMove() {
		for(Animal ani : list) {
			ani.move();
			
		}
	}
	
	public void casting() {
		for(Animal ani : list) {
			if(ani == null) {
				continue;
			}
			if(ani instanceof Human) {
				Human h = (Human)ani; //형변화하듯이 앞에 명시적형변환시켜줌
				h.readBook();
			}else if (ani instanceof Tiger) {
				Tiger h =(Tiger)ani;
				h.hunting();
			}else if (ani instanceof Eagle) {
				Eagle h =(Eagle)ani;
				h.flying();
			}else {
				System.out.println("지원하지않은 형식입니다");
			}
		}
	}
	
	public static void main(String[] args) {
		AnimalTest aniTest = new AnimalTest();
		
		//업캐스팅 Animal <- Human, Tiger, Eagle
		aniTest.addAnimal(); // 이거는 밑에호출을 도와준다 list배열안에 각 무슨 값이 들어있는지 초기화해서 알려준것
		aniTest.animalMove();
		
		System.out.println("----------------------");
		
		//다운캐스팅
		aniTest.casting();
		

	}

}
