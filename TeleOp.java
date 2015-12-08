import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class TeleOp {
	
	//creates panel
	public JPanel panel = new JPanel();
	
	//creates all the check boxes and their groups
	CheckboxGroup DWO = new CheckboxGroup();
	
	Checkbox dwo0 = new Checkbox("0",DWO,true);
	Checkbox dwo1 = new Checkbox("1",DWO,false);
	Checkbox dwo2 = new Checkbox("2",DWO,false);
	Checkbox dwo3 = new Checkbox("3",DWO,false);
	Checkbox dwo4 = new Checkbox("4",DWO,false);
CheckboxGroup pum = new CheckboxGroup();
	
	Checkbox pum0 = new Checkbox("0",pum,true);
	Checkbox pum1 = new Checkbox("1",pum,false);
	Checkbox pum2 = new Checkbox("2",pum,false);
	Checkbox pum3 = new Checkbox("3",pum,false);
	Checkbox pum4 = new Checkbox("4",pum,false);
CheckboxGroup wc = new CheckboxGroup();
	
	Checkbox wc0 = new Checkbox("0",wc,true);
	Checkbox wc1 = new Checkbox("1",wc,false);
	Checkbox wc2 = new Checkbox("2",wc,false);
	Checkbox wc3 = new Checkbox("3",wc,false);
	Checkbox wc4 = new Checkbox("4",wc,false);
CheckboxGroup mb = new CheckboxGroup();
	
	Checkbox mb0 = new Checkbox("0",mb,true);
	Checkbox mb1 = new Checkbox("1",mb,false);
	Checkbox mb2 = new Checkbox("2",mb,false);
	Checkbox mb3 = new Checkbox("3",mb,false);
	Checkbox mb4 = new Checkbox("4",mb,false);
	
CheckboxGroup tw = new CheckboxGroup();
	
	Checkbox tw0 = new Checkbox("0",tw,true);
	Checkbox tw1 = new Checkbox("1",tw,false);
	Checkbox tw2 = new Checkbox("2",tw,false);
	Checkbox tw3 = new Checkbox("3",tw,false);
	Checkbox tw4 = new Checkbox("4",tw,false);
	

	CheckboxGroup pick = new CheckboxGroup();
	Checkbox yes = new Checkbox("Yes",pick,false);
	Checkbox no = new Checkbox("No",pick,true);
	
	public TeleOp()
	{
	//border and panel properties assigned
	Border border = BorderFactory.createLineBorder(Color.black);	
	panel.setLayout(null);
	panel.setSize(403,168);
	panel.setLocation(456,50);
	panel.setBackground(Color.white);
	panel.setBorder(border);
	

	//creates lables for each category
	JLabel title = new JLabel("Tele-Op");
	title.setSize(175,13);
	title.setLocation(180,3);
	
	JLabel obs = new JLabel("Deal with Obstacles");
	obs.setSize(125,13);
	obs.setLocation(15,25);
	
	JLabel pic = new JLabel("Pick-Up Mechanism");
	pic.setSize(125, 13);
	pic.setLocation(15,50);
	
	JLabel cont = new JLabel("Well-Controled");
	cont.setSize(125,13);
	cont.setLocation(15,75);
	
	JLabel bin = new JLabel("Manipulate Bins");
	bin.setSize(125,13);
	bin.setLocation(15,100);
	
	JLabel tea = new JLabel("Teamwork");
	tea.setSize(125,13);
	tea.setLocation(15,125);
	
	JLabel you = new JLabel("Would You Pick Them?");
	you.setSize(160,13);
	you.setLocation(80,150);
	
	//sets check box attributes
	dwo0.setLocation(160,25);
	dwo0.setSize(23,13);
	dwo1.setLocation(205,25);
	dwo1.setSize(23,13);
	dwo2.setLocation(250,25);
	dwo2.setSize(23,13);
	dwo3.setLocation(295,25);
	dwo3.setSize(23,13);
	dwo4.setLocation(335,25);
	dwo4.setSize(23,13);
	

	pum0.setLocation(160,50);
	pum0.setSize(23,13);
	pum1.setLocation(205,50);
	pum1.setSize(23,13);
	pum2.setLocation(250,50);
	pum2.setSize(23,13);
	pum3.setLocation(295,50);
	pum3.setSize(23,13);
	pum4.setLocation(335,50);
	pum4.setSize(23,13);
	

	
	wc0.setLocation(160,75);
	wc0.setSize(23,13);
	wc1.setLocation(205,75);
	wc1.setSize(23,13);
	wc2.setLocation(250,75);
	wc2.setSize(23,13);
	wc3.setLocation(295,75);
	wc3.setSize(23,13);
	wc4.setLocation(335,75);
	wc4.setSize(23,13);
	

	
	mb0.setLocation(160,100);
	mb0.setSize(23,13);
	mb1.setLocation(205,100);
	mb1.setSize(23,13);
	mb2.setLocation(250,100);
	mb2.setSize(23,13);
	mb3.setLocation(295,100);
	mb3.setSize(23,13);
	mb4.setLocation(335,100);
	mb4.setSize(23,13);
	

	
	tw0.setLocation(160,125);
	tw0.setSize(23,13);
	tw1.setLocation(205,125);
	tw1.setSize(23,13);
	tw2.setLocation(250,125);
	tw2.setSize(23,13);
	tw3.setLocation(295,125);
	tw3.setSize(23,13);
	tw4.setLocation(335,125);
	tw4.setSize(23,13);
	
	
	
	yes.setSize(50,13);
	yes.setLocation(250, 150);
	no.setSize(50,13);
	no.setLocation(325, 150);
	
	
	//adds each object to the panel
	panel.add(title);
	panel.add(obs);
	panel.add(pic);
	panel.add(cont);
	panel.add(bin);
	panel.add(tea);
	panel.add(you);
	panel.add(dwo0);
	panel.add(dwo1);
	panel.add(dwo2);
	panel.add(dwo3);
	panel.add(dwo4);
	panel.add(pum0);
	panel.add(pum1);
	panel.add(pum2);
	panel.add(pum3);
	panel.add(pum4);
	panel.add(wc0);
	panel.add(wc1);
	panel.add(wc2);
	panel.add(wc3);
	panel.add(wc4);
	panel.add(mb0);
	panel.add(mb1);
	panel.add(mb2);
	panel.add(mb3);
	panel.add(mb4);
	panel.add(tw0);
	panel.add(tw1);
	panel.add(tw2);
	panel.add(tw3);
	panel.add(tw4);
	panel.add(yes);
	panel.add(no);
	}
}
