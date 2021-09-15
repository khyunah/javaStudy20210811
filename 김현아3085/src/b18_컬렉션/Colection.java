package b18_컬렉션;
/*
 * 
 * 
 * 
 * 컬렉션 (Interface)
 * java에서의 데이터 관리를 위한 라이브러리.
 * 인터페이스끼리는 상속을 해준다 (List, Set, Queue)
 * 
 * 
 * 컬렉션 프레임워크
 * 
 * 1.List
 * 순서o / 배열의 형태와 동일함(중간에 값을 삭제하면 뒤에 값을 땡겨 채워주는것이 다른점임)
 * 
 * 
 * 2.Set
 * 순서x, 중복x / 검색할때 상대적으로 List보다 빠름 
 * ex) 회원가입, 운송장번호 
 * 
 * 3.Map<k,v>
 * key와 value가 있음, 이전체는 List이고 key값은 Set
 * 그래서 key : 중복x
 * 
 * 
 * ArraytList
 * LinkedList : 
 * Vector : 한번 실행때 하나만 실행가능하다 (쓰레드를 쓸때 이거 씀)
 * 이 두개는 99퍼 같다 
 * Stack
 * 
 * 
 * 조희 추가 수정 삭제 중에 할일이많은부분에서 빠른것을 선택해서 사용한다
 * Select(조회)
 * : 데이터가 많을때는 List 사용
 * 				적을때는 Set 사용
 * Insert(추가)
 * : Set이 빠르다(예를 들면 List에서 100만개 있는데 맨앞에 추가하려면 다 밀려야한다. Set은 주머니처럼 그냥 짚어넣음)
 * Update(수정)
 * : 데이터가 많을때 List가 빠름 
 * Delete(삭제)
 * : List가 빠름
 * 
 */

import java.util.Collection;
import java.util.List;

public class Colection {
	
	Collection<String> c ;
	List<String> l;
	

}
