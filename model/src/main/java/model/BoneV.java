package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class BoneV extends Walls{

	Image BoneV;
	
	public BoneV(int OriginX, int OriginY) {
		
		this.x = OriginX;
		this.y = OriginY;
		
		ImageIcon BoneVImg = new ImageIcon("C:\\Users\\ptorc\\git\\JavaProjetLorann\\sprite\\vertical_bone.png");
		BoneV = BoneVImg.getImage();
	}
	
	
	public Image getImage() {
		
		return BoneV;
		
	}
	
}

