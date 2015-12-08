import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class ToteTally {

	public JPanel panel = new JPanel();
	JTextField two = new JTextField();
	JTextField one = new JTextField();
	JTextField three = new JTextField();
	JTextField four = new JTextField();
	JTextField five = new JTextField();
	JTextField six = new JTextField();
	public ToteTally()
	{
		Border border = BorderFactory.createLineBorder(Color.black);
	
	panel.setLayout(null);
	panel.setSize(200,168);
	panel.setLocation(253,50);
	panel.setBackground(Color.white);
	panel.setBorder(border);
	

	JLabel title = new JLabel("Tote Tally");
	title.setSize(175,13);
	title.setLocation(10,3);
	
	JLabel stack1 = new JLabel("1:");
	stack1.setLocation(10,20);
	stack1.setSize(13,13);
	JLabel stack2 = new JLabel("2:");
	stack2.setLocation(10,45);
	stack2.setSize(13,13);
	JLabel stack3 = new JLabel("3:");
	stack3.setLocation(10,70);
	stack3.setSize(13,13);
	JLabel stack4 = new JLabel("4:");
	stack4.setLocation(10,95);
	stack4.setSize(13,13);
	JLabel stack5 = new JLabel("5:");
	stack5.setLocation(10,120);
	stack5.setSize(13,13);
	JLabel stack6 = new JLabel("6:");
	stack6.setLocation(10,145);
	stack6.setSize(13,13);
	
	
	Font input = new Font("Helvetica", Font.BOLD, 18);
	
	 
	 
	one.setLocation(100,18);
	one.setSize(75,19);
	one.setText("0");
	one.setFont(input);
	one.setHorizontalAlignment(JTextField.CENTER);
	
	two.setLocation(100,43);
	two.setSize(75,19);
	two.setText("0");
	two.setFont(input);
	two.setHorizontalAlignment(JTextField.CENTER);
	
	three.setLocation(100,68);
	three.setSize(75,19);
	three.setText("0");
	three.setFont(input);
	three.setHorizontalAlignment(JTextField.CENTER);

	four.setLocation(100,93);
	four.setSize(75,19);
	four.setText("0");
	four.setFont(input);
	four.setHorizontalAlignment(JTextField.CENTER);

	five.setLocation(100,118);
	five.setSize(75,19);
	five.setText("0");
	five.setFont(input);
	five.setHorizontalAlignment(JTextField.CENTER);
	
	six.setLocation(100,143);
	six.setSize(75,19);
	six.setText("0");
	six.setFont(input);
	six.setHorizontalAlignment(JTextField.CENTER);
	
	
	
	
	panel.add(title);
	panel.add(stack1);
	panel.add(stack2);
	panel.add(stack3);
	panel.add(stack4);
	panel.add(stack5);
	panel.add(stack6);
	panel.add(one);
	panel.add(two);
	panel.add(three);
	panel.add(four);
	panel.add(five);
	panel.add(six);
	}


}
