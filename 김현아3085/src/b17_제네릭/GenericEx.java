package b17_���׸�;

/*
 * Generic (���׸�)
 * Ŭ���� ������ �ڷ����� ���ϴ� ���·� ������ �� �ִ�.
 * 
 * 
 */

public class GenericEx<T> {
	T generic;
	public T getGeneric(T t) {
		T t2 = t;
		return t2;
	}
	
	public static void main(String[] args) {
		//StringŸ������
		GenericEx<String> gex = new GenericEx<String>();
		String str = gex.getGeneric("������");
		
		//intŸ������
		GenericEx<Integer> gex2 = new GenericEx<Integer>();
		Integer num1 = gex2.getGeneric(100);
		
		System.out.println(str);
		System.out.println(num1);
	}

}
