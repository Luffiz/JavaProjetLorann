package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <b> BoneV is the class defining vertical bones objects. </b>
 *  
 * @author ptorc
 *
 * @version 1.0
 */
public class BoneV extends Walls{

	/**
	 * Picture of the vertical bone.
	 */
	Image BoneV;
	
	/**
	 * Load the image of the vertical bone to the coordinates passed in parameters from the sprite in the program files
	 * @param OriginX X coordinate of the bone
	 * @param OriginY Y coordinate of the bone
	 */
	public BoneV(int OriginX, int OriginY) {
		
		this.x = OriginX;
		this.y = OriginY;
		
		ImageIcon BoneVImg = new ImageIcon("../sprite/vertical_bone.png");
		BoneV = BoneVImg.getImage();
	}
	
	/**
	 * Return the image of the vertical bone
	 * @return the image of the vertical bone
	 */
	public Image getImage() {
		
		return BoneV;
		
	}
	
}

