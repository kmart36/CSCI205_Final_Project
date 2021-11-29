import org.junit.jupiter.api.Test;
import CheckersModel.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PieceTest {

    @Test
    void move() {
        Piece piece = new Piece();
        piece.move(4,2); //move() calls the updateLocation method
        assertEquals(4, piece.getXPos());
        assertEquals(2, piece.getYPos());
    }


}