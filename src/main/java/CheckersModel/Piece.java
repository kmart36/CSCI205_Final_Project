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
 * Class: Piece
 *
 * Description:
 *
 * ****************************************
 */
package CheckersModel;

public class Piece {
    private int xLocation;
    private int yLocation;
    private String color;

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

    public String getColor() {return color;}

    public void move(int x, int y) {
        updateLocation(x, y);
    }
}