package core.ui;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;

@SuppressWarnings("serial")
public class Window extends JFrame {
	
	private static final String TITLE = "Text Editor";
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	
	private ImageIcon icon;
	private Font font;
	
	private JFrame window;
	private JPanel canvas;
	private JTextArea editor;
	
	private JMenuBar menuBar;
	private JMenu fileMenu, editMenu;
	private JMenuItem NewFile, OpenFile, SaveFile, SaveAs, Exit;
	private JMenuItem Undo, Cut, Copy, Paste, Delete, Find, Replace, SelectAll;
	
	public void init() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		window = new JFrame(TITLE);
		canvas = new JPanel();
		editor = new JTextArea();
		
		createMenuBar();
		
		icon = new ImageIcon("res/icon.png");
		font = new Font("Consolas", Font.PLAIN, 14);
		
		window.setIconImage(icon.getImage());
		window.setSize(WIDTH, HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setResizable(true);
		window.setVisible(true);
		window.setJMenuBar(menuBar);
		
		editor.setFont(font);
		
		canvas.setLayout(new BorderLayout());
		canvas.setBorder(new EtchedBorder());
		canvas.add(editor);
		
		requestFocus();
		
		window.add(canvas);
	}
	
	private void createMenuBar() {
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		
		NewFile = new JMenuItem("New File");
		OpenFile = new JMenuItem("Open File");
		SaveFile = new JMenuItem("Save File");
		SaveAs = new JMenuItem("Save as");
		Exit = new JMenuItem("Exit");
		
		Undo = new JMenuItem("Undo");
		Cut = new JMenuItem("Cut");
		Copy = new JMenuItem("Copy");
		Paste = new JMenuItem("Paste");
		Delete = new JMenuItem("Delete");
		Find = new JMenuItem("Find");
		Replace = new JMenuItem("Replace");
		SelectAll = new JMenuItem("Select All");
		
		fileMenu.add(NewFile);
		fileMenu.add(OpenFile);
		fileMenu.add(SaveFile);
		fileMenu.add(SaveAs);
		fileMenu.addSeparator();
		fileMenu.add(Exit);
		
		editMenu.add(Undo);
		editMenu.addSeparator();
		editMenu.add(Cut);
		editMenu.add(Copy);
		editMenu.add(Paste);
		editMenu.add(Delete);
		editMenu.addSeparator();
		editMenu.add(Find);
		editMenu.add(Replace);
		editMenu.addSeparator();
		editMenu.add(SelectAll);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
	}
	
}