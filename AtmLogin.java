package project.gui;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AtmLogin extends JFrame {

	private static final long serialVersionUID = -5535484166491623591L;
	private JPanel contentPane;
	private JPanel loginPanel;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtmLogin frame = new AtmLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AtmLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(440, 200);
		setTitle("ATM Machine - ECE_373 Project");
		setLocationRelativeTo(null);
		
		initializeComponents();
	}
	
	private void initializeComponents() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(2, 1));
		
		JPanel panelContent = new JPanel();
		panelContent.setLayout(new FlowLayout());
		
		setContentPane(contentPane);
		
		loginPanel = new JPanel();
		loginPanel.setLayout(new GridLayout(2, 2));
		
		JLabel lblUsername = new JLabel("username:");
		JLabel lblPassword = new JLabel("password:");
		
		JTextField txtUsername = new JTextField("", 10);			
		JPasswordField pwdPass = new JPasswordField("", 10);
		
		loginPanel.add(lblUsername);
		loginPanel.add(txtUsername);
		
		loginPanel.add(lblPassword);
		loginPanel.add(pwdPass);
		
		JButton btnLogin = new JButton("Login");
		panelContent.add(loginPanel);
		panelContent.add(btnLogin);
		contentPane.add(panelContent);
		
		JPanel panelRegister = new JPanel();
		JLabel lblRegister = new JLabel("Don't have an account?");
		JButton btnRegister = new JButton("Register");
		
		panelRegister.add(lblRegister);
		panelRegister.add(btnRegister);
		
		contentPane.add(panelRegister);
	}

}
