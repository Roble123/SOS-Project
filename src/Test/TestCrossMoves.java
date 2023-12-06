package Test;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;

 
import org.junit.Test;

import Product.Board;
import Product.SimpleGame;
import Product.Board.Cell;

public class TestCrossMoves {
	

		 

		  
		@Test
		public void testCrossTurnMoveVacantCell() {
			Board board = new SimpleGame(7);
			
			assertEquals("", board.getCell(0, 0), Cell.EMPTY);
			assertEquals('t', board.getTurn(), 'S');
		}

 
		@Test
		public void testCrossTurnMoveNonVacantCell() {
			Board board = new SimpleGame(7);
			board.makeMove(0, 0);
			board.makeMove(1, 0);
			assertEquals("", board.getCell(1, 0), Cell.S);
			assertEquals("", board.getTurn(), '0');
			board.makeMove(0, 0);
			assertEquals("", board.getTurn(), 'S');
		}

 
		@Test
		public void testCrossTurnInvalidRowMove() {
			Board board = new SimpleGame(7);
			board.makeMove(1, 0);
			assertEquals('B', board.getTurn(), 'S');
		}
 
		@Test
		public void testCrossTurnInvalidColumnMove() {
			Board board = new SimpleGame(7);
			board.makeMove(0, 5);
			assertEquals("", board.getTurn(), 'S');
		}

	

}

