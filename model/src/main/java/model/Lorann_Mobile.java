package model;

import java.awt.Image;

import javax.swing.ImageIcon;


/**
 * <b> Lorann_Mobile is the class defining Lorann's display according to his movement. </b>
 *  
 * @author ptorc
 *
 * @version 1.0
 */
public class Lorann_Mobile extends Mobile_Elements {
	
	public static Object Lorann;
	
	/**
	 * Image of Lorann according to his displacement
	 */
	Image LorannImg;
	ImageIcon LorannDown = new ImageIcon("../sprite/lorann_b.png");
	ImageIcon LorannDownLeft = new ImageIcon("../sprite/lorann_bl.png");
	ImageIcon LorannDownRight = new ImageIcon("../sprite/lorann_br.png");
	ImageIcon LorannRight = new ImageIcon("../sprite/lorann_r.png");
	ImageIcon LorannLeft = new ImageIcon("../sprite/lorann_l.png");
	ImageIcon LorannUp = new ImageIcon("../sprite/lorann_u.png");
	ImageIcon LorannUpLeft = new ImageIcon("../sprite/lorann_ul.png");
	ImageIcon LorannUpRight = new ImageIcon("../sprite/lorann_ur.png");
	
	/**
	 * Load the image of Lorann to the coordinates passed in parameters from the sprite in the program files
	 * 
	 * @param OriginX X coordinate of Lorann
	 * @param OriginY Y coordinate of Lorann
	 */
	public Lorann_Mobile(int OriginX,int OriginY){
		this.x = OriginX;
		this.y = OriginY;
		
		ImageIcon Lorann_Img = new ImageIcon("../sprite/lorann_b.png");
		LorannImg = Lorann_Img.getImage();
	}
	

	/**
	 * Method to display the correct sprite according to the movement of the character.
	 * 
	 * @return the image corresponding to the movement of the character
	 */
	public Image getImage(){
		
		switch (this.getWay()) {
		
		case "UP":
			LorannImg = LorannUp.getImage();
		break;
		
		case "UPLEFT":
			LorannImg = LorannUpLeft.getImage();
		break;
		
		case "UPRIGHT":
			LorannImg = LorannUpRight.getImage();
		break;
		
		case "RIGHT":
			LorannImg = LorannRight.getImage();
		break;
		
		case "LEFT":
			LorannImg = LorannLeft.getImage();
		break;
		
		case "DOWN":
			LorannImg = LorannDown.getImage();
		break;
		
		case "DOWNLEFT":
			LorannImg = LorannDownLeft.getImage();
		break;
		
		case "DOWNRIGHT":
			LorannImg = LorannDownRight.getImage();
		break;
		
		}
		return LorannImg;
	}

}
