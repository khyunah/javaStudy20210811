package b12_상속;

import java.util.Iterator;

public class Animals {
	public static void main(String[] args) {
		Human h = new Human();
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		
		h.move();
		t.move();
		e.move();	
		
		//다형성, 캐스팅 
		Animal [] a = new Animal[3];
		a[0] = new Human();  // 업캐스팅. 애니멀이 높음(부모클래스니까) 
		a[1] = new Tiger();    //Animal a = new Tiger 이거랑 같은거
		a[2] = new Eagle();
		
		//for each문
		//배열 a를 전부 반복할때만 사용
		for(Animal ani : a) {
			ani.move();
		}
		//위와같은 식인데 위에꺼 훨씬 간단함
		for (int i = 0; i < a.length; i++) {
			Animal ani=a[i];
			ani.move();
		}
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
}

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리는 날개를 펴고 납니다.");
	}
}