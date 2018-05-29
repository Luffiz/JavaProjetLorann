package model;

import java.awt.Rectangle;

public class Uncrossable {

	int x,y;
	
	public Rectangle getBounds(){
		Rectangle HitBox = new Rectangle (x,y,32,32);
		return HitBox;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}
