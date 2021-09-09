package b11_배열;

public class OXCount {
		//quiz [i][j][k] = i+j+k%2 == 0 ? "O" : "X"		
		//OXO, OOO 이런식으로 출력되게		
		//O의 개수, X의 개수 출력		
		//배열이나 모든 숫자는 뒤에서부터 증가가된다 삼차원배열이면 k 부터 반복됨.
	public static void main(String[] args) {
		
		String[][][] quiz = new String[3][2][3];
		
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
					System.out.print(quiz [i][j][k]);
				}
				System.out.print(quiz[i].length-1 == j ? "\n": ", ");
				                              //마이너스한이유는 길이갯수랑 인덱스번호랑 다르니까				
				//바로 윗줄의 syso랑 같은 식인데 조건문보다 연산자가 더빠르고 메모리 적게 차지해서 될수있으면 연산자로
//				if(quiz[i].length-1 == j) {
//					System.out.println();
//				}else {
//					System.out.print(", ");
//				}
		
			}
		}

	

	}

}
