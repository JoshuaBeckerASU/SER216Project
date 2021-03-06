package tests;

import java.util.*;
import com.neet.DiamondHunter.Entity.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import com.neet.DiamondHunter.TileMap.TileMap;

/**
 * Class that performs unit tests on the Diamond class
 * @author trevorforrey
 * 
 */
public class DiamondTest {

	private Diamond diamond;
	private TileMap tileMap;
	
	/**
	 * Informs the tester that test object is being created
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Setting up Diamond test");
	}

	/**
	 * Informs tester that test object is being torn down
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Tearing down Diamond test");
	}

	/**
	 * Creates a new diamond object and tileMap object for a unit test
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		tileMap = new TileMap(4);
		diamond = new Diamond(tileMap);
	}

	/**
	 * Sets diamond and tileMap objects to null to "clear" objects before performing a new test
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		diamond = null;
		tileMap = null;
	}

	/**
	 * Tests addChangeTest method of Diamond Class
	 * addChanges performing properly, 6 element array
	 */
	@Test
	public void addChangeTest() {
		int[] testChanges = {1,2,4,5,3,6};
		diamond.addChange(testChanges);
		
		List<int[]> expected = new ArrayList<int[]>();
		expected.add(testChanges);
		
		List<int[]> actual = diamond.getChanges();
		
		assertEquals(expected,actual);
	}
	
	/**
	 * Tests addChangeTest method of Diamond Class
	 * addChanges performing properly, 11 element array
	 */
	@Test
	public void addChangeTest2() {
		int[] testChanges = {0,0,1,1,5,2,6,7,8,3,2};
		diamond.addChange(testChanges);
		
		List<int[]> expected = new ArrayList<int[]>();
		expected.add(testChanges);
		
		List<int[]> actual = diamond.getChanges();
		
		assertEquals(expected,actual);
	}

}
