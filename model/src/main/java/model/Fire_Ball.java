package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Fire_Ball extends Mobile_Elements{
	
	Image Fireball;
	int StateFireBall = 0;
	
	ImageIcon FireBall1 = new ImageIcon("JavaProjetLorann\\sprite\\fireball_1.png");
	ImageIcon FireBall2 = new ImageIcon("JavaProjetLorann\\sprite\\fireball_2.png");
	ImageIcon FireBall3 = new ImageIcon("JavaProjetLorann\\sprite\\fireball_3.png");
	ImageIcon FireBall4 = new ImageIcon("JavaProjetLorann\\sprite\\fireball_4.png");
	ImageIcon FireBall5 = new ImageIcon("JavaProjetLorann\\sprite\\fireball_5.png");

	public Fire_Ball(int OriginX, int OriginY){
		x = OriginX;
		y = OriginY;

		ImageIcon Fire_ball = new ImageIcon("JavaProjetLorann\\sprite\\fireball_1.png");
		Fireball = Fire_ball.getImage();
	}
	

}
