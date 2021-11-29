package CheckersModel;/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Team01
 * Section: 02 - 9:50am
 * Date: 11/15/2021
 * Time: 10:04 AM
 *
 * Project: csci205_final_project
 * Package: CheckersModel
 * Class: CheckersModel.RedPiece
 *
 * Description:
 * Creates red pieces for the board
 * ****************************************
 */

import javafx.scene.shape.Circle;

/**
 * Class to create red pieces - extends parent Piece class
 */
public class RedPiece extends Piece {

    /** Makes a Circle to be the shape of the piece */
    private Circle piece;

    /** Constructor with no parameters - assigns color to red and takes xLoc and yLoc from Piece */
    public RedPiece() {
        super();
        piece = new Circle();
        color = "RED";
    }

    /**
     * Constructor given parameters
     * @param piece the Circle object
     * @param xLoc the x location of the piece
     * @param yLoc the y location of the piece
     */
    public RedPiece(Circle piece, double xLoc, double yLoc) {
        super(xLoc, yLoc);
        this.piece = piece;
        color = "RED";
    }


    @Override
    /**
     * Moves piece to given location
     * @param x the new x location
     * @param y the new y location
     */
    public void move(int x, int y) {
        if (y < yLocation) { // this line can be changed to reflect which side of the board Red is on
            super.move(x, y);
        }
    }
}
