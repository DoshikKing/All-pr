package mod2less2;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MuFrame extends JFrame {
	
	public MuFrame() {
		JPanel panel = new JPanel();
		Container cont = getContentPane();
		panel.setLayout(null);
		
		
		setBounds(0, 0 , 800, 600);
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
