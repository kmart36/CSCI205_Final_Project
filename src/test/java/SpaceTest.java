import javafx.scene.shape.Rectangle;
import org.junit.jupiter.api.Test;
import CheckersModel.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A test class for the Space class in the CheckersModel package
 */
class SpaceTest {

    /**
     * Test for the getHasPiece method with both a parameterized and unparameterized constructor
     */
    @Test
    void getHasPiece() {
        Space space = new Space();
        assertFalse(space.getHasPiece());

        Space space2 = new Space(true, 0, 0);
        assertTrue(space2.getHasPiece());
    }

    /**
     * Test for the getColor method with both a parameterized and unparameterized constructor
     */
//    @Test
//    void getColor() {
//        Space space = new Space();
//        assertEquals("UNASSIGNED", space.getColor());
//
//        Space space2 = new Space(true, "RED");
//        assertEquals("RED", space2.getColor());
//    }
}
