package CheckersModel;/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Team01
 * Section: 9:30am
 * Date: 11/12/2021
 * Time: 10:12 AM
 *
 * Project: csci205_final_project
 * Package: CheckersModel
 * Class: CheckersModel.Piece
 *
 * Description:
 *
 * ****************************************
 */

/** The parent class to create pieces for the board */
public class Piece {
    /** The x location of the piece */
    protected double xLocation;

    /** The y location of the piece*/
    protected double yLocation;

    /** The color of the piece */
    protected String color;

    /** Empty constructor - if no params initialize x and y location to 0,0 */
    public Piece() {
        xLocation = 0;
        yLocation = 0;
    }

    /**
     * Constructor to create piece with given location
     * @param xLoc the x location of the piece
     * @param yLoc the y location of the piece
     */
    public Piece(double xLoc, double yLoc) {
        xLocation = xLoc;
        yLocation = yLoc;

    }

    /** Updates the location of the piece to a new x and y location
     * @param x the new x location
     * @param y the new y location
     */
    private void updateLocation(double x, double y) {
        xLocation = x;
        yLocation = y;
    }

    /** @return the x Location of the piece */
    public double getXPos() {return xLocation;}

    /** @return the y Location of the piece */
    public double getYPos() {return yLocation;}

    /** @return the color of the piece */
    public String getColor() {return color;}

    /** change the x and y locations of the piece */
    public void move(int x, int y) {
        updateLocation(x, y);
    }
}