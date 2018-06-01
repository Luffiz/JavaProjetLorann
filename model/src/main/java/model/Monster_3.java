package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <b> Monster_3 is the class defining the 3th monster. </b>
 *  
 * @author ptorc
 *
 * @version 1.0
 */
public class Monster_3 extends Mobile_Elements{
	
	/**
	 * Picture of the 3rd monster
	 */
	Image Monster_3;
	
	/**
	 * Load the image of the 3rd monster to the coordinates passed in parameters from the sprite in the program files
	 * 
	 * @param OriginX X coordinate of the 3rd monster
	 * @param OriginY Y coordinate of the 3rd monster
	 */
	public Monster_3(int OriginX, int OriginY){
		x = OriginX;
		y = OriginY;
		
		ImageIcon Monster3 = new ImageIcon("../sprite/monster_3.png");
		Monster_3 = Monster3.getImage();
	}
	
	/**
	 * Return the image of the 3rd monster
	 * 
	 * @return the image of the 3rd monster
	 */
	public Image getImage(){
		return Monster_3;
	}
}
