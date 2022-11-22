import java.awt.EventQueue;
import java.lang.*;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Calci {

	private JFrame frame;
	private JTextField textField;
	
	double first, second, result;
	String operation, answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci window = new Calci();
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
	public Calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 453, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(41, 24, 356, 83);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn_1.getText();
				textField.setText(num);
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_1.setBounds(53, 135, 69, 43);
		frame.getContentPane().add(btn_1);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn_4.getText();
				textField.setText(num);
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_4.setBounds(53, 188, 69, 43);
		frame.getContentPane().add(btn_4);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn_7.getText();
				textField.setText(num);
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_7.setBounds(53, 241, 69, 43);
		frame.getContentPane().add(btn_7);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn_2.getText();
				textField.setText(num);
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_2.setBounds(132, 135, 69, 43);
		frame.getContentPane().add(btn_2);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn_5.getText();
				textField.setText(num);
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_5.setBounds(132, 188, 69, 43);
		frame.getContentPane().add(btn_5);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn_8.getText();
				textField.setText(num);
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_8.setBounds(132, 241, 69, 43);
		frame.getContentPane().add(btn_8);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn_0.getText();
				textField.setText(num);
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_0.setBounds(132, 294, 69, 43);
		frame.getContentPane().add(btn_0);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn_3.getText();
				textField.setText(num);
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_3.setBounds(211, 135, 69, 43);
		frame.getContentPane().add(btn_3);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn_6.getText();
				textField.setText(num);
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_6.setBounds(211, 188, 69, 43);
		frame.getContentPane().add(btn_6);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn_9.getText();
				textField.setText(num);
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_9.setBounds(211, 241, 69, 43);
		frame.getContentPane().add(btn_9);
		
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btn_plus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_plus.setBounds(306, 135, 69, 43);
		frame.getContentPane().add(btn_plus);
		
		JButton btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btn_minus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_minus.setBounds(306, 188, 69, 43);
		frame.getContentPane().add(btn_minus);
		
		JButton btn_mul = new JButton("*");
		btn_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btn_mul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_mul.setBounds(306, 241, 69, 43);
		frame.getContentPane().add(btn_mul);
		
		JButton btn_div = new JButton("/");
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btn_div.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_div.setBounds(306, 294, 69, 43);
		frame.getContentPane().add(btn_div);
		
		JButton btn_eql = new JButton("=");
		btn_eql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  answer;
				second = Double.parseDouble(textField.getText());
				
				if(operation == "+")
				{
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "-")
				{
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "*")
				{
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "/")
				{
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btn_eql.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_eql.setBounds(196, 361, 69, 43);
		frame.getContentPane().add(btn_eql);
		
		JButton clr = new JButton("CLR");
		clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		clr.setFont(new Font("Tahoma", Font.BOLD, 18));
		clr.setBounds(41, 361, 81, 43);
		frame.getContentPane().add(clr);
	}
}
