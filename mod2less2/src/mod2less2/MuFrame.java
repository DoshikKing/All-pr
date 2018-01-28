package mod2less2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MuFrame extends JFrame {
	
	private JTextArea text;
	private double p1 = 0, p2 = 0;
	private int operation = 0;
	
	private void btnClick(JButton btn) {
		
	}
	
	public MuFrame() {
		JPanel panel = new JPanel();
		Container cont = getContentPane();
		panel.setLayout(null);
		Font btnFont = new Font("serif", 0, 20);
		Font labelFont = new Font("arial", 1, 30);
		Font textlFont = new Font("arial", 2, 30);
		
		JButton[] buttons = new JButton[17];
		for (int i = 0; i < 17; i++) {
			buttons[i] = new JButton();
			buttons[i].setSize(100, 25);
			buttons[i].setFont(btnFont);
			buttons[i].setLocation(30, 50+i*30);
			buttons[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					btnClick((JButton) e.getSource());
				}
			});
			panel.add(buttons[i]);
		}
		
		for (int i = 0; i < 10; i++) {
			buttons[i].setText("" + i);
		}
		
		buttons[10].setText("+");
		buttons[11].setText("-");
		buttons[12].setText("*");
		buttons[13].setText("/");
		buttons[14].setText("=");
		buttons[15].setText("C");
		buttons[16].setText("Exit");
		
		JLabel label = new JLabel("Result");
		label.setFont(labelFont);
		label.setBounds(130, 0, 300, 50);
		panel.add(label);
		
		text = new JTextArea();
		text.setFont(textlFont);
		text.setBounds(300, 1, 300, 35);
		text.setForeground(Color.BLUE);
		text.setBackground(Color.WHITE);
		panel.add(text);
		
		
		cont.add(panel);
		setBounds(0, 0 , 800, 600);
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
