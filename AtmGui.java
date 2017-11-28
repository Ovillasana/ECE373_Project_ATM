package project.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import project.model.User;

public class AtmGui extends JFrame {

	private static final long serialVersionUID = 8980271630829931165L;
	private JPanel contentPane;
	private User user;
	private ImageIcon imageIcon;
	private JPanel panelRight;
	private JPanel panelLeft;
	private JPanel panelMain;

	public AtmGui(User user) {
		this.user = user;
		setTitle("ATM Machine - ECE_373 Project");
		setSize(848,375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		// Adding an empty border for more beauty :-)
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		// Setting the Layout to Borderlayout for dividing the Layout into 3 parts (top [JLabel], middle[Content], bottom[JLabel])
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		initializeComponents();
	}
	
	private void initializeMainComponents() {
		panelMain = new JPanel();
		// 1 row, 2 columns
		panelMain.setLayout(new GridLayout(1, 2, 0, 0));
		contentPane.add(panelMain);
		
		panelLeft = new JPanel();
		// 2 rows, 1 column, gap of 10,10
		panelLeft.setLayout(new GridLayout(2, 1, 10, 10));
		panelMain.add(panelLeft);
		
		panelRight = new JPanel();
		panelRight.setLayout(new FlowLayout());
		panelMain.add(panelRight);
		
		JLabel lblWelcomeJohnDoe = new JLabel("Welcome John Doe: ");
		contentPane.add(lblWelcomeJohnDoe, BorderLayout.NORTH);
		
		JLabel lblAccountType = new JLabel("Account Type: ");
		lblAccountType.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblAccountType, BorderLayout.SOUTH);
	}
	
	private void initializeComponents() {
		initializeMainComponents();
		addWithdrawPanel();
		addAccountsPanel();
		addUserDetailsPanel();
	}
	
	private void addUserDetailsPanel() {
		JPanel panelUserDetails = new JPanel();
		// 2 rows, 1 column, vgap of 30 
		panelUserDetails.setLayout(new GridLayout(2, 1, 0, 30));
		panelRight.add(panelUserDetails);

		JPanel panelAddress = new JPanel();
		// 3 rows, 1 column, hgap of 5
		panelAddress.setLayout(new GridLayout(3, 1, 5, 0));
		panelUserDetails.add(panelAddress);

		// Data needs to be inserted to the JLabels from the "User" class or whatever class you have for the ATM User
		JLabel lblName = new JLabel("John Doe");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblAddress = new JLabel("123 E South Campus Dr");
		lblAddress.setHorizontalAlignment(SwingConstants.LEFT);

		JLabel lblState = new JLabel("Tuscon, AZ 85719");
		lblState.setHorizontalAlignment(SwingConstants.LEFT);
		
		panelAddress.add(lblName);
		panelAddress.add(lblAddress);
		panelAddress.add(lblState);
		
		JPanel panelPrivateDetails = new JPanel();
		panelPrivateDetails.setLayout(new GridLayout(4, 1, 0, 0));
		panelUserDetails.add(panelPrivateDetails);
		
		JLabel lblAge = new JLabel("Age: 25");
		JLabel lblSex = new JLabel("Sex: Male");
		JLabel lblBirthday = new JLabel("Birthday: 01/01/1992");
		JLabel lblUserId = new JLabel("User ID: 123456789");
		
		panelPrivateDetails.add(lblAge);
		panelPrivateDetails.add(lblSex);
		panelPrivateDetails.add(lblBirthday);
		panelPrivateDetails.add(lblUserId);
		
		// Adding the avatar logo to the JLabel
		imageIcon = new ImageIcon("photo.jpg");
		JLabel lblAvatar = new JLabel(imageIcon);
		panelRight.add(lblAvatar);
	}
	
	private void addAccountsPanel() {
		JPanel panelAccounts = new JPanel();
		panelLeft.add(panelAccounts);
		panelAccounts.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblSelectAccount = new JLabel("Select Account");
		panelAccounts.add(lblSelectAccount);
		
		JScrollPane scrollPaneCheckboxes = new JScrollPane();
		scrollPaneCheckboxes.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panelAccounts.add(scrollPaneCheckboxes);
		
		JPanel panelCheckboxes = new JPanel();
		scrollPaneCheckboxes.setViewportView(panelCheckboxes);
		panelCheckboxes.setLayout(new GridLayout(3, 1, 0, 0));
		
		JCheckBox chckbxSavingAccount = new JCheckBox("Saving Account - Balance: $2000");
		chckbxSavingAccount.setHorizontalAlignment(SwingConstants.LEFT);
		panelCheckboxes.add(chckbxSavingAccount);
		
		JCheckBox chckbxCheckingAccount = new JCheckBox("Checking Account - Balance: $5000");
		chckbxCheckingAccount.setHorizontalAlignment(SwingConstants.LEFT);
		panelCheckboxes.add(chckbxCheckingAccount);
		
		JCheckBox chckbxTaxesAccount = new JCheckBox("Taxes Account - Balance: $2000");
		chckbxTaxesAccount.setHorizontalAlignment(SwingConstants.LEFT);
		panelCheckboxes.add(chckbxTaxesAccount);
	}

	private void addWithdrawPanel() {
		JPanel panelWithdrawOuter = new JPanel();
		panelLeft.add(panelWithdrawOuter);
		JLabel lblAmount = new JLabel("Amount");
		panelWithdrawOuter.add(lblAmount);
		
		JPanel panelWithdrawInner = new JPanel();
		panelWithdrawOuter.add(panelWithdrawInner);
		panelWithdrawInner.setLayout(new GridLayout(2, 2, 30, 25));
		
		JTextField txtDeposit = new JTextField();
		panelWithdrawInner.add(txtDeposit);
		
		JButton btnDeposit = new JButton("Deposit");
		panelWithdrawInner.add(btnDeposit);
		
		JTextField txtWithdraw = new JTextField();
		panelWithdrawInner.add(txtWithdraw);
		
		JButton btnWithdraw = new JButton("Withdraw");
		panelWithdrawInner.add(btnWithdraw);
	}
}
