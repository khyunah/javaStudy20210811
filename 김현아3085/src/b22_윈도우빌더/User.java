package b22_윈도우빌더;
/*
 * 패널 : 버튼
 * 
 */

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import b22_윈도우빌더.dao.DeleteUserDao;
import b22_윈도우빌더.dto.UserDto;
import b22_윈도우빌더.service.LoginService;
import b22_윈도우빌더.service.LoginServiceImpl;
import b22_윈도우빌더.service.SignUpService;
import b22_윈도우빌더.service.SignUpServiceImpl;

public class User extends JFrame {
				//panel :버튼
	private UserDto loginsession;
	private JPanel mainCardPan;
	private CardLayout cl_mainCardPan;
	
	private JTextField login_id_tf;
	private JPasswordField login_pwd_tf;
	private JTextField id_tf;
	private JPasswordField pwd_tf;
	private JPasswordField repwd_tf;
	private JTextField name_tf;
	private JTextField phone_tf;
	private JTextField email_tf;
	private JComboBox gender_cb;
	private JLabel welcomeMsg;
	private String[] gender_list = {"선택", "남성", "여성", "선택하지 않음"};

	private LoginService loginService;
	private SignUpService signUpService;
	private DeleteUserDao deleteUserDao;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//무명 클래스 (딱 한번 쓰고 말것)
		//				  invokeLator메소드임
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
							//setVisible  : true면 눈에 보이게 해라  false면 안보임
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the frame.
	 */
	public User() {
		
		loginService = new LoginServiceImpl();
		signUpService = new SignUpServiceImpl();
		deleteUserDao = new DeleteUserDao() {
			
			@Override
			public boolean deleteUser(String id) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//프레임열리는 위치, 사이즈
		setBounds(100, 100, 790, 576);
		//여기서 창닫기쪽 패널 생성
		mainCardPan = new JPanel();
		
		mainCardPan.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainCardPan);
		cl_mainCardPan = new CardLayout(); 
		mainCardPan.setLayout(cl_mainCardPan);
		
		JPanel login_pan = new JPanel();
		mainCardPan.add(login_pan, "login_pan");
		login_pan.setLayout(null);
		
		login_id_tf = new JTextField();
		login_id_tf.setColumns(10);
		login_id_tf.setBounds(257, 139, 221, 30);
		login_pan.add(login_id_tf);
		
		JButton login_btn = new JButton("\uB85C\uADF8\uC778");
		login_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = loginService.loginTextCheck(login_id_tf.getText(), login_pwd_tf.getText());
						if(flag !=2) {
							String msg = null;
							if(flag == 0) {
								msg = "존재하지 않는 아이디입니다.";
							}else if(flag==1) {
								msg ="비밀번호를 다시 확인해 주세요.";
							}else if(flag== 3) {
								msg= "아이디를 입력해주세요.";
							}else if( flag ==4) {
								msg = "비밀번호를 입력해 주세요.";
							}
							JOptionPane.showMessageDialog(null, msg, "경고", JOptionPane.WARNING_MESSAGE);
						}else {
							cl_mainCardPan.show(mainCardPan, "index_pan");
							loginsession = loginService.getUserDto(login_id_tf.getText());
							welcomeMsg.setText(loginsession.getUser_name()+"님 환영합니다.");
						}
			}
		});
		login_btn.setBounds(292, 261, 159, 30);
		login_pan.add(login_btn);
		
		JLabel idLable = new JLabel("\uC544\uC774\uB514");
		idLable.setHorizontalAlignment(SwingConstants.RIGHT);
		idLable.setBounds(162, 150, 66, 15);
		login_pan.add(idLable);
		
		JLabel pwdLavel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		pwdLavel.setHorizontalAlignment(SwingConstants.RIGHT);
		pwdLavel.setBounds(162, 203, 66, 15);
		login_pan.add(pwdLavel);
		
		login_pwd_tf = new JPasswordField();
		login_pwd_tf.setBounds(257, 196, 221, 30);
		login_pan.add(login_pwd_tf);
		
		JButton sign_up = new JButton("\uD68C\uC6D0\uAC00\uC785");
		sign_up.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_mainCardPan.show(mainCardPan, "sign_up_pan");
				id_tf.setText("");
				id_tf.setEditable(true);
				pwd_tf.setText("");
				repwd_tf.setText("");
				name_tf.setText("");
				phone_tf.setText("");
				email_tf.setText("");
				gender_cb.setSelectedIndex(0);
				
				login_id_tf.setText("");
				login_pwd_tf.setText("");
			}
		});
		sign_up.setBounds(292, 307, 159, 30);
		login_pan.add(sign_up);
		
		JPanel sign_up_pan = new JPanel();
		mainCardPan.add(sign_up_pan, "sign_up_pan");
		sign_up_pan.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(198, 94, 57, 15);
		sign_up_pan.add(lblNewLabel);
		
		id_tf = new JTextField();
		id_tf.setBounds(267, 88, 143, 28);
		sign_up_pan.add(id_tf);
		id_tf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(198, 150, 57, 15);
		sign_up_pan.add(lblNewLabel_1);
		
		pwd_tf = new JPasswordField();
		pwd_tf.setBounds(267, 144, 234, 28);
		sign_up_pan.add(pwd_tf);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(135, 206, 120, 15);
		sign_up_pan.add(lblNewLabel_1_1);
		
		repwd_tf = new JPasswordField();
		repwd_tf.setBounds(267, 200, 234, 28);
		sign_up_pan.add(repwd_tf);
		
		JLabel lblNewLabel_2 = new JLabel("\uC774\uB984");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(198, 261, 57, 15);
		sign_up_pan.add(lblNewLabel_2);
		
		name_tf = new JTextField();
		name_tf.setColumns(10);
		name_tf.setBounds(267, 255, 234, 28);
		sign_up_pan.add(name_tf);
		
		JLabel lblNewLabel_3 = new JLabel("\uC5F0\uB77D\uCC98");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(198, 314, 57, 15);
		sign_up_pan.add(lblNewLabel_3);
		
		phone_tf = new JTextField();
		phone_tf.setColumns(10);
		phone_tf.setBounds(267, 308, 234, 28);
		sign_up_pan.add(phone_tf);
		
		JLabel lblNewLabel_4 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(198, 363, 57, 15);
		sign_up_pan.add(lblNewLabel_4);
		
		email_tf = new JTextField();
		email_tf.setColumns(10);
		email_tf.setBounds(267, 357, 234, 28);
		sign_up_pan.add(email_tf);
		
		JLabel lblNewLabel_5 = new JLabel("\uC131\uBCC4");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(198, 412, 57, 15);
		sign_up_pan.add(lblNewLabel_5);
		
		gender_cb = new JComboBox(gender_list);
		gender_cb.setBounds(267, 405, 234, 28);
		sign_up_pan.add(gender_cb);
		
		JButton sign_up_btn = new JButton("\uAC00\uC785\uD558\uAE30");
		sign_up_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String[] values = {
						id_tf.getText(),
						pwd_tf.getText(),
						repwd_tf.getText(),
						name_tf.getText(),
						phone_tf.getText(),
						email_tf.getText(),
						
						gender_cb.getSelectedItem().toString(),//건너띄고 밑에꺼 실행
						Integer.toString(gender_cb.getSelectedIndex())
						
				};
				String errorMsg = signUpService.isEmptyValue(values);
				if(!errorMsg.equals("values is not null")){
					JOptionPane.showMessageDialog(null, errorMsg, "공백오류", JOptionPane.ERROR_MESSAGE);
				}else {
					errorMsg = signUpService.equalsPassword(pwd_tf.getText(), repwd_tf.getText());
					if(!errorMsg.equals("password equals")) {
						JOptionPane.showMessageDialog(null,  errorMsg, "비밀번호 오류", JOptionPane.ERROR_MESSAGE);
					}else {
						boolean flag = signUpService.signUp(values);
						JOptionPane.showMessageDialog(null,  "회원가입에 성공하였습니다.", "회원가입 성공", JOptionPane.INFORMATION_MESSAGE);
						cl_mainCardPan.show(mainCardPan, "login_pan");
					}
				}
			}
		});
		sign_up_btn.setBounds(267, 469, 104, 28);
		sign_up_pan.add(sign_up_btn);
		
		JButton id_chk_btn = new JButton("\uC911\uBCF5\uD655\uC778");
		id_chk_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = signUpService.idCheck(id_tf.getText());
				if(flag ==2) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요.", "경고", JOptionPane.ERROR_MESSAGE);
				}else if (flag==1) {
					JOptionPane.showMessageDialog(null, "존재하는 아이디입니다.", "아이디 중복", JOptionPane.WARNING_MESSAGE);
				}else if(flag==0){
					int select = JOptionPane.showConfirmDialog(null, "사용가능한 아이디입니다.\n사용하시겠습니까?", "아이디 확인", JOptionPane.YES_NO_OPTION);
					if(select ==0) {
						id_tf.setEditable(false);
					}
				}
			}
		});
		id_chk_btn.setBounds(410, 88, 91, 28);
		sign_up_pan.add(id_chk_btn);
		
		JButton page_back_btn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		page_back_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_mainCardPan.show(mainCardPan, "login_pan");

			}
		});
		page_back_btn.setBounds(383, 469, 118, 28);
		sign_up_pan.add(page_back_btn);
		
		JPanel index_pan = new JPanel();
		mainCardPan.add(index_pan, "index_pan");
		index_pan.setLayout(null);
		
		welcomeMsg = new JLabel("New label");
		welcomeMsg.setBounds(12, 10, 382, 29);
		index_pan.add(welcomeMsg);
		
		//로그아웃버튼 클릭
		JButton logout_btn = new JButton("\uB85C\uADF8\uC544\uC6C3");
		logout_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = JOptionPane.showConfirmDialog(null, "정말 로그아웃 하시겠습니까?", "로그아웃", JOptionPane.YES_NO_OPTION);
				if(flag == 0) {
					cl_mainCardPan.show(mainCardPan, "login_pan");
					loginsession = null;
					login_id_tf.setText("");
					login_pwd_tf.setText("");
				}
			}
		});
		logout_btn.setBounds(644, 13, 108, 29);
		index_pan.add(logout_btn);
		
		JButton mapage_btn = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
		mapage_btn.setBounds(527, 13, 115, 29);
		index_pan.add(mapage_btn);
		
		JPanel mypage_pan = new JPanel();
		mainCardPan.add(mypage_pan, "mypage_pan");
		mypage_pan.setLayout(null);
		//회원탈퇴버튼 클릭시 db에서 삭제
		JButton user_drop_btn = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		user_drop_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = JOptionPane.showConfirmDialog(null, "정말로 계정을 삭제하시겠습니까?", "회원탈퇴",JOptionPane.YES_NO_OPTION);
				if(flag ==0) {
					boolean dropFlag = deleteUserDao.deleteUser(loginsession.getUser_id());
					cl_mainCardPan.show(mainCardPan, "login_pan");
					login_id_tf.setText("");
					login_pwd_tf.setText("");
					
				}
			}
		});
		user_drop_btn.setBounds(636, 479, 116, 38);
		mypage_pan.add(user_drop_btn);
	}
}
