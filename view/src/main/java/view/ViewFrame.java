package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.Observer;

import javax.swing.JFrame;

import model.Game_BOOT;
import view.ViewPanel;
import showboard.IBoard;
import showboard.IPawn;
import showboard.ISquare;


public class ViewFrame extends JFrame implements IBoard {
	 /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6563585351564617603L;

    /**
     * Showing the game window and launching the game.
     * 
     * @param map Map recovered in the database
     * @param level Level of the game
     */
    public ViewFrame(String map, int level) {
    	this.setTitle("Lorann");
		this.setSize(800, 550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.add(new Game_BOOT(map, level));
		this.setVisible(true);
		this.setResizable(false);
		
    }
        

	
	

	@Override
	public void addSquare(ISquare square, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPawn(IPawn pawn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Observer getObserver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDimension(Dimension dimension) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDisplayFrame(Rectangle displayFrame) {
		// TODO Auto-generated method stub
		
	}
}


