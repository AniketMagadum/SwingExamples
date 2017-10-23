package MainGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class JToolBarExample {
	public JFrame frame;
	private JToolBar bar;
	private JButton button1,button2;
	public JToolBarExample()
	{
		frame=new JFrame("JToolBarExample");
		button1=new JButton("Button1");
		button2=new JButton("Button2");
		bar=new JToolBar();
		
	}
	public void show()
	{
		frame.setBounds(45, 45, 300, 150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Container container=frame.getContentPane();
		container.setBackground(Color.BLACK);
		bar.add(button1);
		bar.addSeparator();
		bar.add(button2);
		container.add(bar, BorderLayout.NORTH);
	}
}
