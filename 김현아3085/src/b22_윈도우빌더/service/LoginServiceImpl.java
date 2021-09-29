package b22_윈도우빌더.service;

import b22_윈도우빌더.dao.LoginDao;
import b22_윈도우빌더.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{
	//1선언만 해주고 
	private LoginDao loginDao;
	
	public LoginServiceImpl() {
		//2생성될때 객체화
		loginDao = new LoginDaoImpl();
	}
	
	@Override
	public int loginTextCheck(String id, String pwd) {
		
		int flag = 0;
		
		if(id.length() == 0) {
			flag = 3;
		}else if(pwd.length() == 0) {
			flag = 4;
		}else {
			flag = loginLogic(id, pwd);
		}
		return flag;
	}

	@Override
	public int loginLogic(String id, String pwd) {
		return loginDao.login(id, pwd);
	}

}
/*
 * MVC Model
 * 
 * Model : 데이터 베이스나 다른데이터들을 담을수 있는 영역 (DAO, DTO, VO, Bean)
 * View : 사용자에게 보여지는 화면 (디자인) 
 * Controller : 사용자에게 어떤 View을 보여줄건지만 컨트롤하여야한다.
 * 	
 * 
 * */
