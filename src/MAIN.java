
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class MAIN extends JFrame{
	GameControl gameControl;
	ScoreBoard scoreBoard;
	MenuControl menuControl;
	LabelPanel labelPanel;
	GamePanel gamePanel ;
	static String playerName[]={"Player 2", "Player 1"};
	static int score[]={0, 0, 0};
	static int gameX;
	static int gameY;
	static int gameConstant=3;
	public static void main(String[] args) {
		gameX=3;
		gameY=3;
		MAIN main = new MAIN();
	
		main.startGame();	
	}
	public void startGame()
	{	
		scoreBoard = new ScoreBoard(this);
		gameControl = new GameControl(this);
		setLayout(null);
		setIconImage(new ImageIcon(getClass().getResource("tictacto_logo.png")).getImage());
		setTitle("Tic Tac Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(405, 480);
		setLocationRelativeTo(null);
		
		mainFrame();
		setVisible(true);
		setResizable(false);
	}
	public void replay()
	{
		gameControl = new GameControl(this);
		newGame();
		
	}
	public void mainFrame(){
		createGamePanel();
		createMenuControl();
		createLabelPanel();
		
	}
	public void createMenuControl(){
		
		menuControl = new MenuControl(this);
		menuControl.setBounds(0, 0, 400, 20);
		menuControl.setBackground(new Color(200, 200, 200));	
		add(menuControl);
	}
	
	public void createLabelPanel(){
		
		labelPanel = new LabelPanel(this);
		labelPanel.setBounds(0, 415, 395, 40);
		add(labelPanel);
	}
	public void createGamePanel(){
		gamePanel = new GamePanel(this);
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
