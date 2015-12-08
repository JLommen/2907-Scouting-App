import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class ZonePlayed {
	public JPanel panel = new JPanel();
	CheckboxGroup checkGroup = new CheckboxGroup();
	Checkbox pf = new Checkbox("Protected Feeder",checkGroup,true);
    Checkbox lf = new Checkbox("Landfill",checkGroup,false);
    Checkbox of = new Checkbox("Open Feeder",checkGroup,false);
    Checkbox az = new Checkbox("Auto Zone",checkGroup,false);
	public ZonePlayed()
	{
		Border border = BorderFactory.createLineBorder(Color.black);
	
	panel.setLayout(null);
	panel.setSize(200,70);
	panel.setLocation(50,319);
	panel.setBackground(Color.white);
	panel.setBorder(border);
	

	JLabel title = new JLabel("Zone Most Played In(Teleop)");
	title.setSize(175,13);
	title.setLocation(17,3);
	panel.add(title);
	
	
	
	
	
	
	
    pf.setSize(100,25);
    pf.setLocation(10,17);
    pf.setVisible(true);
    lf.setSize(75,25);
    lf.setLocation(120,17);
    lf.setVisible(true);
    of.setSize(100,25);
    of.setLocation(10,40);
    of.setVisible(true);
    az.setSize(75,25);
    az.setLocation(120,40);
    az.setVisible(true);
    panel.add(pf);
    panel.add(lf);
    panel.add(of);
    panel.add(az);
	}
}
