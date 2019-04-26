package core.input;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static core.editor.Editor.*;

public class InputHandler implements ActionListener {

	public void actionPerformed(ActionEvent event) {	
		String action = event.getActionCommand();
		
		switch (action) {
			case "New File":
				newFile();
				break;
			case "Open File":
				openFile();
				break;
			case "Save File":
				saveFile();
				break;
			case "Save As":
				saveAs();
				break;
			case "Exit":
				exit();
				break;
			case "Undo":
				undo();
				break;
			case "Cut":
				cut();
				break;
			case "Copy":
				copy();
				break;
			case "Paste":
				paste();
				break;
			case "Delete":
				delete();
				break;
			case "Find":
				find();
				break;
			case "Replace":
				replace();
				break;
			case "Select All":
				selectAll();
				break;
			default: 
				System.err.println("Invalid action");
				break;
		}
	}

}