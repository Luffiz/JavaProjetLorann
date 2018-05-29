package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileReader;
import java.util.ArrayList;

import lorann.model.Bone1;
import lorann.model.Bone2;
import lorann.model.Bone3;
import lorann.model.CrystalBall;
import lorann.model.FireBall;
import lorann.model.Lorann;
import lorann.model.Monster1;
import lorann.model.Monster2;
import lorann.model.Monster3;
import lorann.model.Monster4;
import lorann.model.OutDoor;
import lorann.model.Purses;


public class Game_BOOT implements KeyListener{
	
	
	String Game[][] = new String [24][24];
	int level = 1;
	int gold = 0;
	int lifes = 10;
	
	boolean shoot = false;
	boolean touch = false;
	boolean prisond1 = false;
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
			prisond1 = false;
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


			while(( i = fr.read()) != -1){
				char strImg = (char) i;

				switch(strImg) {
				case 1:
					
				}
				
				
				
				if(strImg == '0'){
					Game [x][y] = "WALLS";
					bone1 = new Bone1(x*32, y*32);
					Bones1.add(bone1);
				}
				else if(strImg == '1'){
					Game [x][y] = "WALLS";
					bone2 = new Bone2(x*32, y*32);
					Bones2.add(bone2);
				}
				else if(strImg == '2'){
					Game [x][y] = "WALLS";
					bone3 = new Bone3(x*32, y*32);
					Bones3.add(bone3);
				}
				else if (strImg == '3'){
					Game [x][y] = "LORANN";
					lorann = new Lorann (x*32, y*32);
				}
				else if (strImg == '4'){
					Game [x][y] = "CRYSTALBALL";
					crystalball = new CrystalBall (x*32, y*32);
					CrystalBalls.add(crystalball);
				}
				else if (strImg == '5'){
					Game [x][y] = "PURSES";
					purses = new Purses (x*32, y*32);
					Pursess.add(purses);
				}
				else if(strImg == '6'){
					Game[x][y] = "MONSTER1";
					monster1 = new Monster1 (x*32,y*32);
					Monsters1.add(monster1);
				}
				else if(strImg == '7'){
					Game[x][y] = "MONSTER2";
					monster2 = new Monster2 (x*32,y*32);
					Monsters2.add(monster2);
				}
				else if(strImg == '8'){
					Game[x][y] = "MONSTER3";
					monster3 = new Monster3 (x*32,y*32);
					Monsters3.add(monster3);
				}
				else if(strImg == '9'){
					Game[x][y] = "MONSTER4";
					monster4 = new Monster4 (x*32,y*32);
					Monsters4.add(monster4);
				}
				else if(strImg == 'S'){
					Game[x][y] = "OUTDOOR";
					outdoor = new OutDoor (x*32,y*32);
					OutDoors.add(outdoor);
				}

				else if (strImg == ' '){
					Game[x][y] = null;
				}
				else if (strImg == '\r' || strImg == '\n'){
					x--;
				}
				if (x==23){
					y++;
					x=0;
				}
				else {
					x++;
				}

			}
		}
		catch(Exception ex){
			repaint();
		}
	}
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
