package b22_���������.service;

import b22_���������.dao.LoginDao;
import b22_���������.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{
	//1���� ���ְ� 
	private LoginDao loginDao;
	
	public LoginServiceImpl() {
		//2�����ɶ� ��üȭ
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
 * Model : ������ ���̽��� �ٸ������͵��� ������ �ִ� ���� (DAO, DTO, VO, Bean)
 * View : ����ڿ��� �������� ȭ�� (������) 
 * Controller : ����ڿ��� � View�� �����ٰ����� ��Ʈ���Ͽ����Ѵ�.
 * 	
 * 
 * */
