package a9_�޼ҵ�;

//void:�޼ҵ� ������ �ؾ������� ���̵� �ѹ� �ϰ� ��.
/* �ڹپȿ��� �Լ��� �Լ���� ���� �޼ҵ��� �Ѵ�.
 * Ŭ���� �ȿ� ���ǵ� �Լ��� ���� �޼ҵ�.
 * (c������ Ŭ������ ��� �Լ���� �θ���. Ŭ�����ȿ��� ���ǵǾ����� �޼ҵ� ���̸� �Լ�)
 * �޼ҵ带 ����Ҷ��� ()�� ����Ѵ� (��, Ű����� ���� ex, for�� while��)
 * �޼ҵ� ���� :
 * boolean       regStudent   (String name){
 * (����(��ȯ)Ÿ��) (�޼ҵ��̸�)    (�Ķ����, �Ű�����(���ڰ�)
 *                             : String������ �������(�׸�)�� �������ִ�.                            
 *                 : ���� ������ �Ѵٶ�� �ǹ� (������Ʈ)
 *                 ������ ���°Ͱ� �Ȱ���.  
 *                 ������� �޼ҵ� �ٸ��� : �޼ҵ�� ������ ��
 *                 �°� (������)
 *                 					   ������ �̸��̶� ��� Ÿ��
 * ..........
 * return true; (Ʈ���ڸ��� ���� , �� , ��� ,false�ϼ�������)
 *        (��ȯ��(�����Ǵ� ���)
 * }
 * 
 */
public class Bingsu {
	
	String toMake(String material, int materialCount, String material2) {
		String bingsu = material +materialCount +"���� "+material2+"�� �� ����";
		 return bingsu;	 	
	}
	
	void voidTest() {
		System.out.println("���̵� �׽�Ʈ �޼ҵ�");
	}

	public static void main(String[] args) {	
		Bingsu b = new Bingsu();
		
		String material = "����";
		
		String bingsu1 = b.toMake(material, 10, "����");//���� Ŭ�������� ����� ������� ���Եȴ�.
		String bingsu2 = b.toMake("û����", 10, "����");
		String bingsu3 = b.toMake("����", 10, "����");
		String bingsu4 = b.toMake("����", 10, "����");
		
		System.out.println(bingsu1);
		System.out.println(bingsu2);
		System.out.println(bingsu3);
		System.out.println(bingsu4);
		b.voidTest();
		
	}

}
