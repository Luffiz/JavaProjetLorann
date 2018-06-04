package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <b> Monster_2 is the class defining the 2nd monster. </b>
 *  
 * @author ptorc
 *
 * @version 1.0
 */
public class Monster_2 extends Mobile_Elements{/**
	
	/**
	 * Picture of the 2nd monster
	 */
	Image Monster_2;
	
	/**
	 * Load the image of the 2nd monster to the coordinates passed in parameters from the sprite in the program files
	 * 
	 * @param OriginX X coordinate of the 2nd monster
	 * @param OriginY Y coordinate of the 2nd monster
	 */
	public Monster_2(int OriginX, int OriginY){
		x = OriginX;
		y = OriginY;
		
		ImageIcon Monster2 = new ImageIcon("../sprite/monster_2.png");
		Monster_2 = Monster2.getImage();
	}
	
	/**
	 * Return the image of the 2nd monster
	 * 
	 * @return the image of the 2nd monster
	 */
	public Image getImage(){
		return Monster_2;
	}
	
}
