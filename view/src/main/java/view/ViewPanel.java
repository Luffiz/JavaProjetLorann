package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import model.BoneH;
import model.BoneS;
import model.BoneV;
import model.CrystalBall;
import model.Door_out;
import model.Fire_Ball;
import model.Lorann_Mobile;
import model.Monster_1;
import model.Monster_2;
import model.Monster_3;
import model.Monster_4;
import model.Purse;

/**
 * <b> Manages the objects in the ViewFrame. </b>
 * 
 * @author ptorc
 *
 */
public class ViewPanel extends JPanel implements Observer {
	
	private static final long serialVersionUID = 1L;
	int level = 1;
	int gold = 0;
	int lifes = 11;
	private static ArrayList<BoneS> BonesS;
	private static ArrayList<BoneV> BonesV;
	private static ArrayList<BoneH> BonesH;
	private static ArrayList<CrystalBall> CrystalBalls;
	private static ArrayList<Purse> Purses;
	private static ArrayList<Monster_1> Monsters1;
	private static ArrayList<Monster_2> Monsters2;
	private static ArrayList<Monster_3> Monsters3;
	private static ArrayList<Monster_4> Monsters4;
	private static ArrayList<Door_out> Door_out1;
	private static ArrayList<Fire_Ball> FireBalls;

	BoneS boneS;
	BoneV boneV;
	BoneH boneH;
	Lorann_Mobile lorann;
	CrystalBall crystalball;
	Purse purses;
	Monster_1 monster1;
	Monster_2 monster2;
	Monster_3 monster3;
	Monster_4 monster4;
	Door_out outdoor;
	Fire_Ball fireball;
	Font Font_level = new Font("Arial", Font.BOLD, 30);
	FileReader fr;
	
    /**
     * The dimension is used to known the width and the height of the board. It's used principally
     * with the squares property
     */
    private Dimension           dimension;

    /** The center of the board. */
    private Rectangle           displayFrame;

    /** The no image is used to factorize the NoImage loading. */
    private final BufferedImage noImage;

    /** The width looped. */
    private Boolean             widthLooped      = false;

    /** The height looped. */
    private Boolean             heightLooped     = false;

    /**
     * Instantiates a new board panel.
     */
    ViewPanel() {
        super();
        this.setBackground(Color.BLACK);
        this.noImage = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        final Graphics2D graphics = this.noImage.createGraphics();
        graphics.setColor(Color.darkGray);
        graphics.fillRect(0, 0, 2, 2);
        setFocusable(true);
		
        //paint(Graphics g);
    }
	

    public void paint (Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;

		for(int i = 0; i< BonesS.size(); i++){
			boneS = (BoneS) BonesS.get(i);
			g2d.drawImage(boneS.getImage(), boneS.getX(), boneS.getY(), null);
		}
		for(int i = 0; i< BonesH.size(); i++){
			boneH = (BoneH) BonesH.get(i);
			g2d.drawImage(boneH.getImage(), boneH.getX(), boneH.getY(), null);
		}
		for(int i = 0; i< BonesV.size(); i++){
			boneV = (BoneV) BonesV.get(i);
			g2d.drawImage(boneV.getImage(), boneV.getX(), boneV.getY(), null);
		}
		for(int i = 0; i< CrystalBalls.size(); i++){
			crystalball = (CrystalBall) CrystalBalls.get(i);
			g2d.drawImage(crystalball.getImage(), crystalball.getX(), crystalball.getY(), null);
		}
		for(int i = 0; i< Purses.size(); i++){
			purses = (Purse) Purses.get(i);
			g2d.drawImage(purses.getImage(), purses.getX(),purses.getY(), null);
		}
		for(int i = 0; i< Monsters1.size(); i++){
			monster1 = (Monster_1) Monsters1.get(i);
			g2d.drawImage(monster1.getImage(), monster1.getX(),monster1.getY(), null);
		}
		for(int i = 0; i< Monsters2.size(); i++){
			monster2 = (Monster_2) Monsters2.get(i);
			g2d.drawImage(monster2.getImage(), monster2.getX(),monster2.getY(), null);
		}
		for(int i = 0; i< Monsters3.size(); i++){
			monster3 = (Monster_3) Monsters3.get(i);
			g2d.drawImage(monster3.getImage(), monster3.getX(),monster3.getY(), null);
		}
		for(int i = 0; i< Monsters4.size(); i++){
			monster4 = (Monster_4) Monsters4.get(i);
			g2d.drawImage(monster4.getImage(), monster4.getX(),monster4.getY(), null);
		}
		for(int i = 0; i< FireBalls.size(); i++){
			fireball = (Fire_Ball) FireBalls.get(i);
			g2d.drawImage(fireball.getImage(), fireball.getX(),fireball.getY(), null);
		}

		try{
			g2d.drawImage(lorann.getImage(), lorann.getX(), lorann.getY(), null);
			g2d.drawImage(outdoor.getImage(), outdoor.getX(), outdoor.getY(), null);
		}
		catch(Exception ex){}
		g.setColor(Color.RED);
		g.setFont(Font_level);
		g.drawString("LEVEL : " + level + " / Gold : " + gold + " / Lifes : " + lifes,240, 400);

		repaint();
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
