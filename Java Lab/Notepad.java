import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Notepad {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notepad window = new Notepad();
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
	public Notepad() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 517, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menubar = new JMenuBar();
		frame.setJMenuBar(menubar);
		
		JMenu file = new JMenu("File");
		menubar.add(file);
		
		JMenu help = new JMenu("Help");
		menubar.add(help);
		
		JMenuItem New = new JMenuItem("New");
		file.add(New);
		
		JMenuItem open = new JMenuItem("Open");
		file.add(open);
		
		JMenuItem save = new JMenuItem("Save");
		file.add(save);
		
		JMenuItem saveas = new JMenuItem("Save As");
		file.add(saveas);
		
		JMenuItem exit = new JMenuItem("Exit");
		file.add(exit);

		JMenuItem about = new JMenuItem("About");
		help.add(about);
		
		class ExitAction implements ActionListener{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		}
		exit.addActionListener(new ExitAction());
		
	}

}
