import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblStudentId;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblGender;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblClass;
	private JLabel lblAddress;
	private JLabel lblMobNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.setBounds(100, 100, 521, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(163, 57, 287, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Student Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(37, 59, 116, 25);
		frame.getContentPane().add(lblNewLabel);
		
		lblStudentId = new JLabel("Student ID");
		lblStudentId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStudentId.setBounds(59, 109, 116, 25);
		frame.getContentPane().add(lblStudentId);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(163, 107, 287, 35);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(163, 160, 287, 35);
		frame.getContentPane().add(textField_2);
		
		lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGender.setBounds(86, 162, 67, 25);
		frame.getContentPane().add(lblGender);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(163, 212, 287, 35);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(163, 268, 287, 35);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(163, 318, 287, 35);
		frame.getContentPane().add(textField_5);
		
		lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblClass.setBounds(86, 212, 67, 25);
		frame.getContentPane().add(lblClass);
		
		lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAddress.setBounds(73, 270, 67, 25);
		frame.getContentPane().add(lblAddress);
		
		lblMobNo = new JLabel("Mob. No.");
		lblMobNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMobNo.setBounds(73, 320, 80, 25);
		frame.getContentPane().add(lblMobNo);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "Name : " + textField.getText() + "\nID : " + textField_1.getText() + "\nGender : " + textField_2.getText() + "\nClass : " + textField_3.getText() + "\nAddress : " + textField_4.getText() + "\nMobile No.: " + textField_5.getText();
				JOptionPane.showMessageDialog(btnNewButton, msg);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(185, 384, 116, 35);
		frame.getContentPane().add(btnNewButton);
	}
}
