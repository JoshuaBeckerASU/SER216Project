package tests;

import static org.junit.Assert.*;
import java.awt.image.BufferedImage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.neet.DiamondHunter.TileMap.Tile;

public class TileCreationTest {
	private static Tile m_Tile;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		m_Tile = new Tile(new BufferedImage(20,20,BufferedImage.TYPE_BYTE_GRAY), Tile.NORMAL);
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
	public void test() {
		Assert.assertNotEquals(m_Tile,null);
		Assert.assertNotEquals(m_Tile.getImage(), null);
		Assert.assertNotEquals(m_Tile.getType(), null);
	}

}
