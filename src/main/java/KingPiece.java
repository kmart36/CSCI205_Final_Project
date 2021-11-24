/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Katy Martinson
 * Section: 9:30am
 * Date: 11/12/2021
 * Time: 10:12 AM
 *
 * Project: csci205_final_project
 * Package: CheckersModel
 * Class: KingPiece
 *
 * Description:
 *
 * ****************************************
 */

public class KingPiece extends Piece{

    private int xLocation;
    private int yLocation;
    private String color;

    public KingPiece() {
        super();
        color = super.getColor();
    }

    public KingPiece(double xLoc, double yLoc) {
        super();
        color = super.getColor();
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y);
    }
}