
/**
 * |##################################|
 * |unit test of the different class  |
 * |##################################| 
 */
import org.junit.Test;

import junit.framework.TestCase;
import model.*;

public class TestModel extends TestCase {

	@SuppressWarnings("unused")
	
	
	public TestModel(){
		super();
	}
	@Test
	public void testGame_BOOT() {
		String map = "011111111011111111111110\r\n23______82___9__4__5___2\r\n0____11052______2__5___2\r\n2________2______2__5___2\r\n2________2__76__2______S\r\n2_______________01111112\r\n2_11111110______5______2\r\n2________2______2______2\r\n2___555__0111_1105011_12\r\n2________5________5____2\r\n011111111011111111111110";
		int lvl = 1;
		Game_BOOT boot = new Game_BOOT(map, lvl);
		assertEquals(map, boot.getMap());
		assertEquals(lvl, boot.getLevel());
	}
	protected void setUp() throws Exception
	{
		
	}

	public void testMonster_1()
	{
		int expected = 0;
		Monster_1 monster1 = new Monster_1(expected,expected);
		assertEquals(expected, monster1.getX());
		assertEquals(expected, monster1.getY());
	}

	public void testMonster_2()
	{
		int expected = 0;
		Monster_2 monster2 = new Monster_2(expected,expected);
		assertEquals(expected, monster2.getX());
		assertEquals(expected, monster2.getY());
	}
	public void testMonster_3()
	{
		int expected = 0;
		Monster_3 monster3 = new Monster_3(expected,expected);
		assertEquals(expected, monster3.getX());
		assertEquals(expected, monster3.getY());
	}
	
	public void testMonster_4(){
		int expected = 0;
		Monster_4 monster4 = new Monster_4(expected,expected);
		assertEquals(expected, monster4.getX());
		assertEquals(expected, monster4.getY());
	}
	public void testBoneS()
	{
		int expected = 1;
		BoneS boneS = new BoneS(expected,expected);
		assertEquals(expected, boneS.getX());
		assertEquals(expected, boneS.getY());
	}
	public void testBoneH()
	{
		int expected = 1;
		BoneH boneH = new BoneH(expected,expected);
		assertEquals(expected, boneH.getX());
		assertEquals(expected, boneH.getY());
	}
	public void testBoneV()
	{
		int expected = 1;
		BoneV boneV = new BoneV(expected,expected);
		assertEquals(expected, boneV.getX());
		assertEquals(expected, boneV.getY());
	}
	public void testPurse()
	{
		int expected = 1;
		Purse purse = new Purse(expected,expected);
		assertEquals(expected, purse.getX());
		assertEquals(expected, purse.getY());
	}
	public void testCrystalBall()
	{
		int expected = 1;
		CrystalBall crystallBall = new CrystalBall(expected,expected);
		assertEquals(expected, crystallBall.getX());
		assertEquals(expected, crystallBall.getY());
	}
	public void testLorann_Mobile()
	{
		int expected = 1;
		Lorann_Mobile lMobile = new Lorann_Mobile(expected, expected);
		assertEquals(expected, lMobile.getX());
		assertEquals(expected, lMobile.getY());
	}
	public void testDoor_out()
	{
		int expected = 1;
		Door_out out = new Door_out(expected,expected);
		assertEquals(expected, out.getX());
		assertEquals(expected, out.getY());

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
