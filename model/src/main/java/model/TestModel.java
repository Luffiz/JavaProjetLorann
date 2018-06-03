package model;
/**
 * |##################################|
 * |unit test of the different class  |
 * |##################################| 
 */
import org.junit.Test;

import junit.framework.TestCase;

public class TestModel extends TestCase {

	@SuppressWarnings("unused")
	private Game_BOOT gameboard ;
	
	public TestModel(){
		super();
	}
	@Test
	public void testGameBoard() {
		String map = "011111111011111111111110\r\n23______82___9__4__5___2\r\n0____11052______2__5___2\r\n2________2______2__5___2\r\n2________2__76__2______S\r\n2_______________01111112\r\n2_11111110______5______2\r\n2________2______2______2\r\n2___555__0111_1105011_12\r\n2________5________5____2\r\n011111111011111111111110";
		int lvl = 1;
		
		new Game_BOOT(map, lvl);
	}
	protected void setUp() throws Exception{
		String map = "011111111011111111111110\r\n23______82___9__4__5___2\r\n0____11052______2__5___2\r\n2________2______2__5___2\r\n2________2__76__2______S\r\n2_______________01111112\r\n2_11111110______5______2\r\n2________2______2______2\r\n2___555__0111_1105011_12\r\n2________5________5____2\r\n011111111011111111111110";
		int lvl = 1;
		super.setUp();
		gameboard = new Game_BOOT(map, lvl);
	}

	public void testMonster_1(){
		new Monster_1(0, 0);
	}

	public void testMonster_2(){
		new Monster_2(0, 0);
	}
	public void testMonster_3(){
		new Monster_3(0, 0);
	}
	public void testMonster_4(){
		new Monster_4(0, 0);
	}
	public void testBoneS(){
		new BoneS(0, 0);
	}
	public void testBoneH(){
		new BoneH(0, 0);
	}
	public void testBoneV(){
		new BoneV(0, 0);
	}
	public void testPurse(){
		new Purse(0, 0);
	}
	public void testCrystalBall(){
		new CrystalBall(0, 0);
	}
	public void testLorann_Mobile(){
		new Lorann_Mobile(0, 0);
	}
	public void testMobile_Elementse(){
		new Mobile_Elements();
	}
	public void testWalls(){
		new Walls();
	}
	public void testUncrossable(){
		new Uncrossable();
	}
	public void testDoor_out(){
		new Door_out(0, 0);
	}
	public void testFire_Ball(){
		new Fire_Ball(0, 0);
	}
	
}
