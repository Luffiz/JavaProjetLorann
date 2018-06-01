package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class BoneH extends Walls{

	Image BoneH;
	
	public BoneH(int OriginX, int OriginY) {
		
		this.x = OriginX;
		this.y = OriginY;
		
		ImageIcon BoneHImg = new ImageIcon("../sprite/horizontal_bone.png");
		BoneH = BoneHImg.getImage();
	}
	
	
	public Image getImage() {
		
		return BoneH;
		
	}
	
}
