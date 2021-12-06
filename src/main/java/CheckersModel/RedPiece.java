package CheckersModel;
/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Phil Morgan, Katy Martinson, Kiera Egan, Doug Russo
 * Section: 02 - 9:50am
 * Date: 11/15/2021
 * Time: 10:04 AM
 *
 * Project: csci205_final_project
 * Package: CheckersModel
 * Class: RedPiece
 *
 * Description:
 *
 * ****************************************
 */

import javafx.scene.shape.Circle;

/**
 * A class that represents the Red Pieces and extends from the base Piece class
 */
public class RedPiece extends Piece {
    private Circle piece;

    /**
     * Unparameterized constructor for the RedPiece
     */
    public RedPiece() {
        super();
        piece = new Circle();
    }

    /**
     * @param piece A circle to represent the piece
     * @param xLoc the X location of the Piece
     * @param yLoc the Y location of the Piece
     * Parameterized constructor for RedPiece
     */
    public RedPiece(Circle piece, int xLoc, int yLoc) {
        super(xLoc, yLoc);
        this.piece = piece;
    }

    /**
     * @return the circle attribute of the Piece object
     */
    public Circle getPiece() {
        return this.piece;
    }

    /**
     * @param newPiece the new circle
     * updates the circle attribute of the Piece
     */
    public void setPiece(Circle newPiece) {
        this.piece = newPiece;
    }


    /**
     * @param x the new X location
     * @param y the new Y location
     * Moves the piece to the specified location
     */
    @Override
    public void move(int x, int y) {
        if (y < yLocation) { // this line can be changed to reflect which side of the board Red is on
            super.move(x, y);
        }
    }
}
