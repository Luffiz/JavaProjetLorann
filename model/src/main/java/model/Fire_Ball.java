package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Fire_Ball extends Mobile_Elements{
	
	Image Fireball;
	int FireBall_Type = 0;
	
	ImageIcon FireBall1 = new ImageIcon("C:\\Users\\pierr\\git\\JavaProjetLorann\\sprite\\fireball_1.png");
	ImageIcon FireBall2 = new ImageIcon("C:\\Users\\pierr\\git\\JavaProjetLorann\\sprite\\fireball_2.png");
	ImageIcon FireBall3 = new ImageIcon("C:\\Users\\pierr\\git\\JavaProjetLorann\\sprite\\fireball_3.png");
	ImageIcon FireBall4 = new ImageIcon("C:\\Users\\pierr\\git\\JavaProjetLorann\\sprite\\fireball_4.png");
	ImageIcon FireBall5 = new ImageIcon("C:\\Users\\pierr\\git\\JavaProjetLorann\\sprite\\fireball_5.png");

	public Fire_Ball(int OriginX, int OriginY){
		x = OriginX;
		y = OriginY;

		ImageIcon Fire_ball = new ImageIcon("C:\\Users\\pierr\\git\\JavaProjetLorann\\sprite\\fireball_1.png");
		Fireball = Fire_ball.getImage();
	}
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
