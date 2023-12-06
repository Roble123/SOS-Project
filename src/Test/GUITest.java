package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import Product.Board;
import Product.GUI;
import Product.SimpleGame;

class GUITest {

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

	@Test
	public void test() {
		board.makeMove(0, 0);
		board.makeMove(1, 1);		
		new GUI(board); 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}