package srce;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Bird extends GameObject{
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
	
	Bird(int x, int y, int width, int height) {
		super();
		// TODO Auto-generated constructor stub
		speed=10;
		 if (needImage) {
		        loadImage ("Bird.png");
		    }

	}
}
	