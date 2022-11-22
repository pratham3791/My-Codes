import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.Map;
import java.awt.Font;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Fonts {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fonts window = new Fonts();
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
	public Fonts() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 526, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 15));
		textField.setBounds(115, 64, 291, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Input");
		lblNewLabel.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 18));
		lblNewLabel.setBounds(231, 20, 59, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BOLD");
		btnNewButton.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = textField.getText();
				textField_1.setText(str);
				textField_1.setFont(textField_1.getFont().deriveFont(Font.BOLD, 14f));
			}
		});
		btnNewButton.setBounds(209, 144, 96, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnItalics = new JButton("ITALICS");
		btnItalics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = textField.getText();
				textField_1.setText(str);
				textField_1.setFont(textField_1.getFont().deriveFont(Font.ITALIC, 14f));
			}
		});
		btnItalics.setFont(new java.awt.Font("Tahoma", java.awt.Font.ITALIC, 18));
		btnItalics.setBounds(203, 200, 112, 34);
		frame.getContentPane().add(btnItalics);
		
		JButton btnUnderline = new JButton("Underline");
		btnUnderline.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = textField.getText(); 
				
				//underline 
				Font font = textField_1.getFont();
				Map attributes = font.getAttributes();
				attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
				textField_1.setFont(font.deriveFont(attributes));
				
				textField_1.setText(str);
			}
		});
		btnUnderline.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUnderline.setBounds(172, 255, 175, 34);
		frame.getContentPane().add(btnUnderline);
		
		textField_1 = new JTextField();
		textField_1.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(115, 328, 291, 41);
		frame.getContentPane().add(textField_1);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 18));
		lblResult.setBounds(231, 378, 74, 34);
		frame.getContentPane().add(lblResult);
	}

}
