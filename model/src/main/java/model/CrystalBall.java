package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class CrystalBall extends Uncrossable {
	
Image CrystalBall;
	
	public CrystalBall(int OriginX, int OriginY) {
		
		this.x = OriginX;
		this.y = OriginY;
		
		ImageIcon CrystalBallImg = new ImageIcon("C:\\Users\\ptorc\\git\\JavaProjetLorann\\sprite\\crystal_ball.png");
		CrystalBall = CrystalBallImg.getImage();
	}
	
	
	public Image getImage() {
		
		return CrystalBall;
		
	}
	

}
