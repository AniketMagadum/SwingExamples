package MainGame;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class JFrameExample 
{
	JFrame frame;
	JPanel panel;
	JButton button;
	JFrameExample()
	{
		frame=new JFrame("My First App");
		panel=new JPanel();
		button=new JButton("Hello World");
		frame.getContentPane().add(panel);
		frame.setSize(400,400);
		frame.setUndecorated(true);
		frame.setBackground(Color.WHITE);
		button.setToolTipText("Click Here");
		panel.add(button);
		panel.setBackground(Color.WHITE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}
