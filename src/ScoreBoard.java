
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScoreBoard extends JPanel{
	MAIN main;
	public ScoreBoard(MAIN main) {
		this.main = main;
		
	}
	public void showScoreBoard(){
		JPanel panel = new JPanel();
		setSize(300, 500);
		repaint();
		String str=String.format("%s: %d\n%s: %d\nDraw: %d", MAIN.playerName[1], MAIN.score[0], MAIN.playerName[0], MAIN.score[1], MAIN.score[2]);
		JOptionPane.showMessageDialog(main, str, "Score Board", JOptionPane.PLAIN_MESSAGE);
	}

}
