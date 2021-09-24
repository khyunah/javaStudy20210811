package b17_제네릭;

public class GenericEx<T> {
	T generic;
	public T getGeneric(T t) {
		T t2 = t;
		return t2;
	}
	
	public static void main(String[] args) {
		//String타입으로
		GenericEx<String> gex = new GenericEx<String>();
		String str = gex.getGeneric("김준일");
		
		//Integer타입으로
		GenericEx<Integer> gex2 = new GenericEx<Integer>();
		Integer num1 = gex2.getGeneric(100);
		
		System.out.println(str);
		System.out.println(num1);
	}
}
