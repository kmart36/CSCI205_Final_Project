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
 * Class: CheckersModel.Piece
 *
 * Description:
 *
 * ****************************************
 */

public class Piece {
    protected double xLocation;
    protected double yLocation;
    protected String color;

    public Piece() {
        xLocation = 0;
        yLocation = 0;
    }

    public Piece(double xLoc, double yLoc) {
        xLocation = xLoc;
        yLocation = yLoc;

    }

    private void updateLocation(double x, double y) {
        xLocation = x;
        yLocation = y;
    }

    public double getXPos() {return xLocation;}

    public double getYPos() {return yLocation;}

    public String getColor() {return color;}

    public void move(int x, int y) {
        updateLocation(x, y);
    }
}