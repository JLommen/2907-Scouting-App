import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class InfoBox {

	//creates the panel
	public JPanel panel = new JPanel();
	
	//sets up the check boxes and their groups
	Checkbox floor = new Checkbox("Floor");
	Checkbox can = new Checkbox("Can");
	Checkbox hp = new Checkbox("HP");
	CheckboxGroup coop = new CheckboxGroup();
	Checkbox set = new Checkbox("Set",coop,false);
	Checkbox stack = new Checkbox("Stack",coop,false);
	Checkbox none = new Checkbox("None",coop,true);
	CheckboxGroup stackGroup = new CheckboxGroup();
	Checkbox snul = new Checkbox("0",stackGroup,true);
	Checkbox sone = new Checkbox("1",stackGroup,false);
	Checkbox stwo = new Checkbox("2",stackGroup,false);
	Checkbox sthree = new Checkbox("3",stackGroup,false);
	Checkbox sfour = new Checkbox("4",stackGroup,false);
	Checkbox sfive = new Checkbox("5",stackGroup,false);
	Checkbox ssix = new Checkbox("6",stackGroup,false);
    Checkbox plus = new Checkbox("+");

	public InfoBox()
	{
		//creates border and panel attributes
		Border border = BorderFactory.createLineBorder(Color.black);
		panel.setLayout(null);
		panel.setSize(200,168);
		panel.setLocation(253,221);
		panel.setBackground(Color.white);
		panel.setBorder(border);
	

	//labels each field
	JLabel litter = new JLabel("Successful Litter:");
	litter.setSize(175,13);
	litter.setLocation(5,3);
	JLabel coopertition = new JLabel("Coopertition:");
	coopertition.setSize(175,13);
	coopertition.setLocation(5,56);	
	JLabel stackapacity = new JLabel("stackapacity:");
	stackapacity.setSize(175,13);
	stackapacity.setLocation(5,100);
	
	
	//gives attributes to the check boxes
	can.setSize(40,13);
	can.setLocation(7,20);
	
	floor.setSize(50,13);
	floor.setLocation(67,20);
	
	hp.setSize(40,13);
	hp.setLocation(127,20);
	
	
	set.setLocation(10,80);
	set.setSize(35,13);
	
	stack.setLocation(60,80);
	stack.setSize(50,13);
	
	none.setLocation(120,80);
	none.setSize(50,13);
	
	
	snul.setLocation(10,140);
	snul.setSize(23,13);
	
	sone.setLocation(36,140);
	sone.setSize(23,13);
	stwo.setLocation(59,140);
	stwo.setSize(23,13);
	
	sthree.setLocation(82,140);
	sthree.setSize(23,13);
	
	sfour.setLocation(105,140);
	sfour.setSize(23,13);
	
	sfive.setLocation(128,140);
	sfive.setSize(23,13);
	
		ssix.setLocation(151,140);
	ssix.setSize(23,13);
	
	
	plus.setLocation(174,140);
	plus.setSize(23,13);
	
	
	panel.add(litter);
	panel.add(coopertition);
	panel.add(stackapacity);
	panel.add(can);
	panel.add(floor);
	panel.add(hp);
	panel.add(set);
	panel.add(stack);
	panel.add(none);
	panel.add(snul);
	panel.add(sone);
	panel.add(stwo);
	panel.add(sthree);
	panel.add(sfour);
	panel.add(sfive);
	panel.add(ssix);
	panel.add(plus);
	}

}
