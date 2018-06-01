package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;
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

import model.*;



public class Game_BOOT extends JPanel implements KeyListener {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String Game[][] = new String [24][24];
	private int level;
	
	

	int gold = 0;
	int lifes = 10;
	
	boolean shoot = false;
	boolean touch = false;
	boolean prison_d1 = false;
	boolean prison_d2 = false;
	boolean prison_d3 = false;
	boolean prison_d4 = false;

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
	
	private static String map;

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
	

	public Game_BOOT (String map){
		
		this.map = map;
		this.setBackground(Color.BLACK);
		this.level = level;
		Menu_Level();
		setFocusable(true);
		addKeyListener(this);
		
}
	
	
	public void Menu_Level() {
		try{
			
			int x=0, y=0, i=0;
			touch = false;
			shoot = false;
			prison_d1 = false;
			prison_d2 = false;
			prison_d3 = false;
			prison_d4 = false;


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

			

			//String str = "011111111011111111111110\r\n23______82___9__4__5___2\r\n0____11052______2__5___2\r\n2________2______2__5___2\r\n2________2__76__2______S\r\n2_______________01111112\r\n2_11111110______5______2\r\n2________2______2______2\r\n2___555__0111_1105011_12\r\n2________5________5____2\r\n011111111011111111111110";
			String str = this.map;
			
			for (int t = 0; t < str.length() ; t++) {
				
				char strImg = str.charAt(t);

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
		g.setColor(Color.WHITE);
		g.setFont(Font_level);
		g.drawString("LEVEL : " + this.level + " / Gold : " + gold + " / Lifes : " + lifes,100, 400);

		repaint();
	}

	

	@Override
	public void keyTyped(KeyEvent e) {
		int Key = e.getKeyChar();
		int x=0;
		int y = 0;


		
		if (Key == KeyEvent.VK_S || Key == KeyEvent.VK_5)
		{
			KeyDown();
			PathFinding();
		}
		else if (Key == KeyEvent.VK_Z || Key == KeyEvent.VK_UP)
		{
			KeyUp();
			PathFinding();
		}
		else if (Key == KeyEvent.VK_D || Key == KeyEvent.VK_RIGHT)
		{			
			KeyRight();
			PathFinding();
		}
		else if (Key == KeyEvent.VK_Q || Key == KeyEvent.VK_LEFT)
		{
			KeyLeft();
			PathFinding();
		}
		else if (Key == KeyEvent.VK_A)
		{
			KeyUpLeft();
			PathFinding();
		}
		else if (Key == KeyEvent.VK_E)
		{
			KeyUpRight();
			PathFinding();
		}
		else if (Key == KeyEvent.VK_W)
		{
			KeyDownLeft();
			PathFinding();
		}
		else if (Key == KeyEvent.VK_C)
		{
			KeyDownRight();
			PathFinding();
		}
		else if (Key == KeyEvent.VK_SPACE)
		{
			ShootFireBall(x, y);
		}
		else if (Key == KeyEvent.VK_R)
		{
			gold = 0;
			Menu_Level();
		}
		if (lifes == 0)
		{			
			GameOverScreen();
		}
		repaint();
	}
	
	public void KeyDown()
	{
		lorann.setWay("DOWN");
		if (! CheckCollision("DOWN")) 
		{
				if (!MonsterEat(monster1) && !MonsterEat(monster2) && ! MonsterEat(monster3) && ! MonsterEat(monster4))
				{
					lorann.move();
					Objectif();
				}
		}
	}
					

	public void KeyUp()
	{
		lorann.setWay("UP");
		if (! CheckCollision("UP"))
		{
			if (!MonsterEat(monster1) && !MonsterEat(monster2) && ! MonsterEat(monster3) && ! MonsterEat(monster4))
			{
				lorann.move();
				Objectif();
			}
		}
	}

	public void KeyRight()
	{
		lorann.setWay("RIGHT");
		if (! CheckCollision("RIGHT"))
		{
			if (!MonsterEat(monster1) && !MonsterEat(monster2) && ! MonsterEat(monster3) && ! MonsterEat(monster4))
			{
				lorann.move();
				Objectif();
			}
		}
	}

	public void KeyLeft()
	{
		lorann.setWay("LEFT");
		if (! CheckCollision("LEFT"))
		{
			if (!MonsterEat(monster1) && !MonsterEat(monster2) && ! MonsterEat(monster3) && ! MonsterEat(monster4))
			{
				lorann.move();
				Objectif();
			}
		}
	}

	public void KeyUpLeft()
	{
		lorann.setWay("UPLEFT");
		if (! CheckCollision("UPLEFT"))
		{
			if (!MonsterEat(monster1) && !MonsterEat(monster2) && ! MonsterEat(monster3) && ! MonsterEat(monster4))
			{
				lorann.move();
				Objectif();
			}
		}
	}

	public void KeyUpRight()
	{
		lorann.setWay("UPRIGHT");
		if (! CheckCollision("UPRIGHT"))
		{
			if (!MonsterEat(monster1) && !MonsterEat(monster2) && ! MonsterEat(monster3) && ! MonsterEat(monster4))
			{
				lorann.move();
				Objectif();
			}
		}
	}

	public void KeyDownLeft()
	{
		lorann.setWay("DOWNLEFT");
		if (! CheckCollision("DOWNLEFT"))
		{
			if (!MonsterEat(monster1) && !MonsterEat(monster2) && ! MonsterEat(monster3) && ! MonsterEat(monster4))
			{
				lorann.move();
				Objectif();
			}
		}
	}

	public void KeyDownRight()
	{
		lorann.setWay("DOWNRIGHT");
		if (! CheckCollision("DOWNRIGHT"))
		{
			if (!MonsterEat(monster1) && !MonsterEat(monster2) && ! MonsterEat(monster3) && ! MonsterEat(monster4))
			{
				lorann.move();
				Objectif();
			}
		}
	}
	
	public void ShootFireBall(int x, int y) 
	{
		if (shoot == false)
			{
					shoot = true;
					fireball = new Fire_Ball(x*32, y*32);
					FireBalls.add(fireball);
					Shoot();
			}
				else if (shoot == true)
				{
					FireBallRemove();
					touch = true;
				}
	}
	
	public void PathFinding() 
	{
		FollowShoot();
				if (! prison_d1)
					go_to_Lorann(monster1);
				if (! prison_d2)
					go_to_Lorann(monster2);
				if (! prison_d3)
					go_to_Lorann(monster3);
				if (! prison_d4)
					go_to_Lorann(monster4);
	}
	
	public void GameOverScreen(){
		if (JOptionPane.showConfirmDialog(this,"GAME OVER.\nTRY AG?","",JOptionPane.YES_NO_OPTION)  == JOptionPane.YES_OPTION) {
					gold = 0;
					lifes = 10;
					Menu_Level();
				}
		else {
			System.exit(0);
		}
	}
	
	public void Shoot() {
		Rectangle recFire;
		Rectangle recBoneS;
		Rectangle recBoneV;
		Rectangle recBoneH;
		
		recFire = fireball.getBounds();
		recBoneH = boneH.getBounds();
		recBoneS = boneS.getBounds();
		recBoneV = boneV.getBounds();
		
		if (shoot == true) {
			if (!recFire.intersects(recBoneH) || !recFire.intersects(recBoneV) || !recFire.intersects(recBoneS)) {
				switch(lorann.getWay()) 
				{
				case "DOWN":
					fireball.setY(lorann.getY() - 32 );
					fireball.setX(lorann.getX());
					fireball.setWay("UP");
					break;
				case "UP":
					fireball.setY(lorann.getY() + 32 );
					fireball.setX(lorann.getX());
					fireball.setWay("DOWN");
					break;
				case "LEFT":
					fireball.setY(lorann.getY());
					fireball.setX(lorann.getX() + 32);
					fireball.setWay("RIGHT");
					break;
				case "RIGHT":
					fireball.setY(lorann.getY());
					fireball.setX(lorann.getX() - 32);
					fireball.setWay("LEFT");
					break;
				case "DOWNRIGHT":
					fireball.setY(lorann.getY() - 32);
					fireball.setX(lorann.getX() - 32);
					fireball.setWay("UPLEFT");
					break;
				case "DOWNLEFT":
					fireball.setY(lorann.getY() - 32 );
					fireball.setX(lorann.getX() + 32);
					fireball.setWay("UPRIGHT");
					break;
				case "UPRIGHT":
					fireball.setY(lorann.getY() + 32 );
					fireball.setX(lorann.getX() - 32);
					fireball.setWay("UPLEFT");
					break;
				case "UPLEFT":
					fireball.setY(lorann.getY() + 32 );
					fireball.setX(lorann.getX() + 32);
					fireball.setWay("UPRIGHT");
					break;
				}
			}
		}
	}
	
public void FollowShoot(){

		if (shoot == true){
			if (fireball.FireBall_Type > 4)
				fireball.FireBall_Type = 0;
			
			switch (fireball.getWay()) {
			
			case "RIGHT":
					if (CheckFireBall("RIGHT") == false && touch == false)
					{
						fireball.FireBall_Type++;
						fireball.move();
					}
					else 
					{
						CheckFireBall(fireball.getWay());
						fireball.FireBall_Type++;
						go_to_Lorann(fireball);
						FireBallRemove();
					}
			break;
			
			case "LEFT":
					if (CheckFireBall("LEFT") == false && touch == false)
					{
						fireball.FireBall_Type++;
						fireball.move();
					}
					else 
					{
						CheckFireBall(fireball.getWay());
						fireball.FireBall_Type++;
						go_to_Lorann(fireball);
						FireBallRemove();
					}
			break;
			
			case "UP":
				if (CheckFireBall("UP") == false && touch == false)
				{
					fireball.FireBall_Type++;
					fireball.move();
				}
				else 
				{
					CheckFireBall(fireball.getWay());
					fireball.FireBall_Type++;
					go_to_Lorann(fireball);
					FireBallRemove();
				}
			break;
			
			case "DOWN":
				if (CheckFireBall("DOWN") == false && touch == false)
				{
					fireball.FireBall_Type++;
					fireball.move();
				}
				else 
				{
					CheckFireBall(fireball.getWay());
					fireball.FireBall_Type++;
					go_to_Lorann(fireball);
					FireBallRemove();
				}
			break;
			
			case "DOWNLEFT":
				if (CheckFireBall("DOWNLEFT") == false && touch == false)
				{
					fireball.FireBall_Type++;
					fireball.move();
				}
				else 
				{
					CheckFireBall(fireball.getWay());
					fireball.FireBall_Type++;
					go_to_Lorann(fireball);
					FireBallRemove();
				}
			break;
			
			case "DOWNRIGHT":
				if (CheckFireBall("DOWNRIGHT") == false && touch == false)
				{
					fireball.FireBall_Type++;
					fireball.move();
				}
				else 
				{
					CheckFireBall(fireball.getWay());
					fireball.FireBall_Type++;
					go_to_Lorann(fireball);
					FireBallRemove();
				}
			break;
			
			case "UPRIGHT":
				if (CheckFireBall("UPRIGHT") == false && touch == false)
				{
					fireball.FireBall_Type++;
					fireball.move();
				}
				else 
				{
					CheckFireBall(fireball.getWay());
					fireball.FireBall_Type++;
					go_to_Lorann(fireball);
					FireBallRemove();
				}
			break;
			
			case "UPLEFT":
				if (CheckFireBall("UPLEFT") == false && touch == false)
				{
					fireball.FireBall_Type++;
					fireball.move();
				}
				else 
				{
					CheckFireBall(fireball.getWay());
					fireball.FireBall_Type++;
					go_to_Lorann(fireball);
					FireBallRemove();
				}
			break;
			}
		}	
	}

public boolean CheckFireBall(String direction){

	if (shoot == true){
		Rectangle sortilegesRec;
		sortilegesRec = fireball.getBounds();
		
		switch (direction) 
		{
			case "RIGHT":
				sortilegesRec.setBounds(sortilegesRec.x +32,sortilegesRec.y, sortilegesRec.width, sortilegesRec.height);
			break;
			case "LEFT":
				sortilegesRec.setBounds(sortilegesRec.x -32, sortilegesRec.y, sortilegesRec.width, sortilegesRec.height);
			break;
			case "UP":
				sortilegesRec.setBounds(sortilegesRec.x, sortilegesRec.y -32, sortilegesRec.width, sortilegesRec.height);
			break;
			case "DOWN":
				sortilegesRec.setBounds(sortilegesRec.x, sortilegesRec.y +32, sortilegesRec.width, sortilegesRec.height);
			break;
			case "DOWNLEFT":
				sortilegesRec.setBounds(sortilegesRec.x -32, sortilegesRec.y +32, sortilegesRec.width, sortilegesRec.height);
			break;
			case "DOWNRIGHT":
				sortilegesRec.setBounds(sortilegesRec.x +32, sortilegesRec.y -32, sortilegesRec.width, sortilegesRec.height);
			break;
			case "UPLEFT":
				sortilegesRec.setBounds(sortilegesRec.x -32, sortilegesRec.y -32, sortilegesRec.width, sortilegesRec.height);
			break;
			case "UPRIGHT":
				sortilegesRec.setBounds(sortilegesRec.x +32, sortilegesRec.y -32, sortilegesRec.width, sortilegesRec.height);
			break;
		}
		
		for(int i=0;i<BonesS.size();i++){
			boneS = (BoneS) BonesS.get(i);
			Rectangle bone1Rec = boneS.getBounds();
			if(sortilegesRec.intersects(bone1Rec)){
				return true;
			}
		}
		for(int i=0;i<BonesH.size();i++){
			boneH = (BoneH) BonesH.get(i);
			Rectangle bone2Rec = boneH.getBounds();
			if(sortilegesRec.intersects(bone2Rec)){
				return true;
			}
		}
		for(int i=0;i<BonesV.size();i++){
			boneV = (BoneV) BonesV.get(i);
			Rectangle bone3Rec = boneV.getBounds();
			if(sortilegesRec.intersects(bone3Rec)){
				return true;
			}
		}

			for(int i=0;i<Monsters1.size();i++){
				monster1 = (Monster_1) Monsters1.get(i);
				Rectangle monster1Rec = monster1.getBounds();
				if(sortilegesRec.intersects(monster1Rec)){
					touch = true;
					prison_d1 = true;
					monster1.setX(33);
					monster1.setY(385);
					Monsters1.remove(0);
					return true;
				}
			}

			for(int i=0;i<Monsters2.size();i++){
				monster2 = (Monster_2) Monsters2.get(i);
				Rectangle monster2Rec = monster2.getBounds();
				if(sortilegesRec.intersects(monster2Rec)){
					touch = true;
					prison_d2 = true;
					monster2.setX(97);
					monster2.setY(385);
					Monsters2.remove(0);
					return true;
				}
			}

			for(int i=0;i<Monsters3.size();i++){
				monster3 = (Monster_3) Monsters3.get(i);
				Rectangle monster3Rec = monster3.getBounds();
				if(sortilegesRec.intersects(monster3Rec)){
					touch = true;
					prison_d3 = true;
					monster3.setX(161);
					monster3.setY(385);
					Monsters3.remove(0);
					return true;
				}
			}
			for(int i=0;i<Monsters4.size();i++){
				monster4 = (Monster_4) Monsters4.get(i);
				Rectangle monster4Rec = monster4.getBounds();
				if(sortilegesRec.intersects(monster4Rec)){
					touch = true;
					prison_d4 = true;
					monster4.setX(225);
					monster4.setY(385);
					Monsters4.remove(0);
					return true;
				}
			}
		
	}
	return false;
}

public boolean CheckCollision(String direction){
	Rectangle lorannRec;
	lorannRec = lorann.getBounds();
	if (direction == "RIGHT"){
		lorannRec.setBounds(lorannRec.x +32,lorannRec.y, lorannRec.width, lorannRec.height);
	}
	else if (direction == "LEFT"){
		lorannRec.setBounds(lorannRec.x -32,lorannRec.y, lorannRec.width, lorannRec.height);
	}
	else if (direction == "UP"){
		lorannRec.setBounds(lorannRec.x,lorannRec.y -32, lorannRec.width, lorannRec.height);
	}
	else if (direction == "DOWN"){
		lorannRec.setBounds(lorannRec.x ,lorannRec.y +32, lorannRec.width, lorannRec.height);
	}
	else if (direction == "DOWNLEFT"){
		lorannRec.setBounds(lorannRec.x - 32 ,lorannRec.y +32, lorannRec.width, lorannRec.height);
	}
	else if (direction == "DOWNRIGHT"){
		lorannRec.setBounds(lorannRec.x + 32,lorannRec.y +32, lorannRec.width, lorannRec.height);
	}
	else if (direction == "UPLEFT"){
		lorannRec.setBounds(lorannRec.x - 32,lorannRec.y - 32, lorannRec.width, lorannRec.height);
	}
	else if (direction == "UPRIGHT"){
		lorannRec.setBounds(lorannRec.x + 32,lorannRec.y - 32, lorannRec.width, lorannRec.height);
	}

	for(int i=0;i<BonesS.size();i++){
		boneS = (BoneS) BonesS.get(i);
		Rectangle bone1Rec = boneS.getBounds();
		if(lorannRec.intersects(bone1Rec)){
			return true;
		}
	}
	for(int i=0;i<BonesH.size();i++){
		boneH = (BoneH) BonesH.get(i);
		Rectangle bone2Rec = boneH.getBounds();
		if(lorannRec.intersects(bone2Rec)){
			return true;
		}
	}
	for(int i=0;i<BonesV.size();i++){
		boneV = (BoneV) BonesV.get(i);
		Rectangle bone3Rec = boneV.getBounds();
		if(lorannRec.intersects(bone3Rec)){
			return true;
		}
	}
	for (int i=0; i<FireBalls.size(); i++){
		fireball = (Fire_Ball) FireBalls.get(i);
		Rectangle sortilegesRec = fireball.getBounds();
		if (lorannRec.intersects(sortilegesRec)){
			touch = false;
			shoot = false;
			fireball.setX(1000);
			fireball.setY(400);
		}
	}
	return false;
}



public boolean MonsterEat(Mobile_Elements mobile){
	Rectangle mobileRec;
	mobileRec = mobile.getBounds();
	if (mobile.getX()<lorann.getX()){
		mobileRec.setBounds(mobileRec.x +32,mobileRec.y, mobileRec.width, mobileRec.height);
	}
	else if (mobile.getX()>lorann.getX()){
		mobileRec.setBounds(mobileRec.x -32,mobileRec.y, mobileRec.width, mobileRec.height);
	}
	else if (mobile.getY()>lorann.getY()){
		mobileRec.setBounds(mobileRec.x,mobileRec.y -32, mobileRec.width, mobileRec.height);
	}
	else if (mobile.getY()<lorann.getY()){
		mobileRec.setBounds(mobileRec.x ,mobileRec.y +32, mobileRec.width, mobileRec.height);
	}

	Rectangle lorannRec;
	lorannRec = lorann.getBounds();
	if(mobileRec.intersects(lorannRec)){
		lifes--;
		gold = 0;
		Menu_Level();
		return true;
	}
	return false;
}
public boolean FireBallRemove(){
	Rectangle sortilegesRec;
	sortilegesRec = fireball.getBounds();
	if (fireball.getX()<lorann.getX()){
		sortilegesRec.setBounds(sortilegesRec.x +32,sortilegesRec.y, sortilegesRec.width, sortilegesRec.height);
	}
	else if (fireball.getX()>lorann.getX()){
		sortilegesRec.setBounds(sortilegesRec.x -32,sortilegesRec.y, sortilegesRec.width, sortilegesRec.height);
	}
	else if (fireball.getY()>lorann.getY()){
		sortilegesRec.setBounds(sortilegesRec.x,sortilegesRec.y -32, sortilegesRec.width, sortilegesRec.height);
	}
	else if (fireball.getY()<lorann.getY()){
		sortilegesRec.setBounds(sortilegesRec.x ,sortilegesRec.y +32, sortilegesRec.width, sortilegesRec.height);
	}

	Rectangle lorannRec;
	lorannRec = lorann.getBounds();
	if(sortilegesRec.intersects(lorannRec)){
		touch = false;
		shoot = false;
		fireball.setX(1000);
		fireball.setY(400);
		FireBalls.remove(0);
		return true;
	}
	return false;
}

public void Objectif(){
	Rectangle lorannRec;
	lorannRec = lorann.getBounds();
	for(int i=0;i<Purses.size();i++){
		purses = (Purse) Purses.get(i);
		Rectangle boursesRec = purses.getBounds();

		if(lorannRec.intersects(boursesRec)){
			Purses.remove(i);
			gold = gold + 100;
			break;
		}
	}

	for (int i=0;i<CrystalBalls.size();i++){
		crystalball = (CrystalBall) CrystalBalls.get(i);
		Rectangle objectifRec = crystalball.getBounds();
		if (lorannRec.intersects(objectifRec)){
			CrystalBalls.remove(i);
			outdoor.setState("OPEN");
		}
	}

	for(int i=0; i<Door_out1.size(); i++){
		outdoor =(Door_out) Door_out1.get(i);
		Rectangle ouvertRec = outdoor.getBounds();

		if(lorannRec.intersects(ouvertRec)){
			if (outdoor.getState() == "CLOSED")
				lifes--;
			Menu_Level();
		}
	}
}
public boolean MonsterCollision(String direction, Mobile_Elements mobile){
	Rectangle mobileRec;
	mobileRec = mobile.getBounds();


	if (direction == "RIGHT"){
		mobileRec.setBounds(mobileRec.x +32,mobileRec.y, mobileRec.width, mobileRec.height);
	}
	else if (direction == "LEFT"){
		mobileRec.setBounds(mobileRec.x -32, mobileRec.y, mobileRec.width, mobileRec.height);
	}
	else if (direction == "UP"){
		mobileRec.setBounds(mobileRec.x,mobileRec.y -32, mobileRec.width, mobileRec.height);
	}
	else if (direction == "DOWN"){
		mobileRec.setBounds(mobileRec.x ,mobileRec.y +32, mobileRec.width, mobileRec.height);
	}
	else if (direction == "DOWNLEFT"){
		mobileRec.setBounds(mobileRec.x - 32 ,mobileRec.y +32, mobileRec.width, mobileRec.height);
	}
	else if (direction == "DOWNRIGHT"){
		mobileRec.setBounds(mobileRec.x + 32,mobileRec.y +32, mobileRec.width, mobileRec.height);
	}
	else if (direction == "UPLEFT"){
		mobileRec.setBounds(mobileRec.x - 32,mobileRec.y - 32, mobileRec.width, mobileRec.height);
	}
	else if (direction == "UPRIGHT"){
		mobileRec.setBounds(mobileRec.x + 32,mobileRec.y - 32, mobileRec.width, mobileRec.height);
	}

	for(int i=0;i<BonesS.size();i++){
		boneS = (BoneS) BonesS.get(i);
		Rectangle bone1Rec = boneS.getBounds();
		if(mobileRec.intersects(bone1Rec)){
			return true;
		}
	}
	for(int i=0;i<BonesH.size();i++){
		boneH = (BoneH) BonesH.get(i);
		Rectangle bone2Rec = boneH.getBounds();
		if(mobileRec.intersects(bone2Rec)){
			return true;
		}
	}
	for(int i=0;i<BonesV.size();i++){
		boneV = (BoneV) BonesV.get(i);
		Rectangle bone3Rec = boneV.getBounds();
		if(mobileRec.intersects(bone3Rec)){
			return true;
		}
	}
	for(int i=0;i<Monsters1.size();i++){
		monster1 = (Monster_1) Monsters1.get(i);
		Rectangle monster1Rec = monster1.getBounds();
		if(mobileRec.intersects(monster1Rec)){
			return true;
		}
	}
	for(int i=0;i<Monsters2.size();i++){
		monster2 = (Monster_2) Monsters2.get(i);
		Rectangle monster2Rec = monster2.getBounds();
		if(mobileRec.intersects(monster2Rec)){
			return true;
		}
	}
	for(int i=0;i<Monsters3.size();i++){
		monster3 = (Monster_3) Monsters3.get(i);
		Rectangle monster3Rec = monster3.getBounds();
		if(mobileRec.intersects(monster3Rec)){
			return true;
		}
	}
	for(int i=0;i<Monsters4.size();i++){
		monster4 = (Monster_4) Monsters4.get(i);
		Rectangle monster4Rec = monster4.getBounds();
		if(mobileRec.intersects(monster4Rec)){
			return true;
		}
	}
	for(int i=0;i<Door_out1.size();i++){
		outdoor = (Door_out) Door_out1.get(i);
		Rectangle DoorOut = outdoor.getBounds();
		if(mobileRec.intersects(DoorOut)){
			return true;
		}
	}

	
		if (mobile == monster1){
			for (int i=0; i<FireBalls.size(); i++){
				fireball = (Fire_Ball) FireBalls.get(i);
				Rectangle sortilegesRec = fireball.getBounds();
				if (mobileRec.intersects(sortilegesRec)){
					touch = true;
					prison_d1 = true;
					monster1.setX(33);
					monster1.setY(385);
					Monsters1.remove(0);
					return true;
				}
			}
		}

		else if (mobile == monster2){
			for (int i=0; i<FireBalls.size(); i++){
				fireball = (Fire_Ball) FireBalls.get(i);
				Rectangle sortilegesRec = fireball.getBounds();
				if (mobileRec.intersects(sortilegesRec)){
					touch = true;
					prison_d2 = true;
					monster2.setX(97);
					monster2.setY(385);
					Monsters2.remove(0);
					return true;
				}
			}
		}
		else if (mobile == monster3){
			for (int i=0; i<FireBalls.size(); i++){
				fireball = (Fire_Ball) FireBalls.get(i);
				Rectangle sortilegesRec = fireball.getBounds();
				if (mobileRec.intersects(sortilegesRec)){
					touch = true;
					prison_d3 = true;
					monster3.setX(161);
					monster3.setY(385);
					Monsters3.remove(0);
					return true;
				}
			}
		}
		else if (mobile == monster4){
			for (int i=0; i<FireBalls.size(); i++){
				fireball = (Fire_Ball) FireBalls.get(i);
				Rectangle sortilegesRec = fireball.getBounds();
				if (mobileRec.intersects(sortilegesRec)){
					touch = true;
					prison_d4 = true;
					monster4.setX(225);
					monster4.setY(385);
					Monsters4.remove(0);
					return true;
				}
			}
		}
	return false;
}

public void go_to_Lorann(Mobile_Elements mobile){

	int PlusRapide;
	PlusRapide = 1500;

	if (! MonsterCollision("UPLEFT",mobile)){
		if (PlusRapide > Math.abs((lorann.getX()-(mobile.getX()-32)))+Math.abs((lorann.getY()-(mobile.getY()-32)))){
			PlusRapide = Math.abs((lorann.getX()-(mobile.getX()-32)))+Math.abs((lorann.getY()-(mobile.getY()-32)));
			mobile.setWay("UPLEFT");
		}
	}
	if(! MonsterCollision("UPRIGHT",mobile)){
		if (PlusRapide > Math.abs((lorann.getX()-(mobile.getX()+32)))+Math.abs((lorann.getY()-(mobile.getY()-32)))){
			PlusRapide = Math.abs((lorann.getX()-(mobile.getX()+32)))+Math.abs((lorann.getY()-(mobile.getY()-32)));
			mobile.setWay("UPRIGHT");
		}
	}
	if(! MonsterCollision("DOWNLEFT",mobile)){
		if (PlusRapide > Math.abs((lorann.getX()-(mobile.getX()-32)))+Math.abs((lorann.getY()-(mobile.getY()+32)))){
			PlusRapide = Math.abs((lorann.getX()-(mobile.getX()-32)))+Math.abs((lorann.getY()-(mobile.getY()+32)));
			mobile.setWay("DOWNLEFT");
		}
	}
	if(! MonsterCollision("DOWNRIGHT",mobile)){
		if (PlusRapide > Math.abs((lorann.getX()-(mobile.getX()+32)))+Math.abs((lorann.getY()-(mobile.getY()+32)))){
			PlusRapide = Math.abs((lorann.getX()-(mobile.getX()+32)))+Math.abs((lorann.getY()-(mobile.getY()+32)));
			mobile.setWay("DOWNRIGHT");
		}
	}

	if (! MonsterCollision("DOWN",mobile)){
		if (PlusRapide > Math.abs((lorann.getX()-(mobile.getX()+0)))+Math.abs((lorann.getY()-(mobile.getY()+32)))){
			PlusRapide = Math.abs((lorann.getX()-(mobile.getX()+0)))+Math.abs((lorann.getY()-(mobile.getY()+32)));
			mobile.setWay("DOWN");
		}
	}

	if (! MonsterCollision("LEFT",mobile)){
		if (PlusRapide > Math.abs((lorann.getX()-(mobile.getX()-32)))+Math.abs((lorann.getY()-(mobile.getY()+0)))){
			PlusRapide = Math.abs((lorann.getX()-(mobile.getX()-32)))+Math.abs((lorann.getY()-(mobile.getY()+0)));
			mobile.setWay("LEFT");
		}
	}

	if (! MonsterCollision("UP",mobile)){
		if (PlusRapide > Math.abs((lorann.getX()-(mobile.getX()+0)))+Math.abs((lorann.getY()-(mobile.getY()-32)))){
			PlusRapide = Math.abs((lorann.getX()-(mobile.getX()+0)))+Math.abs((lorann.getY()-(mobile.getY()-32)));
			mobile.setWay("UP");
		}
	}

	if (! MonsterCollision("RIGHT",mobile)){
		if (PlusRapide > Math.abs((lorann.getX()-(mobile.getX()+32)))+Math.abs((lorann.getY()-(mobile.getY()+0)))){
			PlusRapide = Math.abs((lorann.getX()-(mobile.getX()+32)))+Math.abs((lorann.getY()-(mobile.getY()+0)));
			mobile.setWay("RIGHT");
		}
	}
	mobile.move();
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
