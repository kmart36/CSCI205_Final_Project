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
 * Class: CheckersModel.RedPiece
 *
 * Description:
 *
 * ****************************************
 */

import javafx.scene.shape.Circle;

public class RedPiece extends Piece {
//    private double xLocation;
//    private double yLocation;
//    private String color;
    private Circle piece;

    public RedPiece() {
        super();
        piece = new Circle();
        color = "RED";
    }

    public RedPiece(Circle piece, double xLoc, double yLoc) {
        super(xLoc, yLoc);
        this.piece = piece;
        color = "RED";
    }


    @Override
    public void move(int x, int y) {
        if (y < yLocation) { // this line can be changed to reflect which side of the board Red is on
            super.move(x, y);
        }
    }
}