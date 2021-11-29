import javafx.scene.shape.Circle;
import org.junit.jupiter.api.Test;
import CheckersModel.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BlackPieceTest {

    @Test
    void move() { //this makes an illegal move need to instantiate to a non-illegal location
        Circle circle = new Circle();
        Piece piece = new BlackPiece(circle,1,1);
        piece.move(2,2);
        assertEquals(2, piece.getXPos());
        assertEquals(2, piece.getYPos());
    }

    @Test
    void illegalMove(){
        Circle circle = new Circle();
        Piece piece = new BlackPiece(circle,2, 2);
        piece.move(1, 1);
        assertEquals(2, piece.getXPos());
        assertEquals(2, piece.getYPos());
    }

    @Test
    void getColor(){
        Piece piece = new BlackPiece();
        assertEquals("BLACK", piece.getColor());
    }
}