package b11_�迭;

public class OXCount {
	public static void main(String[] args) {
		String[][][] quiz = new String[3][2][3];
		
		int count_o = 0;
		int count_x = 0;
		//quiz [i][j][k] = i+j+k%2 == 0 ? "O" : "X"		
		//OXO, OOO �̷������� ��µǰ�		
		//O�� ����, X�� ���� ���		
		//�迭�̳� ��� ���ڴ� �ڿ������� �������ȴ� �������迭�̸� k ���� �ݺ���.

		for(int i =0; i <quiz.length; i++) {
			for(int j = 0; j <quiz[i].length; j++) {
				for(int k = 0; k <quiz[i][j].length; k++) {
					quiz [i][j][k] = (i+j+k)%2 ==0? "O":"X";

					}
				}
			}
		
		for(int i =0; i <quiz.length; i++) {
			for(int j = 0; j <quiz[i].length; j++) {
				for(int k = 0; k <quiz[i][j].length; k++) {
					if(quiz[i][j][k].equals("O")) {
						count_o++;
					}else {
						count_x++;
					}
					System.out.print(quiz [i][j][k]);
					
				}
				System.out.print(quiz[i].length-1 == j ? "\n": ", ");
	
			}
		}		
		System.out.println("O�� ���� : "+count_o);
		System.out.println("X�� ���� : "+count_x);
	}
}
