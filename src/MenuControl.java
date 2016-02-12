
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuControl extends JMenuBar implements ActionListener{
	JMenu menu = new JMenu("Menu");
	JMenu preference = new JMenu("Preference");
	JMenu help = new JMenu("Help");
	JRadioButtonMenuItem menuItem[] = new JRadioButtonMenuItem[3];
	JRadioButtonMenuItem preferenceItem[]= new JRadioButtonMenuItem[1];
	JRadioButtonMenuItem HelpItem[] = new JRadioButtonMenuItem[1];
	String menuList[] = {"Play Again", "Score Board", "Exit"};
	String preferenceList[]={"Change Player Name"};
	String HelpList[]={"About"};
	ButtonGroup buttonGroupMenu = new ButtonGroup();
	ButtonGroup buttonGroupPreference = new ButtonGroup();
	ButtonGroup buttonGroupHelp = new ButtonGroup();
	MAIN main;
	
	public MenuControl(MAIN main) {
		//Create and Instantiate menuItem
		this.main = main;
		for(int i=0; i<menuItem.length; i++)
		{
			menuItem[i]= new JRadioButtonMenuItem(menuList[i]);
			menuItem[i].addActionListener(this);
			buttonGroupMenu.add(menuItem[i]);
			menu.add(menuItem[i]);
		}
		//Create and Instantiate preferenceItem
		for(int i=0; i<preferenceItem.length; i++)
		{
			preferenceItem[i]= new JRadioButtonMenuItem(preferenceList[i]);
			preferenceItem[i].addActionListener(this);
			buttonGroupPreference.add(preferenceItem[i]);
			preference.add(preferenceItem[i]);
		}
		//Create and Instantiate HelpItem
		for(int i=0; i<HelpItem.length; i++)
		{
			HelpItem[i]= new JRadioButtonMenuItem(HelpList[i]);
			HelpItem[i].addActionListener(this);
			buttonGroupHelp.add(HelpItem[i]);
			help.add(HelpItem[i]);
		}
		//Add element in Main Menu and set attribute
		add(menu);	
		add(preference);
		add(help);
	}
	public JMenuBar getMenu()
	{
		return this;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand()=="Exit")
			System.exit(0);
		else if(event.getActionCommand()=="Play Again")
			main.replay();
		else if(event.getActionCommand()=="Score Board")
			main.scoreBoard.showScoreBoard();
		else if(event.getActionCommand()=="Change Player Name")
		{
				MAIN.playerName[1]=JOptionPane.showInputDialog("Player 1", "Player 1");
			MAIN.playerName[0] = JOptionPane.showInputDialog("Player 2", "Player 2");
			
		}
		else if(event.getActionCommand()=="About")
		{
			Icon icon = new ImageIcon(getClass().getResource("/Scratchaar_logo.png"));
			JTextArea textArea =new JTextArea();
			textArea.setEditable(false);
			//textArea.setBackground(new Color(220, 220, 220));
			textArea.setOpaque(false);
			textArea.setFont(new Font("Serif", Font.BOLD, 15));
			textArea.setText(String.format("\nTIC TAC TOE" +
					"Version: 1.0.0\nDeveloped By Md. Ashiquzzaman\nCopyright @Scratchaar Solutions Ltd.\n"));
			JOptionPane.showMessageDialog(main, textArea, "About", JOptionPane.PLAIN_MESSAGE, icon);
		}
		
		
	}

}
