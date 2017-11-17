package project.gui;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import project.model.User;

public class AtmGui extends JFrame {

	private static final long serialVersionUID = 8980271630829931165L;
	private JPanel contentPane;
	private User user;

	public AtmGui(User user) {
		this.user = user;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(755,425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		initializeComponents();
	}
	
	private void initializeComponents() {
		JLabel lblWelcomeJohnDoe = new JLabel("Welcome " + user.getName());
		lblWelcomeJohnDoe.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblWelcomeJohnDoe, BorderLayout.NORTH);
		
		JLabel lblAccountType = new JLabel("Account Type:");
		lblAccountType.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblAccountType, BorderLayout.SOUTH);
		
		addWithdrawPanel();
	}

	private void addWithdrawPanel() {
		JPanel panelActions = new JPanel();
		JLabel lblAmount = new JLabel("Amount");
		panelActions.add(lblAmount);
		
		JPanel panelWithdraw = new JPanel();
		panelActions.add(panelWithdraw);
		panelWithdraw.setLayout(new GridLayout(2, 2, 30, 25));
		
		JTextField txtDeposit = new JTextField();
		panelWithdraw.add(txtDeposit);
		
		JButton btnDeposit = new JButton("Deposit");
		panelWithdraw.add(btnDeposit);
		
		JTextField txtWithdraw = new JTextField();
		panelWithdraw.add(txtWithdraw);
		
		JButton btnWithdraw = new JButton("Withdraw");
		panelWithdraw.add(btnWithdraw);
		
		contentPane.add(panelActions);
	}
}
