package model;

import java.awt.Rectangle;
/**
 * <b>Mobile Elements is the class inherited by the moving objects of the game such as Lorann and the fireball.</b>
 * 
 * @author ptorc
 *
 *@version 1.0
 */
public class Mobile_Elements {
	
	/**
	 * X and Y coordinates of the moving element. 
	 */
	public int x, y;
	
	/**
	 * String containing the current direction of the element.
	 */
	public String Way = "DOWN";
	
	/**
	 * Getter returning the X coordinate
	 * @return the X coordinate
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Setter defining the X coordinate
	 * @param x X coordinate of the element
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * 
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getWay() {
		return Way;
	}
	
	/**
	 * 
	 * @param way
	 */
	public void setWay(String way) {
		this.Way = way;
	}
	
	/**
	 * 
	 * @return
	 */
	public Rectangle getBounds() { //pour les collisions
		Rectangle HitBox = new Rectangle(x,y,32,32);
		return HitBox;
	}
	
	/**
	 * 
	 */
	public void move() {
		
		switch (this.getWay()) 
		{
			case "UP":
				this.setY(getY() - 32 );
				break;
			case "RIGHT":
				this.setX(getX() + 32);
				break;
			case "DOWN":
				this.setY(getY() + 32 );
				break;
			case "LEFT":
				this.setX(getX() - 32 );
				break;
			case "UPRIGHT":
				this.setY(getY() - 32 );
				this.setX(getX() + 32);				
			break;
			case "UPLEFT":
				this.setY(getY() - 32 );
				this.setX(getX() - 32 );				
			break;
			case "DOWNRIGHT":
				this.setX(getX() + 32);
				this.setY(getY() + 32 );
			break;
			case "DOWNLEFT":
				this.setY(getY() + 32 );
				this.setX(getX() - 32 );				
			break;
			default:
				break;
		}
	}

}

