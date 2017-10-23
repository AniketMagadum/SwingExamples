package MainGame;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeExample {
	private JFrame frame;
	private JTree tree;
	private DefaultMutableTreeNode aniket;
	private DefaultMutableTreeNode colors;
	private DefaultMutableTreeNode games;
	private DefaultMutableTreeNode hobbies;
	public JTreeExample()
	{
		frame=new JFrame("JTreeExample");
		aniket=new DefaultMutableTreeNode("Aniket");
		colors=new DefaultMutableTreeNode("Colors");
		games=new DefaultMutableTreeNode("Games");
		hobbies=new DefaultMutableTreeNode("Hobbies");
	}
	public void show()
	{
		frame.setLayout(null);
		aniket.add(colors);
		aniket.add(games);
		aniket.add(hobbies);
		tree=new JTree(aniket);
		frame.setBounds(45, 45, 500, 250);
		frame.add(tree);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tree.setBounds(45, 45, 150, 100);
	}

}
