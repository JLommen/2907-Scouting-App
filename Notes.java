import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class Notes {
	public JPanel panel = new JPanel();
	CheckboxGroup checkGroup = new CheckboxGroup();
	Checkbox eNeg = new Checkbox("Extremely Negative", checkGroup,false);
	Checkbox Neg = new Checkbox(" Negative", checkGroup,false);
	Checkbox Neu = new Checkbox("Neutral", checkGroup,true);
	Checkbox Pos = new Checkbox("Positive", checkGroup,false);
	Checkbox ePos= new Checkbox("Extremely Positive", checkGroup,false);
	public Notes()
	{
		Border border = BorderFactory.createLineBorder(Color.black);
	
	panel.setLayout(null);
	panel.setSize(403,168);
	panel.setLocation(456,221);
	panel.setBackground(Color.white);
	panel.setBorder(border);
	
	eNeg.setSize(120,13);
	eNeg.setLocation(80, 50);
	Neg.setSize(80,13);
	Neg.setLocation(230, 50);
	Neu.setSize(80,13);
	Neu.setLocation(170, 84);
	Pos.setSize(80,13);
	Pos.setLocation(80,118);
	ePos.setSize(120,13);
	ePos.setLocation(230,118);
	JLabel title = new JLabel("Notes:");
	title.setSize(175,13);
	title.setLocation(10,7);
	
	panel.add(title);
	panel.add(eNeg);
	panel.add(Neg);
	panel.add(Neu);
	panel.add(Pos);
	panel.add(ePos);
	
}
}
