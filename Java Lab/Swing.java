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

        // ------------------ TEXT FRAME -----------------
        final JTextField tf = new JTextField();

        // (x-axis, y-axis, width, height)
        tf.setBounds(50, 50, 150, 20);

        // ------------------- ACTION LISTNER -------------
        b.addActionListener(new ActionListener()
        {
            int count = 0;
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("The count now is : " + count++);
            }
        });

        // adding the button to frame
        f.add(b);
        // adding the text field to frame
        f.add(tf);

        // (width, height)
        f.setSize(400, 500);

        f.setLayout(null);

        // making the frame visible
        f.setVisible(true);
    }

}