package CheckersModel;/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Phil Morgan
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

public class BlackPiece extends Piece {
    private Circle piece;

    public BlackPiece() {
        super();
        piece = new Circle();
    }

    public BlackPiece(int xLoc, int yLoc) {
        super(xLoc, yLoc);
        piece = new Circle();
    }

    public BlackPiece(Circle piece, int xLoc, int yLoc) {
        super(xLoc, yLoc);
        this.piece = piece;
    }

    public Circle getPiece() {
        return this.piece;
    }

    public void setPiece(Circle newPiece) {
        this.piece = newPiece;
    }


    @Override
    public void move(int x, int y) {
        if (y > yLocation) { // this line can be changed to reflect which side of the board Red is on
            super.move(x, y);
        }
    }
}
