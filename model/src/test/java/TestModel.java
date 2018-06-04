
/**
 * |##################################|
 * |unit test of the different class  |
 * |##################################| 
 */
import java.awt.Image;

import javax.swing.ImageIcon;

import org.junit.Test;

import junit.framework.TestCase;
import model.*;

public class TestModel extends TestCase {

	@SuppressWarnings("unused")
	
	
	public TestModel(){
		super();
	}
	
	protected void setUp() throws Exception
	{
		
	}
	@Test
	public void testGame_BOOT() 
	{
		String map = "011111111011111111111110\r\n23______82___9__4__5___2\r\n0____11052______2__5___2\r\n2________2______2__5___2\r\n2________2__76__2______S\r\n2_______________01111112\r\n2_11111110______5______2\r\n2________2______2______2\r\n2___555__0111_1105011_12\r\n2________5________5____2\r\n011111111011111111111110";
		int lvl = 1;
		Game_BOOT boot = new Game_BOOT(map, lvl);
		assertEquals(map, boot.getMap());
		assertEquals(lvl, boot.getLevel());
	}

	public void testMonster_1()
	{
		int expected = 0;
		Monster_1 monster1 = new Monster_1(expected,expected);
		assertEquals(expected, monster1.getX());
		assertEquals(expected, monster1.getY());
		ImageIcon img = new ImageIcon("../sprite/monster_1.png");
		Image imgM1 = img.getImage();
		assertEquals(imgM1, img.getImage());
	}

	public void testMonster_2()
	{
		int expected = 0;
		Monster_2 monster2 = new Monster_2(expected,expected);
		assertEquals(expected, monster2.getX());
		assertEquals(expected, monster2.getY());
		ImageIcon img = new ImageIcon("../sprite/monster_2.png");
		Image imgM2 = img.getImage();
		assertEquals(imgM2, monster2.getImage());
	}
	public void testMonster_3()
	{
		int expected = 0;
		Monster_3 monster3 = new Monster_3(expected,expected);
		assertEquals(expected, monster3.getX());
		assertEquals(expected, monster3.getY());
		ImageIcon img = new ImageIcon("../sprite/monster_3.png");
		Image imgM3 = img.getImage();
		assertEquals(imgM3, monster3.getImage());
	}
	
	public void testMonster_4(){
		int expected = 0;
		Monster_4 monster4 = new Monster_4(expected,expected);
		assertEquals(expected, monster4.getX());
		assertEquals(expected, monster4.getY());
		ImageIcon img = new ImageIcon("../sprite/monster_4.png");
		Image imgM4 = img.getImage();
		assertEquals(imgM4, monster4.getImage());
	}
	public void testBoneS()
	{
		int expected = 1;
		BoneS boneS = new BoneS(expected,expected);
		assertEquals(expected, boneS.getX());
		assertEquals(expected, boneS.getY());
		ImageIcon img = new ImageIcon("../sprite/bone.png");
		Image imgBS = img.getImage();
		assertEquals(imgBS, boneS.getImage());
	}
	public void testBoneH()
	{
		int expected = 1;
		BoneH boneH = new BoneH(expected,expected);
		assertEquals(expected, boneH.getX());
		assertEquals(expected, boneH.getY());
		ImageIcon img = new ImageIcon("../sprite/horizontal_bone.png");
		Image imgBH = img.getImage();
		assertEquals(imgBH, boneH.getImage());
	}
	public void testBoneV()
	{
		int expected = 1;
		BoneV boneV = new BoneV(expected,expected);
		assertEquals(expected, boneV.getX());
		assertEquals(expected, boneV.getY());
		ImageIcon img = new ImageIcon("../sprite/vertical_bone.png");
		Image imgBV = img.getImage();
		assertEquals(imgBV, boneV.getImage());
	}
	public void testPurse()
	{
		int expected = 1;
		Purse purse = new Purse(expected,expected);
		assertEquals(expected, purse.getX());
		assertEquals(expected, purse.getY());
		ImageIcon img = new ImageIcon("../sprite/purse.png");
		Image imgP = img.getImage();
		assertEquals(imgP, purse.getImage());
	}
	public void testCrystalBall()
	{
		int expected = 1;
		CrystalBall crystalBall = new CrystalBall(expected,expected);
		assertEquals(expected, crystalBall.getX());
		assertEquals(expected, crystalBall.getY());
		ImageIcon img = new ImageIcon("../sprite/crystal_ball.png");
		Image imgCB = img.getImage();
		assertEquals(imgCB, crystalBall.getImage());
	}
	public void testLorann_Mobile()
	{
		int expected = 1;
		Lorann_Mobile lMobile = new Lorann_Mobile(expected, expected);
		assertEquals(expected, lMobile.getX());
		assertEquals(expected, lMobile.getY());
		ImageIcon img = new ImageIcon("../sprite/lorann_b.png");
		Image imgLM = img.getImage();
		assertEquals(imgLM, lMobile.getImage());
	}
	public void testDoor_out()
	{
		int expected = 1;
		Door_out out = new Door_out(expected,expected);
		assertEquals(expected, out.getX());
		assertEquals(expected, out.getY());
		String state = "CLOSED";
		assertEquals(state, out.getState());
		state = "OPEN";
		out.setState(state);
		assertEquals(state, out.getState());
		ImageIcon img = new ImageIcon("../sprite/gate_open.png");
		Image imgD = img.getImage();
		assertEquals(imgD, out.getImage());
		

	}
	public void testFire_Ball()
	{
		int expected = 1;
		Fire_Ball fireball = new Fire_Ball(expected,expected);
		assertEquals(expected, fireball.getX());
		assertEquals(expected, fireball.getY());
	}
	public void testMobile_Elements()
	{
		String expected = "DOWN";
		Mobile_Elements eleM = new Mobile_Elements();
		assertEquals(expected, eleM.getWay());
		int expect = 0;
		assertEquals(expect, eleM.getX());
		assertEquals(expect, eleM.getY());
		expect = 1;
        eleM.setX(expect);
        eleM.setY(expect);
        assertEquals(expect, eleM.getX());
		assertEquals(expect, eleM.getY());
	}
	public void testWalls()
	{
		int expected = 0;
		Walls wall = new Walls();
		assertEquals(expected, wall.getX());
		assertEquals(expected, wall.getY());
	}
	
	public void testUncrossable()
	{
		int expected = 0;
		Uncrossable noCross = new Uncrossable();
		assertEquals(expected, noCross.getX());
		assertEquals(expected, noCross.getY());
	}
	
	
}
