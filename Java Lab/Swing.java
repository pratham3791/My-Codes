// Basics of Swing 

import javax.swing.*;
import java.util.*;
import java.awt.event.*;  

class Swing
{
    // adding the simple button to the API
    /*
    public static void main(String[] args) 
    {
        JFrame f = new JFrame();

        // instance of the button
        JButton b = new JButton("Click");

        // x-axis, y-axis, width, height
        b.setBounds(130, 100, 100, 40);

        // adding the button to frame
        f.add(b);

        // width, height
        f.setSize(400, 500);

        f.setLayout(null);

        // making the frame visible
        f.setVisible(true);
    }
    */

    // adding the listner for the button in API
    public static void main(String[] args) 
    {
        JFrame f = new JFrame();

        // ---------------------- BUTTON-----------------
        // instance of the button
        JButton b = new JButton("Click");

        // (x-axis, y-axis, width, height)
        b.setBounds(130, 100, 100, 40);

		JButton b1 = new JButton("ADD");
		b1.setBounds(150, 150, 100, 40);
		f.add(b1);

		 // ------------------ LABEL -----------------

		JLabel num1 = new JLabel("Number 1");
		num1.setBounds(40, 40, 76, 36);
		f.add(num1);

		JLabel num2 = new JLabel("Number 2");
		num2.setBounds(200, 40, 76, 36);
		f.add(num2);

        // ------------------ TEXT FRAME -----------------
        final JTextField tf1 = new JTextField();

        // (x-axis, y-axis, width, height)
        tf1.setBounds(20, 80, 150, 20);

		final JTextField tf2 = new JTextField();

        // (x-axis, y-axis, width, height)
        tf2.setBounds(200, 80, 50, 20);

        // ------------------- ACTION LISTNER -------------
        b.addActionListener(new ActionListener()
        {
            int count = 0;
            public void actionPerformed(ActionEvent e)
            {
                tf1.setText("" + count++);
            }
        });

		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//tf2.setText("" + (2 + (tf1.getText()).parseInt));
			}
		});	

        // adding the button to frame
        f.add(b);
        // adding the text field to frame
        f.add(tf1);
		 f.add(tf2);

        // (width, height)
        f.setSize(400, 500);

        f.setLayout(null);

        // making the frame visible
        f.setVisible(true);
    }

}
