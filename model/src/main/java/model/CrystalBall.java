package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <b> CrystalBall is the class defining CrystallBall image. </b>
 *  
 * @author ptorc
 *
 * @version 1.0
 */
public class CrystalBall extends Uncrossable {
	
	/***
	 * Picture of the crystalball
	 */
	Image CrystalBall;
	
	/**
	 * Load the image of the crystalball to the coordinates passed in parameters from the sprite in the program files
	 * 
	 * @param OriginX X coordinate of the crystalball
	 * @param OriginY Y coordinate of the crystalball
	 */
	public CrystalBall(int OriginX, int OriginY) {
		
		this.x = OriginX;
		this.y = OriginY;
		
		ImageIcon CrystalBallImg = new ImageIcon("../sprite/crystal_ball.png");
		CrystalBall = CrystalBallImg.getImage();
	}
	
	/**
	 * Return the image of the crystalball
	 * 
	 * @return the image of the crystalball
	 */
	public Image getImage() {
		
		return CrystalBall;
		
	}
	

}
