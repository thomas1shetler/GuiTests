import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class events extends JFrame {
	private JLabel label;
	private JLabel label2;
	private JButton button;
	private JButton button2;
	private int x = 0, y = 0;
	public events () {
		setLayout(new FlowLayout());
		
		button2 = new JButton("No Click here for the text");
		add(button2);
		
		label2 = new JLabel("");
		add(label2);
		
		button = new JButton("Click For Da text");
		add(button);
		
		label = new JLabel("");
		add(label);
		
		event e = new event();
		button.addActionListener(e);
		
		event2 ev = new event2();
		button2.addActionListener(ev);
		
	}
	public class event2 implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			if(y == 0) {
			label2.setText("Clicker there instead");
			y = 1;
			} 
			else if(y == 1) {
				label2.setText("");
				y = 0;
			
			}
		}
		
	}
	
	public class event implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (x == 0) {
			label.setText("Click the other guy? \n what you bugging me for");
			x = 1;
			} 
			 else if(x == 1) {
				label.setText("");
				x = 0;
			}
		}
	}

	public static void main (String args[]) {
		events gui = new events();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setSize(300, 150);
		gui.setTitle("nigger");
	}
}


