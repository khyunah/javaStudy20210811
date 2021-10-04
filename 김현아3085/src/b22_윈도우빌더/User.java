package b22_윈도우빌더;
/*
 * 패널 : 버튼
 * 
 */

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

import b22_윈도우빌더.service.LoginService;
import b22_윈도우빌더.service.LoginServiceImpl;
import b22_윈도우빌더.service.SignUpService;
import b22_윈도우빌더.service.SignUpServiceImpl;

public class User extends JFrame {
				//panel :버튼
	private JPanel mainCardPan;
	private CardLayout cl_mainCardPan;
	
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField id_tf;
	private JPasswordField pwd_tf;
	private JPasswordField repwd_tf;
	private JTextField name_tf;
	private JTextField phone_tf;
	private JTextField email_tf;
	private String[] gender_list = {"선택", "남성", "여성", "선택하지 않음"};

	private LoginService loginService;
	private SignUpService signUpService;
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
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(257, 139, 221, 30);
		login_pan.add(textField);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setBounds(292, 261, 159, 30);
		login_pan.add(btnNewButton);
		
		JLabel idLable = new JLabel("\uC544\uC774\uB514");
		idLable.setHorizontalAlignment(SwingConstants.RIGHT);
		idLable.setBounds(162, 150, 66, 15);
		login_pan.add(idLable);
		
		JLabel pwdLavel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		pwdLavel.setHorizontalAlignment(SwingConstants.RIGHT);
		pwdLavel.setBounds(162, 203, 66, 15);
		login_pan.add(pwdLavel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(257, 196, 221, 30);
		login_pan.add(passwordField);
		
		JButton sign_up = new JButton("\uD68C\uC6D0\uAC00\uC785");
		sign_up.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sign_up.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_mainCardPan.show(mainCardPan, "sign_up_pan");
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
		
		JComboBox gender_cb = new JComboBox(gender_list);
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
						
						gender_cb.getSelectedItem().toString()
				};
				String errorMsg = signUpService.isEmptyValue(values);
				if(!errorMsg.equals("values is not null")){
					JOptionPane.showMessageDialog(null, errorMsg, "공백오류", JOptionPane.ERROR_MESSAGE);
				}else {
					errorMsg = signUpService.equalsPassword(pwd_tf.getText(), repwd_tf.getText());
					if(errorMsg.equals("password equals")) {
						JOptionPane.showMessageDialog(null,  errorMsg, "비밀번호 오류", JOptionPane.ERROR_MESSAGE);
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
	}
}
