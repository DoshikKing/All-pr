package mod2less2;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MuFrame extends JFrame {
	
	public MuFrame() {
		JPanel panel = new JPanel();
		Container cont = getContentPane();
		panel.setLayout(null);
		Font btnFont = new Font("serif", 0, 20);
		
		
		JButton btn = new JButton();
		btn.setText("Sasha");
		btn.setSize(100, 50);
		btn.setFont(btnFont);
		btn.setLocation(100, 100);
		panel.add(btn);
		
		JButton btn1 = new JButton();
		btn1.setText("Ilya");
		btn1.setSize(100, 50);
		btn1.setFont(btnFont);
		btn1.setLocation(100, 150);
		panel.add(btn1);
		
		cont.add(panel);
		setBounds(0, 0 , 800, 600);
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
