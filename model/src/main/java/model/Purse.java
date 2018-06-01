package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <b> Purse is the class defining purses objects. </b>
 *  
 * @author ptorc
 *
 * @version 1.0
 */
public class Purse extends Uncrossable {
	
	/**
	 * Picture of the purse
	 */
	Image Purse;
	
	/**
	 * Load the image of the purse to the coordinates passed in parameters from the sprite in the program files
	 * 
	 * @param OriginX X coordinate of the purse
	 * @param OriginY Y coordinate of the purse
	 */
	public Purse(int OriginX, int OriginY) {
		
		this.x = OriginX;
		this.y = OriginY;
		
		ImageIcon PurseImg = new ImageIcon("../sprite/purse.png");
		Purse = PurseImg.getImage();
	}
	
	/**
	 * Return the image of the purse
	 * 
	 * @return the image of the purse
	 */
	public Image getImage() {
		
		return Purse;
		
	}
	

}
