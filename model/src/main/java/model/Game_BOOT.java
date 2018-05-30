package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JPanel;


import model.BoneS;
import model.BoneH;
import model.BoneV;
import model.CrystalBall;
import model.Fire_Ball;
import model.Lorann_Mobile;
import model.Monster_1;
import model.Monster_2;
import model.Monster_3;
import model.Monster_4;
import model.Door_out;
import model.Purse;
//import view.ViewPanel;


public class Game_BOOT extends JPanel implements KeyListener {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String Game[][] = new String [24][24];
	int level = 1;
	int gold = 0;
	int lifes = 10;
	
	boolean shoot = false;
	boolean touch = false;
	boolean prison_d1 = false;
	boolean prisond2 = false;
	boolean prisond3 = false;
	boolean prisond4 = false;

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
	//ViewPanel view;
	

	public Game_BOOT (){
		this.setBackground(Color.BLACK);
		Menu_Level();
		
}

	public void Menu_Level() {
		try{
			fr = new FileReader("C:\\Users\\pierr\\git\\JavaProjetLorann\\Maps\\level1.level");
			int x=0, y=0, i=0;
			touch = false;
			shoot = false;
			prison_d1 = false;
			prisond2 = false;
			prisond3 = false;
			prisond4 = false;


			BonesS = new ArrayList<BoneS>();
			BonesH = new ArrayList<BoneH>();
			BonesV = new ArrayList<BoneV>();
			CrystalBalls = new ArrayList<CrystalBall>();
			Purses = new ArrayList<Purse>();
			Monsters1 = new ArrayList<Monster_1>();
			Monsters2 = new ArrayList<Monster_2>();
			Monsters3 = new ArrayList<Monster_3>();
			Monsters4 = new ArrayList<Monster_4>();
			Door_out1 = new ArrayList<Door_out>();
			FireBalls = new ArrayList<Fire_Ball>();


			while(( i = fr.read()) != -1) {
				
				char strImg = (char) i;

				switch(strImg) {
				case '0':
					Game [x][y] = "WALLS";
					boneS = new BoneS(x*32, y*32);
					BonesS.add(boneS);
				break;
				
				case '1':
					Game [x][y] = "WALLS";
					boneH = new BoneH(x*32, y*32);
					BonesH.add(boneH);
				break;
				
				case '2':
					Game [x][y] = "WALLS";
					boneV = new BoneV(x*32, y*32);
					BonesV.add(boneV);
				break;
				
				case '3':
					Game [x][y] = "LORANN";
					lorann = new Lorann_Mobile(x*32, y*32);
				break;
				
				case '4':
					Game [x][y] = "CRYSTALLBALL";
					crystalball = new CrystalBall (x*32, y*32);
					CrystalBalls.add(crystalball);
				break;
				
				case '5':
					Game [x][y] = "PURSE";
					purses = new Purse(x*32, y*32);
					Purses.add(purses);
				break;
				
				case '6':
					Game [x][y] = "MONSTER1";
					monster1 = new Monster_1(x*32, y*32);
					Monsters1.add(monster1);
				break;
				
				case '7':
					Game [x][y] = "MONSTER2";
					monster2 = new Monster_2(x*32, y*32);
					Monsters2.add(monster2);
				break;
				
				case '8':
					Game [x][y] = "MONSTER3";
					monster3 = new Monster_3(x*32, y*32);
					Monsters3.add(monster3);
				break;
				
				case '9':
					Game [x][y] = "MONSTER4";
					monster4 = new Monster_4(x*32, y*32);
					Monsters4.add(monster4);
				break;
				
				case 'S':
					Game [x][y] = "DOOROUT";
					outdoor = new Door_out(x*32, y*32);
					Door_out1.add(outdoor);
				break;
				
				case '_':
					Game [x][y] = null;
				break;
				
				case '\r':
					x--;
				break;
				
				case '\n':
					x--;
				break;
				}
				if (x==23) {
					y++;
					x=0;
				}
				else {
					x++;
				}
			}
		}
		catch(Exception ex) {
			repaint();
		}
	}
	public void paint (Graphics g){
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
	public void keyTyped(KeyEvent e) {
		int Key = e.getKeyCode();
		int x = 0;
		int y = 0;
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
