package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <b> BoneS is the class defining corner bones objects. </b>
 *  
 * @author ptorc
 *
 * @version 1.0
 */
public class BoneS extends Walls{

	/**
	 * Picture of the corner bone.
	 */
	Image BoneS;
	
	/**
	 * Load the image of the corner bone to the coordinates passed in parameters from the sprite in the program files
	 * @param OriginX X coordinate of the bone
	 * @param OriginY Y coordinate of the bone
	 */
	public BoneS(int OriginX, int OriginY) {
		
		this.x = OriginX;
		this.y = OriginY;
		
		ImageIcon BoneSImg = new ImageIcon("../sprite/bone.png");
		BoneS = BoneSImg.getImage();
	}
	
	/**
	 * Return the image of the corner bone
	 * @return the image of the corner bone
	 */
	public Image getImage() {
		
		return BoneS;
		
	}
	
}
