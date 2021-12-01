package CheckersModel;/* *****************************************
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
 * Class: Piece
 *
 * Description:
 *
 * ****************************************
 */

public class Piece {
    protected int xLocation;
    protected int yLocation;

    public Piece() {
        xLocation = 0;
        yLocation = 0;
    }

    public Piece(int xLoc, int yLoc) {
        xLocation = xLoc;
        yLocation = yLoc;
    }

    private void updateLocation(int x, int y) {
        xLocation = x;
        yLocation = y;
    }

    public int getXPos() {return xLocation;}

    public int getYPos() {return yLocation;}

    public void move(int x, int y) {
        updateLocation(x, y);
    }

}