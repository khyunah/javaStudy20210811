package b22_���������;
/*
 * �г� : ��ư
 * 
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import b22_���������.service.LoginService;
import b22_���������.service.LoginServiceImpl;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class User extends JFrame {
				//panel :��ư
	private JPanel contentPane;
	private LoginService loginService;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//���� Ŭ���� (�� �ѹ� ���� ����)
		//				  invokeLator�޼ҵ���
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
							//setVisible  : true�� ���� ���̰� �ض�  false�� �Ⱥ���
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
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�����ӿ����� ��ġ, ������
		setBounds(100, 100, 450, 300);
		//���⼭ â�ݱ��� �г� ����
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(138, 61, 221, 23);
		panel.add(textField);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setBounds(138, 170, 159, 23);
		panel.add(btnNewButton);
		
		JLabel idLable = new JLabel("\uC544\uC774\uB514");
		idLable.setHorizontalAlignment(SwingConstants.RIGHT);
		idLable.setBounds(60, 65, 66, 15);
		panel.add(idLable);
		
		JLabel pwdLavel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		pwdLavel.setHorizontalAlignment(SwingConstants.RIGHT);
		pwdLavel.setBounds(60, 111, 66, 15);
		panel.add(pwdLavel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(138, 108, 221, 23);
		panel.add(passwordField);
	}
}
