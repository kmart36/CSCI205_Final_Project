package CheckersModel;
/* *****************************************
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
 * Class: CheckersModel.BlackPiece
 *
 * Description:
 *
 * ****************************************
 */

import javafx.scene.shape.Circle;
import CheckersModel.*;

/**
 * Class to create black pieces - extends parent Piece class
 */
public class BlackPiece extends Piece {

    /** Makes a Circle to be the shape of the piece */
    private Circle piece;

    /** Constructor with no parameters - assigns color to black and takes xLoc and yLoc from Piece */
    public BlackPiece() {
        super();
        color = "BLACK";
    }

    /**
     * Constructor given parameters
     * @param piece the Circle object
     * @param xLoc the x location of the piece
     * @param yLoc the y location of the piece
     */
    public BlackPiece(Circle piece, double xLoc, double yLoc) {
        super(xLoc, yLoc);
        this.piece = piece;
        color = "BLACK";
    }

    /**
     * Moves piece to given location
     * @param x the new x location
     * @param y the new y location
     */
    @Override
    public void move(int x, int y) {
        if (y > yLocation) { // this line can be changed to reflect which side of the board Black is on
            super.move(x, y);
        }
    }
}
