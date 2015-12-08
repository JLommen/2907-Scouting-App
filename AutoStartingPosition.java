import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class AutoStartingPosition 
{
	public JPanel panel = new JPanel();
	CheckboxGroup asp = new CheckboxGroup();
	Checkbox asp0 = new Checkbox("",asp,true);
	Checkbox asp1 = new Checkbox("",asp,false);
	Checkbox asp2 = new Checkbox("",asp,false);
	Checkbox asp3 = new Checkbox("",asp,false);
	Checkbox asp4 = new Checkbox("",asp,false);
	public AutoStartingPosition()
	{
		Border border = BorderFactory.createLineBorder(Color.black);
	
	panel.setLayout(null);
	panel.setSize(200,123);
	panel.setLocation(50,193);
	panel.setBackground(Color.white);
	panel.setBorder(border);
	

	JLabel title = new JLabel("Auto Starting Position");
	title.setSize(175,13);
	title.setLocation(35,3);
	
	
	
	asp0.setLocation(45,50);
	asp0.setSize(13,13);
	asp1.setLocation(90,50);
	asp1.setSize(13,13);
	asp2.setLocation(135,50);
	asp2.setSize(13,13);
	asp3.setLocation(70,85);
	asp3.setSize(13,13);
	asp4.setLocation(115,85);
	asp4.setSize(13,13);
	
	panel.add(title);
	panel.add(asp0);
	panel.add(asp1);
	panel.add(asp2);
	panel.add(asp3);
	panel.add(asp4);
	}

}
