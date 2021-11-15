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
 * Class: RedPiece
 *
 * Description:
 *
 * ****************************************
 */
package CheckersModel;

public class RedPiece extends Piece{
    private int xLocation;
    private int yLocation;
    private String color;

    public RedPiece() {
        super();
        color = "RED";
    }

    public RedPiece(int xLoc, int yLoc) {
        super();
        color = "RED";
    }

    @Override
    public void move(int x, int y) {
        if (y < yLocation) { // this line can be changed to reflect which side of the board Red is on
            super.move(x, y);
        }
    }
}
