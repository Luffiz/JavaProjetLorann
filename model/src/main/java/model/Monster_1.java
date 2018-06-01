package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <b> Monster_1 is the class defining the 1st monster. </b>
 *  
 * @author ptorc
 *
 * @version 1.0
 */
public class Monster_1 extends Mobile_Elements{
	
	/**
	 * Picture of the 1st monster
	 */
	Image Monster_1;
	
	/**
	 * Load the image of the 1st monster to the coordinates passed in parameters from the sprite in the program files
	 * 
	 * @param OriginX X coordinate of the 1st monster
	 * @param OriginY Y coordinate of the 1st monster
	 */
	public Monster_1(int OriginX, int OriginY){
		x = OriginX;
		y = OriginY;
		
		ImageIcon Monster1 = new ImageIcon("../sprite/monster_1.png");
		Monster_1 = Monster1.getImage();
	}

	/**
	 * Return the image of the 1st monster
	 * 
	 * @return the image of the 1st monster
	 */
	public Image getImage(){
		return Monster_1;
	}


}
