package b11_�迭;

public class DoubleArray {
	// �������迭
	// ���� : �ڷ���[��][��];
	//�������迭�� [][][] 

	public static void main(String[] args) {
		
		int[][] d_arr = new int[3][5];
		d_arr[0][0] = 10;
		d_arr[1][4] = 100;
		
		System.out.println(d_arr[0][0]);
		System.out.println(d_arr[1][4]);
		System.out.println(d_arr.length );   //�̰Ŵ� ���� ����
		System.out.println(d_arr[0].length);    // �̰Ŵ� ���� ����, �ε������� ������ �־������, 
		                                        //length�� ������ ��Ÿ���⶧���� ���� ��Ÿ���� [].�� ��ȣ �ȿ��� �ƹ����� �־�� 
		
		
		
		//100�� ����ִ� �迭�� �ε�����ȣ ����ϱ�
		
		for(int i = 0; i<d_arr.length;i++) {		
			for(int j =0; j<d_arr[i].length;j++) {
				if(d_arr[i][j] !=100) {
					continue;
				}
				System.out.println( "["+ i +","+j+"]");
				//�������̶� �ؿ� ����Լ��� ���� ���̴�
				//System.out.println(d_arr[i][j] ==100? "["+ i +","+j+"]" : " ");
				//������ �Ⱦ��� ���׿����ڸ� ���� false�϶��� ""���� ����ϱ⶧���� �������� ��µ� 
				break;
	
							
			}

			
		}
		

	}

}
