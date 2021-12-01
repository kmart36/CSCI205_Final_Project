import org.junit.jupiter.api.Test;
import CheckersModel.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KingPieceTest {

//    @Test
//    void getColor() {
//        RedPiece red = new RedPiece();
//        BlackPiece black = new BlackPiece();
//
//        KingPiece redKing = new KingPiece(red, red.getXPos(), red.getYPos());
//        KingPiece blackKing = new KingPiece(black, black.getXPos(), black.getYPos());
//
//        assertEquals("RED", redKing.getColor());
//        assertEquals("BLACK", blackKing.getColor());
//    }

    @Test
    void move() {
        KingPiece king = new KingPiece();

        king.move(1,1);
        assertEquals(1, king.getXPos());
        assertEquals(1, king.getYPos());

        king.move(2,0);
        assertEquals(2, king.getXPos());
        assertEquals(0, king.getYPos());

    }
}