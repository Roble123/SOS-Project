package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Product.Board;
import Product.GUI;
import Product.SimpleGame;

public class TestBoardGui {
	private Board board;

	@Before
	public void setUp() throws Exception {
		board = new SimpleGame(7); 
	}

	 
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEmptyBoard() {
		new GUI(board);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
