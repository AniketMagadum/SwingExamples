package MainGame;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExample {
	private JFrame frame;
	private JTable table;
	private JScrollPane pane;
	
	String data[][]= {
			{"1","Java","Java is a programming language and a platform"},
			{"2","PHP","PHP is a scripting language"},
			{"","C#","C# is a programming language of .NET Framework"}
	};
	String columns[]= {"Id","Name","Description"};
	public JTableExample()
	{
		frame=new JFrame("JTableExample");
		table=new JTable(data,columns);
		pane=new JScrollPane(table);
	}
	public void show()
	{
		table.setBackground(Color.GRAY);
		table.setForeground(Color.cyan);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(45, 45, 500, 250);
		frame.setVisible(true);
		frame.add(BorderLayout.CENTER,pane);
	}
}
