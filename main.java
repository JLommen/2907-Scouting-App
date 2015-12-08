import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;


public class main {
	public static void main(String args[])
	{
				//sets up the main JFRAME that will contain the main panel
				JFrame frame = new JFrame("Data Entry");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(false);
				//creates a container for the contents of the JFRAME
				Container con = frame.getContentPane();
				con.setBackground(Color.gray);
				
				//null layout allows for exact x,y positioning of elements, but makes scaling difficult
				con.setLayout(null);
				//creates ParentPane object
				ParentPane mainPane = new ParentPane();
				
				
				
			
				
				//adds the mainPane to the panel
				con.add(mainPane.panel);
				
				//adjust additional parameters for the main frame
				frame.setSize(1110,675);
				frame.setLocation(15,15);
				frame.setResizable(false);
				//displays the frame
				frame.setVisible(true);
			}

}
