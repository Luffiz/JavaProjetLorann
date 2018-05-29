package model;

import java.awt.Rectangle;

public class Mobile_Elements {
	
	public int x, y;
	public String Way;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getWay() {
		return Way;
	}
	public void setWay(String way) {
		this.Way = way;
	}
	
	public Rectangle getBounds(){ //pour les collision
		Rectangle HitBox = new Rectangle(x,y,32,32);
		return HitBox;
	}
	
	public void move() {
		switch (this.getWay()) {
			case "UP":
				this.moveUp();
				break;
			case "RIGHT":
				this.moveRight();
				break;
			case "DOWN":
				this.moveDown();
				break;
			case "LEFT":
				this.moveLeft();
				break;
			case "UPLEFT":
				this.moveUpLeft();
				break;
			case "DOWNLEFT":
				this.moveDownLeft();
				break;
			case "UPRIGHT":
				this.moveUpRight();
				break;
			case "DOWNRIGHT":
				this.moveDownRight();
				break;
			default:
				break;
		}
	}
	
	
	void moveUp() {
		this.setY(getY() - 32 );
	}

	void moveRight() {
		this.setX(getX() + 32);
	}

	void moveDown() {
		this.setY(getY() + 32 );
	}

	void moveLeft() {
		this.setX(getX() - 32 );
	}
	
	void moveUpRight() {
		this.setY(getY() - 32 );
		this.setX(getX() + 32);
	}

	void moveDownRight() {
		this.setX(getX() + 32);
		this.setY(getY() + 32 );
	}

	void moveDownLeft() {
		this.setY(getY() + 32 );
		this.setX(getX() - 32 );
	}

	void moveUpLeft() {
		this.setY(getY() - 32 );
		this.setX(getX() - 32 );
	}
}

