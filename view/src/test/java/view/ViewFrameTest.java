package view;


import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

import view.ViewFrame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ViewFrameTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testViewFrame() throws InvocationTargetException, InterruptedException {
		ViewFrame frame = new ViewFrame(null, 0);
		assertNotNull("La JFrame ne doit pas être null : ", frame);
		assertTrue("La JFrame doit être visible : ", frame.isVisible());
	}

}
