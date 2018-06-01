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
		
		
		new Game_BOOT();
	}
	protected void setUp() throws Exception{
		
		super.setUp();
		gameboard = new Game_BOOT();
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
