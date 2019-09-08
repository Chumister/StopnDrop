package srce;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BirdPanel extends JPanel implements ActionListener, KeyListener{
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}
	Bird Rocket = new Bird(250,700,50,50);

final int MENU = 0;
final int GAME = 1;
final int END = 2;
int currentState = MENU;
BirdManager object;
	BirdPanel(){
		if (needImage) {
		    loadImage ("Background.jpg");
		}
		
	object=new BirdManager();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}