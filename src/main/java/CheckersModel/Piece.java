package CheckersModel;
/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Katy Martinson, Kiera Egan, Doug Russo, Phil Morgan
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

    /**
     * Unparameterized constructor for the Piece
     */
    public Piece() {
        xLocation = 0;
        yLocation = 0;
    }

    /**
     * @param xLoc the X location of the Piece
     * @param yLoc the Y location of the Piece
     * Parameterized constructor for the Piece
     */
    public Piece(int xLoc, int yLoc) {
        xLocation = xLoc;
        yLocation = yLoc;
    }

    /**
     * @param x the new X location
     * @param y the new Y location
     * updates the current location of the Piece
     */
    public void updateLocation(int x, int y) {
        xLocation = x;
        yLocation = y;
    }

    public int getXPos() {return xLocation;}

    public int getYPos() {return yLocation;}

    /**
     * @param x the new X location
     * @param y the new Y location
     * Moves the Piece
     */
    public void move(int x, int y) {
        updateLocation(x, y);
    }

}