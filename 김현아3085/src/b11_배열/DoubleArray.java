package b11_배열;

public class DoubleArray {
	// 이차원배열
	// 형태 : 자료형[행][열];
	//삼차원배열은 [][][] 

	public static void main(String[] args) {
		
		int[][] d_arr = new int[3][5];
		d_arr[0][0] = 10;
		d_arr[1][4] = 100;
		
		System.out.println(d_arr[0][0]);
		System.out.println(d_arr[1][4]);
		System.out.println(d_arr.length );   //이거는 행의 갯수
		System.out.println(d_arr[0].length);    // 이거는 열의 갯수, 인덱스값은 무조건 넣어줘야함, 
		                                        //length는 갯수를 나타내기때문에 행을 나타내는 [].이 괄호 안에는 아무숫자 넣어도됨 
		
		
		
		//100이 들어있는 배열의 인덱스번호 출력하기
		
		for(int i = 0; i<d_arr.length;i++) {		
			for(int j =0; j<d_arr[i].length;j++) {
				if(d_arr[i][j] !=100) {
					continue;
				}
				System.out.println( "["+ i +","+j+"]");
				//이프문이랑 밑에 출력함수랑 같은 식이다
				//System.out.println(d_arr[i][j] ==100? "["+ i +","+j+"]" : " ");
				//이프문 안쓰고 삼항연산자를 쓰면 false일때의 ""값을 출력하기때문에 공백으로 출력됨 
				break;
	
							
			}

			
		}
		

	}

}
