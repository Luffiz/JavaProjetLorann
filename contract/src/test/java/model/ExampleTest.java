package model;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExampleTest {
    private Map example;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        this.example = new Map(1, "Example test");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetId() {
        final int expected = 1;
        assertEquals(expected, this.example.getId());
    }

    @Test
    public void testGetName() {
        final String expected = "Example test";
        assertEquals(expected, this.example.getMap());
    }

    @Test
    public void testSetName() {
        String expected = "Example test";
        assertEquals(expected, this.example.getMap());
        expected = "Example test modified";
        this.example.setName(expected);
        assertEquals(expected, this.example.getMap());
    }

    @Test
    public void testToString() {
        final String expected = "Example test";
        assertEquals(expected, this.example.toString());
    }

}
