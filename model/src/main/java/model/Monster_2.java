package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Monster_2 extends Mobile_Elements{
	
	Image Monster_2;
	
	public Monster_2(int OriginX, int OriginY){
		x = OriginX;
		y = OriginY;
		
		ImageIcon Monster2 = new ImageIcon("C:\\Users\\ptorc\\git\\JavaProjetLorann\\sprite\\monster_2.png");
		Monster_2 = Monster2.getImage();
	}
	
	public Image getImage(){
		return Monster_2;
	}


}
