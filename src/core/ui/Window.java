package core.ui;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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
	
	public void init() {
		window = new JFrame(TITLE);
		canvas = new JPanel();
		editor = new JTextArea();
		
		icon = new ImageIcon("res/icon.png");
		font = new Font("Consolas", Font.PLAIN, 14);
		
		window.setIconImage(icon.getImage());
		window.setSize(WIDTH, HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setResizable(true);
		window.setVisible(true);
		
		editor.setFont(font);
		
		canvas.setLayout(new BorderLayout());
		canvas.setBorder(new EtchedBorder());
		canvas.add(editor);

		requestFocus();
		
		window.add(canvas);
	}
	
}