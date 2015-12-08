import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Auto 
{
	public JPanel panel = new JPanel();
	CheckboxGroup toteGroup = new CheckboxGroup();
	Checkbox tote0 = new Checkbox("",toteGroup,true);
    Checkbox tote1 = new Checkbox("",toteGroup,false);
    Checkbox tote2 = new Checkbox("",toteGroup,false);
    Checkbox tote3 = new Checkbox("",toteGroup,false);
    CheckboxGroup canGroup = new CheckboxGroup();
   	Checkbox can0 = new Checkbox("",canGroup,true);
       Checkbox can1 = new Checkbox("",canGroup,false);
       Checkbox can2 = new Checkbox("",canGroup,false);
       Checkbox can3 = new Checkbox("",canGroup,false);
       
      
   	Checkbox move0 = new Checkbox("");
      
	public Auto()
	{
	Border border = BorderFactory.createLineBorder(Color.black);
	
	panel.setLayout(null);
	panel.setSize(200,140);
	panel.setLocation(50,50);
	panel.setBackground(Color.white);
	panel.setBorder(border);

	
	JLabel autoLabel = new JLabel("Auto:               0:       1:       2:       3:");
	autoLabel.setSize(200,10);
	autoLabel.setLocation(10,5);
	
	JLabel totesLabel = new JLabel("Totes:");
	totesLabel.setSize(50,10);
	totesLabel.setLocation(10,23);
	JLabel cansLabel = new JLabel("Cans:");
	cansLabel.setSize(50,10);
	cansLabel.setLocation(10,65);
	JLabel moveLabel = new JLabel("Move:");
	moveLabel.setSize(50,10);
	moveLabel.setLocation(10,115);
	
	
    tote0.setSize(25,25);
    tote0.setLocation(82,16);
    tote0.setVisible(true);
    tote1.setSize(25,25);
    tote1.setLocation(112,16);
    tote1.setVisible(true);
    tote2.setSize(25,25);
    tote2.setLocation(142,16);
    tote2.setVisible(true);
    tote3.setSize(25,25);
    tote3.setLocation(172,16);
    tote3.setVisible(true);
    
    
   
    can0.setSize(25,25);
    can0.setLocation(82,60);
    can0.setVisible(true);
    can1.setSize(25,25);
    can1.setLocation(112,60);
    can1.setVisible(true);
    can2.setSize(25,25);
    can2.setLocation(142,60);
    can2.setVisible(true);
    can3.setSize(25,25);
    can3.setLocation(172,60);
    can3.setVisible(true);
    
   
    move0.setSize(25,25);
    move0.setLocation(82,110);
    move0.setVisible(true);
    
	
	panel.add(autoLabel);
	panel.add(totesLabel);
	panel.add(cansLabel);
	panel.add(moveLabel);
	panel.add(tote0);
	panel.add(tote1);
	panel.add(tote2);
	panel.add(tote3);
	panel.add(can0);
	panel.add(can1);
	panel.add(can2);
	panel.add(can3);
	panel.add(move0);




	
	
	
	
	
}
	
}
