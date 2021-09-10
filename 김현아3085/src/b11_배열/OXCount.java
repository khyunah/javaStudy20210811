package b11_배열;

public class OXCount {
	public static void main(String[] args) {
		String[][][] quiz = new String[3][2][3];
		
		int count_o = 0;
		int count_x = 0;
		//quiz [i][j][k] = i+j+k%2 == 0 ? "O" : "X"		
		//OXO, OOO 이런식으로 출력되게		
		//O의 개수, X의 개수 출력		
		//배열이나 모든 숫자는 뒤에서부터 증가가된다 삼차원배열이면 k 부터 반복됨.

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
		System.out.println("O의 개수 : "+count_o);
		System.out.println("X의 개수 : "+count_x);
	}
}
