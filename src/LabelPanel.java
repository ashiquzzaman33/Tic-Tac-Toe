
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelPanel extends JPanel{
	JLabel label;
	MAIN main;
	String str = "Your Move, ";
	public LabelPanel (MAIN m) {
		main=m;
		label = new JLabel(str+MAIN.playerName[1]);
		label.setFont(new Font("Times New Romans", Font.BOLD, 20));
		add(label);
	}
	
	public void setText(int flag)
	{
		String s=str+MAIN.playerName[flag];
		label.setText(s);
	}
}
