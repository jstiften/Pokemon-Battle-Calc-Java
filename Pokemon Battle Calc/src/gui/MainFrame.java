package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{

	private JMenuBar menuBar;
	private JMenu file;
	private JMenuItem exit;
	
	public MainFrame() {
		setLayout(new FlowLayout());
		
		file = new JMenu("File");
		exit = new JMenuItem("Exit");
		
		ExitListener ex = new ExitListener();
		exit.addActionListener(ex);
		
		file.add(exit);
		
		menuBar = new JMenuBar();
		menuBar.add(file);
		setJMenuBar(menuBar);
	}
	
	public static void initMainFrame(MainFrame mainFrame, int x, int y, String title) {
		if(mainFrame == null) {
			mainFrame = new MainFrame();
		}
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(x, y);
		mainFrame.setVisible(true);
		mainFrame.setTitle(title);
	}
	
	public class ExitListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
		}	
	}
}
