import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ParentPane {
	
	//creates a new JPanel
	public JPanel panel = new JPanel();
	
	//creates elements that won't be in other panels
	//object names are abbreviated but the actual text content will provide a more clear
	//description of the purpose of each object
	
	//check boxes for negative fields, not in other boxes
	Checkbox db = new Checkbox("Dead Bot");
	Checkbox tip = new Checkbox("Tip Over");
	Checkbox ns = new Checkbox("No Show");
	Checkbox koc = new Checkbox("Knock Over Crates");
	
	//text fields for the match/team number
	JTextField match = new JTextField();
	JTextField number = new JTextField();//team number
	
	//creates the panel for the autonomous section of the scoring sheet
	Auto autoWindow = new Auto();
	
	//creates the panel for the autonomous starting position section of the scoring sheet
	AutoStartingPosition asp = new AutoStartingPosition();
	
	//creates the panel for the zone most played section of the scoring sheet
	ZonePlayed zp = new ZonePlayed();
	
	//creates the panel for the tote tally section of the scoring sheet
	ToteTally tt = new ToteTally();
	
	//creates the panel for the teleop section of the scoring sheet
	TeleOp to = new TeleOp();
	
	//creates the panel for the additional information section of the scoring sheet, this is assorted information
	//that, while relevant, is unrelated to each other but all are in the same box.
	InfoBox ib = new InfoBox();
	
	//creates the panel for the note section of the scoring sheet, notes are scored by check boxes as opposed to a text field
	Notes note = new Notes();


	//creates the main pane that the objects just created will be added to
	public ParentPane() {
		//sets parameters like the border, layout, size, color, etc.
		Border border = BorderFactory.createLineBorder(Color.black);
		panel.setLayout(null);//null layout allows for exact x,y positioning of elements, but makes scaling difficult
		panel.setSize(910, 600);
		panel.setLocation(100, 25);
		panel.setBackground(Color.white);
		panel.setBorder(border);

		//creates a font used for input fields
		Font input = new Font("Helvetica", Font.BOLD, 20);
		
		//simply puts text in the panel that identifies the input below it as team number input
		JLabel Teamnum = new JLabel("Team Number:");
		Teamnum.setFont(input);
		Teamnum.setSize(175, 25);
		Teamnum.setLocation(50, 400);

		//sets the attributes of the input box its self
		number.setSize(75, 25);
		number.setFont(input);
		number.setLocation(200, 400);
		
		//simply puts text in the panel that identifies the input below it as match number input
		JLabel Matchnum = new JLabel("Match Number:");
		Matchnum.setFont(input);
		Matchnum.setSize(175, 25);
		Matchnum.setLocation(300, 400);

		//sets the attributes of the input box its self
		match.setSize(43, 25);
		match.setFont(input);
		match.setLocation(450, 400);
		match.setText("0");
		match.setEditable(false);//note that the user cannot directly modify this value, they will use a button to add and subtract from it

		//the check boxes we created are now having attributes applied to them
		db.setSize(70, 20);
		db.setLocation(520, 400);
		tip.setSize(70, 20);
		tip.setLocation(590, 400);
		ns.setSize(70, 20);
		ns.setLocation(660, 400);
		koc.setSize(120, 20);
		koc.setLocation(730, 400);

		
		//adds a button to export the data that has been entered into excel
		JButton export = new JButton("Export");
		export.setFont(input);
		export.setSize(200, 100);
		export.setLocation(650, 450);

		//adds an action listener
		export.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					exportExcel();//calls export function
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		
		//match add button, adds 1 to the match number value
		JButton Madd = new JButton("+");
		
		//attributes are set
		Madd.setSize(43, 43);
		Madd.setLocation(450,425);
		
		//action listener is created
		Madd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(Integer.parseInt(match.getText()) <999)
					{
					match.setText(Integer.toString(Integer.parseInt(match.getText()) +1));//parses the new integer to a text value
					}
					
				
			}});
		
		//match subtract button, subtracts 1 to the match number value
       JButton Msub = new JButton("-");
		//attributes
		Msub.setSize(43, 43);
		Msub.setLocation(450,470);
		Msub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(Integer.parseInt(match.getText()) >0)
					{
					match.setText(Integer.toString(Integer.parseInt(match.getText()) -1));;//parses the new integer to a text value
					}
					
				
			}});
		
		
			
		//adds everything to the panel
		panel.add(autoWindow.panel);
		panel.add(asp.panel);
		panel.add(zp.panel);
		panel.add(tt.panel);
		panel.add(ib.panel);
		panel.add(to.panel);
		panel.add(note.panel);
		panel.add(Teamnum);
		panel.add(number);
		panel.add(Matchnum);
		panel.add(match);
		panel.add(db);
		panel.add(tip);
		panel.add(ns);
		panel.add(koc);
		panel.add(export);
		panel.add(Madd);
		panel.add(Msub);
	}

	//export function requires apache poi library
	private void exportExcel() throws IOException {
		System.out.println("exporting");
		FileInputStream file = new FileInputStream(new File(
				"workbook.xls"));
		Workbook wb = new HSSFWorkbook(file);
		//CreationHelper createHelper = wb.getCreationHelper();
		Sheet sheet = wb.getSheetAt(0);
		boolean end = true;
		int endLine = 0;
		for (int i = 0; end; i++) {
			if (sheet.getRow(i) == null) {
				end = false;
				endLine = i;
			}
		}
		Row row = sheet.createRow(endLine);
		int cellCount = 0;
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(Integer.parseInt(number.getText().replaceAll(",","")));
		cellCount++;
		cell = row.createCell(cellCount);
		cell.setCellValue(Integer.parseInt(match.getText()));
		cellCount++;
		cell = row.createCell(cellCount);
		if (autoWindow.toteGroup.getSelectedCheckbox() == autoWindow.tote3) {
			cell.setCellValue(3);
		} else if (autoWindow.toteGroup.getSelectedCheckbox() == autoWindow.tote2) {
			cell.setCellValue(2);
		} else if (autoWindow.toteGroup.getSelectedCheckbox() == autoWindow.tote1) {
			cell.setCellValue(1);
		} else if (autoWindow.toteGroup.getSelectedCheckbox() == autoWindow.tote0) {
			cell.setCellValue(0);
		}
		cellCount++;
		cell = row.createCell(cellCount);
		if (autoWindow.canGroup.getSelectedCheckbox() == autoWindow.can3) {
			cell.setCellValue(3);
		} else if (autoWindow.canGroup.getSelectedCheckbox() == autoWindow.can2) {
			cell.setCellValue(2);
		} else if (autoWindow.canGroup.getSelectedCheckbox() == autoWindow.can1) {
			cell.setCellValue(1);
		} else if (autoWindow.canGroup.getSelectedCheckbox() == autoWindow.can0) {
			cell.setCellValue(0);
		}
		cellCount++;
		cell = row.createCell(cellCount);
		if (autoWindow.move0.getState()) {
			cell.setCellValue(true);
		} else {
			cell.setCellValue(false);
		}
		cellCount++;
		cell = row.createCell(cellCount);
		if (asp.asp.getSelectedCheckbox() == asp.asp4) {
			cell.setCellValue(4);
		} else if (asp.asp.getSelectedCheckbox() == asp.asp3) {
			cell.setCellValue(3);
		} else if (asp.asp.getSelectedCheckbox() == asp.asp2) {
			cell.setCellValue(2);
		} else if (asp.asp.getSelectedCheckbox() == asp.asp1) {
			cell.setCellValue(1);
		} else if (asp.asp.getSelectedCheckbox() == asp.asp0) {
			cell.setCellValue(0);
		}
		cellCount++;
		cell = row.createCell(cellCount);
		if (zp.checkGroup.getSelectedCheckbox() == zp.az) {
			cell.setCellValue(0);
		} else if (zp.checkGroup.getSelectedCheckbox() == zp.of) {
			cell.setCellValue(1);
		} else if (zp.checkGroup.getSelectedCheckbox() == zp.lf) {
			cell.setCellValue(2);
		} else if (zp.checkGroup.getSelectedCheckbox() == zp.pf) {
			cell.setCellValue(3);
		}

		cellCount++;

		cell = row.createCell(cellCount);

		cell.setCellValue(Integer.parseInt(tt.one.getText()));

		cellCount++;
		cell = row.createCell(cellCount);

		cell.setCellValue(Integer.parseInt(tt.two.getText()));

		cellCount++;
		cell = row.createCell(cellCount);

		cell.setCellValue(Integer.parseInt(tt.three.getText()));

		cellCount++;
		cell = row.createCell(cellCount);

		cell.setCellValue(Integer.parseInt(tt.four.getText()));

		cellCount++;
		cell = row.createCell(cellCount);

		cell.setCellValue(Integer.parseInt(tt.five.getText()));

		cellCount++;
		cell = row.createCell(cellCount);

		cell.setCellValue(Integer.parseInt(tt.six.getText()));

		cellCount++;
		cell = row.createCell(cellCount);
		if (ib.can.getState()) {
			cell.setCellValue(true);
		} else {
			cell.setCellValue(false);
		}

		cellCount++;
		cell = row.createCell(cellCount);
		if (ib.floor.getState()) {
			cell.setCellValue(true);
		} else {
			cell.setCellValue(false);
		}

		cellCount++;
		cell = row.createCell(cellCount);
		if (ib.hp.getState()) {
			cell.setCellValue(true);
		} else {
			cell.setCellValue(false);
		}

		cellCount++;
		cell = row.createCell(cellCount);
		if (ib.coop.getSelectedCheckbox() == ib.set) {
			cell.setCellValue("Set");
		} else if (ib.coop.getSelectedCheckbox() == ib.stack) {
			cell.setCellValue("Stack");
		} else if (ib.coop.getSelectedCheckbox() == ib.none) {
			cell.setCellValue("No Coop");
		}

		cellCount++;
		cell = row.createCell(cellCount);
		if (ib.stackGroup.getSelectedCheckbox() == ib.ssix) {
			cell.setCellValue(6);
		} else if (ib.stackGroup.getSelectedCheckbox() == ib.sfive) {
			cell.setCellValue(5);
		} else if (ib.stackGroup.getSelectedCheckbox() == ib.sfour) {
			cell.setCellValue(4);
		} else if (ib.stackGroup.getSelectedCheckbox() == ib.sthree) {
			cell.setCellValue(3);
		} else if (ib.stackGroup.getSelectedCheckbox() == ib.stwo) {
			cell.setCellValue(2);
		} else if (ib.stackGroup.getSelectedCheckbox() == ib.sone) {
			cell.setCellValue(1);
		} else if (ib.stackGroup.getSelectedCheckbox() == ib.snul) {
			cell.setCellValue(0);
		}

		cellCount++;
		cell = row.createCell(cellCount);
		if (ib.plus.getState()) {
			cell.setCellValue(true);
		} else {
			cell.setCellValue(false);
		}

		cellCount++;
		cell = row.createCell(cellCount);
		if (to.DWO.getSelectedCheckbox() == to.dwo4) {
			cell.setCellValue(4);
		} else if (to.DWO.getSelectedCheckbox() == to.dwo3) {
			cell.setCellValue(3);
		} else if (to.DWO.getSelectedCheckbox() == to.dwo2) {
			cell.setCellValue(2);
		} else if (to.DWO.getSelectedCheckbox() == to.dwo1) {
			cell.setCellValue(1);
		} else if (to.DWO.getSelectedCheckbox() == to.dwo0) {
			cell.setCellValue(0);
		}

		cellCount++;

		cell = row.createCell(cellCount);
		if (to.pum.getSelectedCheckbox() == to.pum4) {
			cell.setCellValue(4);
		} else if (to.pum.getSelectedCheckbox() == to.pum3) {
			cell.setCellValue(3);
		} else if (to.pum.getSelectedCheckbox() == to.pum2) {
			cell.setCellValue(2);
		} else if (to.pum.getSelectedCheckbox() == to.pum1) {
			cell.setCellValue(1);
		} else if (to.pum.getSelectedCheckbox() == to.pum0) {
			cell.setCellValue(0);
		}

		cellCount++;
		cell = row.createCell(cellCount);
		if (to.wc.getSelectedCheckbox() == to.wc4) {
			cell.setCellValue(4);
		} else if (to.wc.getSelectedCheckbox() == to.wc3) {
			cell.setCellValue(3);
		} else if (to.wc.getSelectedCheckbox() == to.wc2) {
			cell.setCellValue(2);
		} else if (to.wc.getSelectedCheckbox() == to.wc1) {
			cell.setCellValue(1);
		} else if (to.wc.getSelectedCheckbox() == to.wc0) {
			cell.setCellValue(0);
		}

		cellCount++;

		cell = row.createCell(cellCount);
		if (to.mb.getSelectedCheckbox() == to.mb4) {
			cell.setCellValue(4);
		} else if (to.mb.getSelectedCheckbox() == to.mb3) {
			cell.setCellValue(3);
		} else if (to.mb.getSelectedCheckbox() == to.mb2) {
			cell.setCellValue(2);
		} else if (to.mb.getSelectedCheckbox() == to.mb1) {
			cell.setCellValue(1);
		} else if (to.mb.getSelectedCheckbox() == to.mb0) {
			cell.setCellValue(0);
		}

		cellCount++;
		cell = row.createCell(cellCount);
		if (to.tw.getSelectedCheckbox() == to.tw4) {
			cell.setCellValue(4);
		} else if (to.tw.getSelectedCheckbox() == to.tw3) {
			cell.setCellValue(3);
		} else if (to.tw.getSelectedCheckbox() == to.tw2) {
			cell.setCellValue(2);
		} else if (to.tw.getSelectedCheckbox() == to.tw1) {
			cell.setCellValue(1);
		} else if (to.tw.getSelectedCheckbox() == to.tw0) {
			cell.setCellValue(0);
		}

		cellCount++;
		cell = row.createCell(cellCount);
		if (to.pick.getSelectedCheckbox() == to.yes) {
			cell.setCellValue(true);
		} else if (to.pick.getSelectedCheckbox() == to.no) {
			cell.setCellValue(false);
		}

		cellCount++;
		cell = row.createCell(cellCount);
		if(note.checkGroup.getSelectedCheckbox() == note.eNeg)
		{
			cell.setCellValue("Extremely Negative");
		}
		else if(note.checkGroup.getSelectedCheckbox() == note.Neg)
		{
			cell.setCellValue("Negative");
		}
		else if(note.checkGroup.getSelectedCheckbox() == note.Neu)
		{
			cell.setCellValue("Neutral");
		}
		else if(note.checkGroup.getSelectedCheckbox() == note.Pos)
		{
			cell.setCellValue("Positive");
		}
		else if(note.checkGroup.getSelectedCheckbox() == note.ePos)
		{
			cell.setCellValue("Extremely Positive");
		}
		
		
		
		

		cellCount++;
		cell = row.createCell(cellCount);

		cell.setCellValue(db.getState());

		cellCount++;
		cell = row.createCell(cellCount);

		cell.setCellValue(tip.getState());

		cellCount++;
		cell = row.createCell(cellCount);

		cell.setCellValue(ns.getState());

		cellCount++;
		cell = row.createCell(cellCount);

		cell.setCellValue(koc.getState());

		cellCount++;

		file.close();

		FileOutputStream fileOut = new FileOutputStream(
				"workbook.xls");
		wb.write(fileOut);
		fileOut.close();
		wb.close();
		reset();
	}
	//resets all of the fields-match number
	void reset()
	{
		autoWindow.toteGroup.setSelectedCheckbox(autoWindow.tote0);
		autoWindow.canGroup.setSelectedCheckbox(autoWindow.can0);
		autoWindow.move0.setState(false);
		asp.asp.setSelectedCheckbox(asp.asp0);
		zp.checkGroup.setSelectedCheckbox(zp.pf);
		tt.one.setText("0");
		tt.two.setText("0");
		tt.three.setText("0");
		tt.four.setText("0");
		tt.five.setText("0");
		tt.six.setText("0");
		ib.can.setState(false);
		ib.floor.setState(false);
		ib.coop.setSelectedCheckbox(ib.none);
		ib.stackGroup.setSelectedCheckbox(ib.snul);
		ib.plus.setState(false);
		to.DWO.setSelectedCheckbox(to.dwo0);
		to.pum.setSelectedCheckbox(to.pum0);
		to.wc.setSelectedCheckbox(to.wc0);
		to.mb.setSelectedCheckbox(to.mb0);
		to.tw.setSelectedCheckbox(to.tw0);
		to.pick.setSelectedCheckbox(to.no);
		
		note.checkGroup.setSelectedCheckbox(note.Neu);
		db.setState(false);
		tip.setState(false);
		ns.setState(false);
		koc.setState(false);
		number.setText(" ");
		panel.repaint();
	}
	}

