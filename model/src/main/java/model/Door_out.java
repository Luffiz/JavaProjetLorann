package model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

/**
 * <b> Door_out is the class defining door's display according to his state. </b>
 *  
 * @author ptorc
 *
 * @version 1.0
 */
public class Door_out {
	/**
	 * X and Y coordinates of the door.
	 */
	int x,y;
	
	/**
	 * Image of the door
	 */
	Image Door;
	
	/**
	 * State of the door
	 */
	String State = "CLOSED";
	
	/**
	 * Image of the closed door.
	 */
	ImageIcon DoorClosed = new ImageIcon("../sprite/gate_closed.png");
	
	/**
	 * Image of the open door.
	 */
	ImageIcon DoorOpen = new ImageIcon("../sprite/gate_open.png");
	
	public Door_out (int OriginX, int OriginY) {
		x = OriginX;
		y = OriginY;
	}
	
	/**
	 * Return the X coordinate of the door.
	 * 
	 * @return the X coordinate of the door.
	 */
	public int getX() {
		return x;
	}

	
	/**
	 * Return the Y coordinate of the door.
	 * 
	 * @return the Y coordinate of the door.
	 */
	public int getY() {
		return y;
	}

	/**
	 * Return the HitBox of the door.
	 * @return the HitBox of the door.
	 */
	public Rectangle getBounds() {
		Rectangle HitBox = new Rectangle(x,y,32,32);
		return HitBox;
	}

	/**
	 * Return the state of the door
	 * 
	 * @return the state of the door
	 */
	public String getState() {
		return State;
	}

	/**
	 * Set the state of the door
	 * @param newstate new state of the door
	 */
	public void setState(String newstate) {
		this.State = newstate;
	}
	
	/**
	 * Return the image of the door according to its state.
	 * @return the image of the door according to its state.
	 */
	public Image getImage(){
		if(State == "CLOSED"){
			Door = DoorClosed.getImage();
		}
		else if (State == "OPEN"){
			Door = DoorOpen.getImage();
		}
		return Door;

	}
	

}
