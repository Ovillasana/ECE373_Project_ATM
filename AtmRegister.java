package project.gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AtmRegister extends JFrame {

	private static final long serialVersionUID = -5323104247007829603L;
	private JPanel contentPane;
	private ImageIcon imageIcon;
	
	public static void main(String[] args) {
		AtmRegister atmRegister = new AtmRegister();
		atmRegister.setVisible(true);
	}
	
	public AtmRegister() {
		setTitle("ATM Machine - ECE_273 Project");
		setSize(430,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		initializeComponents();
	}
	
	private void initializeComponents() {
		contentPane = new JPanel();
		contentPane.setLayout(new FlowLayout(0, 50, 10));
		setContentPane(contentPane);
		
		JLabel lblQuestions = new JLabel("Please answer the following Questions");
		contentPane.add(lblQuestions);
		
		JPanel panelFields = new JPanel();
		panelFields.setLayout(new GridLayout(5, 2));
		
		JLabel lblName = new JLabel("Name: ");
		JLabel lblAddress = new JLabel("Address: ");
		JLabel lblPhone = new JLabel("Phone Number: ");
		JLabel lblAge = new JLabel("Age: ");
		JLabel lblBirthday = new JLabel("Birthday: ");
		
		JTextField txtName = new JTextField();
		JTextField txtAddress = new JTextField();
		JTextField txtPhone = new JTextField();
		JTextField txtAge = new JTextField();
		JTextField txtBirthday = new JTextField();
		
		panelFields.add(lblName);
		panelFields.add(txtName);

		panelFields.add(lblAddress);
		panelFields.add(txtAddress);

		panelFields.add(lblPhone);
		panelFields.add(txtPhone);

		panelFields.add(lblAge);
		panelFields.add(txtAge);

		panelFields.add(lblBirthday);
		panelFields.add(txtBirthday);
		
		contentPane.add(panelFields);
		
		JButton btnSubmit = new JButton("Submit");
		contentPane.add(btnSubmit);
		
		imageIcon = new ImageIcon("photo.jpg");
		JLabel photo = new JLabel(imageIcon);
		
		contentPane.add(photo);
		
		JLabel lblAccountId = new JLabel("Your assigned account ID is: ");
		contentPane.add(lblAccountId);
	}

}
