package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <b> Fire_Ball is the class defining fireball's color according to his movement. </b>
 *  
 * @author ptorc
 *
 * @version 1.0
 */
public class Fire_Ball extends Mobile_Elements{
	
	/**
	 * Image of fireball according the color to his displacement
	 */
	Image Fireball;
	int FireBall_Type = 0;
	
	ImageIcon FireBall1 = new ImageIcon("../sprite/fireball_1.png");
	ImageIcon FireBall2 = new ImageIcon("../sprite/fireball_2.png");
	ImageIcon FireBall3 = new ImageIcon("../sprite/fireball_3.png");
	ImageIcon FireBall4 = new ImageIcon("../sprite/fireball_4.png");
	ImageIcon FireBall5 = new ImageIcon("../sprite/fireball_5.png");

	/**
	 * Load the image of the fireball to the coordinates passed in parameters from the sprite in the program files
	 * 
	 * @param OriginX X coordinate of the fireball
	 * @param OriginY Y coordinate of the fireball
	 */
	public Fire_Ball(int OriginX, int OriginY){
		x = OriginX;
		y = OriginY;

		ImageIcon Fire_ball = new ImageIcon("../sprite/fireball_1.png");
		Fireball = Fire_ball.getImage();
	}
	
	/**
	 * Method to display the correct sprite according to the color of the fireball.
	 * 
	 * @return the image corresponding to the color of the fireball
	 */
	public Image getImage(){
		switch (FireBall_Type) {
		
		case 1:
			Fireball = FireBall1.getImage();
		break;
		
		case 2:
			Fireball = FireBall2.getImage();
		break;
		
		case 3:
			Fireball = FireBall3.getImage();
		break;
		
		case 4:
			Fireball = FireBall4.getImage();
		break;
		
		case 5:
			Fireball = FireBall5.getImage();
		break;
		}
	 return Fireball;
	}
	
	

}
