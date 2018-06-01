package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <b> Monster_4 is the class defining the 4th monster. </b>
 *  
 * @author ptorc
 *
 * @version 1.0
 */
public class Monster_4 extends Mobile_Elements{
	
	/**
	 * Picture of the 4th monster
	 */
	Image Monster_4;
	
	/**
	 * Load the image of the 4th monster to the coordinates passed in parameters from the sprite in the program files
	 * 
	 * @param OriginX X coordinate of the 4th monster
	 * @param OriginY Y coordinate of the 4th monster
	 */
	public Monster_4(int OriginX, int OriginY){
		x = OriginX;
		y = OriginY;
		
		ImageIcon Monster4 = new ImageIcon("../sprite/monster_4.png");
		Monster_4 = Monster4.getImage();
	}
	
	/**
	 * Return the image of the 4th monster
	 * 
	 * @return the image of the 4th monster
	 */
	public Image getImage(){
		return Monster_4;
	}


}
