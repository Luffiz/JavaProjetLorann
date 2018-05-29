package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileReader;
import java.util.ArrayList;

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


public class Game_BOOT implements KeyListener{
	
	
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

	
	public Game_BOOT (){
		//this.setBackground(Color.BLACK);
		Menu_Level();
		//setFocusable(true);
		//addKeyListener(this);
	}

	public void Menu_Level() {
		try{
			fr = new FileReader("JavaProjetLorann\\MapsMaps\\level"+level+".level");
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
		catch(Exception ex) {}
	}
	

	
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
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
