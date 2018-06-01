package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <b> BoneH is the class defining horizontal bones objects. </b>
 *  
 * @author ptorc
 *
 * @version 1.0
 */
public class BoneH extends Walls{

	/**
	 * Picture of the horizontal bone.
	 */
	Image BoneH;
	
	/**
	 * Load the image of the horizontal bone to the coordinates passed in parameters from the sprite in the program files
	 * @param OriginX X coordinate of the bone
	 * @param OriginY Y coordinate of the bone
	 */
	public BoneH(int OriginX, int OriginY) {
		
		this.x = OriginX;
		this.y = OriginY;
		
		ImageIcon BoneHImg = new ImageIcon("../sprite/horizontal_bone.png");
		BoneH = BoneHImg.getImage();
	}
	
	/**
	 * Return the image of the horizontal bone
	 * @return the image of the horizontal bone
	 */
	public Image getImage() {
		
		return BoneH;
		
	}
	
}
