package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Monster_3 extends Mobile_Elements{
	
	Image Monster_3;
	
	public Monster_3(int OriginX, int OriginY){
		x = OriginX;
		y = OriginY;
		
		ImageIcon Monster3 = new ImageIcon("../sprite/monster_3.png");
		Monster_3 = Monster3.getImage();
	}
	
	public Image getImage(){
		return Monster_3;
	}
}
