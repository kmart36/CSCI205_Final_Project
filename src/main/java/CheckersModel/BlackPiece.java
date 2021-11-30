/* *****************************************
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
 * Class: BlackPiece
 *
 * Description:
 *
 * ****************************************
 */

import javafx.scene.shape.Circle;

public class BlackPiece extends Piece{
    private int xLocation;
    private int yLocation;
    private String color;
    private Circle piece;

    public BlackPiece() {
        super();
        this.piece = new Circle();
        color = "BLACK";
    }

    public BlackPiece(Circle piece, double xLoc, double yLoc) {
        super(xLoc, yLoc);
        this.piece = piece;
        color = "BLACK";
    }

    public Circle getPiece() { return this.piece; }

    public void setPiece(Circle newPiece) { this.piece = newPiece; }

    @Override
    public void move(int x, int y) {
        if (y > yLocation) { // this line can be changed to reflect which side of the board Black is on
            super.move(x, y);
        }
    }
}
