package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class BoneS extends Walls{

	Image BoneS;
	
	public BoneS(int OriginX, int OriginY) {
		
		this.x = OriginX;
		this.y = OriginY;
		
		ImageIcon BoneSImg = new ImageIcon("C:\\Users\\pierr\\OneDrive - Association Cesi Viacesi mail\\Projet\\Projet Java\\sprite\\bone");
		BoneS = BoneSImg.getImage();
	}
	
	
	public Image getImage() {
		
		return BoneS;
		
	}
	
}