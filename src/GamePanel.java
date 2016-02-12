
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel implements ActionListener{
	JButton button[][] = new JButton[MAIN.gameX][MAIN.gameY];
	MAIN main;
	Icon ico[]={ new ImageIcon(getClass().getResource("green.png")), new ImageIcon(getClass().getResource("red.png"))};
	public GamePanel(MAIN main) {
		this.main=main;
		setLayout(null);
		for(int i=0; i<MAIN.gameX; i++)
		{
			for(int j=0; j<MAIN.gameY; j++)
			{
				button[i][j] = new JButton();
				button[i][j].setBounds((j*131)+3, (i*131)+3, 130, 130);
				button[i][j].addActionListener(this);
				button[i][j].setIcon(new ImageIcon(getClass().getResource("gray.png")));
				button[i][j].setRolloverIcon(ico[0]);
				button[i][j].setContentAreaFilled(false);
				button[i][j].setBorderPainted(false);
				add(button[i][j]);	
			}
	
		}
		
		
		//setBackground(Color.GREEN);
	}
	public void setPermanentIcon(int i, int j, int icoNum)
	{
		button[i][j].setIcon(ico[icoNum]);
		button[i][j].setRolloverEnabled(false);
	}
	public void setRolloverIcon(int flag)
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(!main.gameControl.isClicked(i, j))
					button[i][j].setRolloverIcon(ico[flag]);
			}
		}
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		for(int i=0; i<MAIN.gameX; i++)
			for(int j=0; j<MAIN.gameY; j++)
			{
				if(arg0.getSource()==button[i][j])
					{
						main.gameControl.userClick(i, j);
					}
			}
	}

}
