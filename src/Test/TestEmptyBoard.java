package Test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import Product.Board;
import Product.Board.Cell;
import Product.GeneralGame;
import Product.SimpleGame;
 
 
class TestEmptyBoard {
	@Test
	public void testSimpleNewBoard() {
		Board board = new SimpleGame(7);
		for (int row = 0; row <board.size; row++) {
			for (int col = 0; col < board.size; col++) {
				assertEquals(Cell.EMPTY, board.getCell(row, col++)); 
			}
		}
	}

	@Test
	public void testInvalidSimpleRow() {
		Board board = new SimpleGame(7);
		assertEquals(null, board.getCell(0,  8)); 
	}

	@Test
	public void testInvalidsimpleColumn() {
		Board board = new SimpleGame(7);
		assertEquals(null, board.getCell(0, 8)); 
	}
	public void testGenaralNewBoard() {
		Board board = new GeneralGame(8);
		for (int row = 0; row <board.size; row++) {
			for (int col = 0; col < board.size; col++) {
				assertEquals(Cell.EMPTY, board.getCell(row, col++)); 
			}
		}
	}

	@Test
	public void testInvalidGeneralRow() {
		Board board = new GeneralGame(8);
		assertEquals(null, board.getCell(0,  8)); 
	}

	@Test
	public void testInvalidGeneralColumn() {
		Board board = new SimpleGame(8);
		assertEquals(null, board.getCell(0, 8)); 
	}
	}



