
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainFrame extends JFrame{
	 MAIN main;
	 LabelPanel  labelPanel;
	 GamePanel gamePanel;
	MenuControl menuControl;
	Container contentPane;
	 MainFrame(MAIN main){
		setLayout(null);
		this.main =main;
		createGamePanel();
		createMenuControl();
		createLabelPanel();
		
	}
	public void createMenuControl(){
		
		menuControl = new MenuControl(main);
		menuControl.setBounds(0, 0, 400, 20);
		menuControl.setBackground(new Color(200, 200, 200));	
		add(menuControl);
	}
	
	public void createLabelPanel(){
		
		labelPanel = new LabelPanel(main);
		labelPanel.setBounds(0, 415, 395, 40);
		add(labelPanel);
	}
	public void createGamePanel(){
		gamePanel = new GamePanel(main);
		gamePanel.setBounds(0, 22, 700, 395);	
		add(gamePanel);
	}
	
	public void newGame()
	{
		remove(gamePanel);
		remove(labelPanel);
		repaint();
		createGamePanel();
		createLabelPanel();
	}

}
