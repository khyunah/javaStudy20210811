package b12_���;

import java.util.Iterator;

public class Animals {
	public static void main(String[] args) {
		Human h = new Human();
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		
		h.move();
		t.move();
		e.move();	
		
		//������, ĳ���� 
		Animal [] a = new Animal[3];
		a[0] = new Human();  // ��ĳ����. �ִϸ��� ����(�θ�Ŭ�����ϱ�) 
		a[1] = new Tiger();    //Animal a = new Tiger �̰Ŷ� ������
		a[2] = new Eagle();
		
		//for each��
		//�迭 a�� ���� �ݺ��Ҷ��� ���
		for(Animal ani : a) {
			ani.move();
		}
		//���Ͱ��� ���ε� ������ �ξ� ������
		for (int i = 0; i < a.length; i++) {
			Animal ani=a[i];
			ani.move();
		}
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
}

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("�������� ������ ��� ���ϴ�.");
	}
}