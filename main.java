import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;


public class main {
	public static void main(String args[])
	{
				JFrame frame = new JFrame("Data Entry");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(false);
				Container con = frame.getContentPane();
				con.setBackground(Color.gray);
				con.setLayout(null);
				ParentPane mainPane = new ParentPane();
				
				
				
			
				
				//con.add(autoWindow.panel);
				con.add(mainPane.panel);
				frame.setSize(1110,675);
				frame.setLocation(15,15);
				frame.setResizable(false);
				frame.setVisible(true);
			}

}
