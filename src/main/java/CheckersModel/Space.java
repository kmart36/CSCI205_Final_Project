/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Kiera Egan, Doug Russo, Phil Morgan, Katy Martinson
 * Section: 02 - 9:50
 * Date: 11/17/21
 * Time: 10:05 AM
 *
 * Project: csci205_final_project
 * Package: CheckersModel
 * Class: Space
 *
 * Description:
 *
 * ****************************************
 */
package CheckersModel;

import javafx.scene.shape.Rectangle;

/**
 * A class that represents the spaces on the board
 */
public class Space {

    private boolean hasPiece;
    private boolean playable;
    private Rectangle space;
    private int xLocation;
    private int yLocation;

    /**
     * @param hasPiece a boolean that stores if a Space has a Piece on it
     * @param x the X location of the Space
     * @param y the Y location of the Space
     * Parameterized constructor for the Space
     */
    public Space(boolean hasPiece, int x, int y) {
        this.hasPiece = hasPiece;
        this.space = new Rectangle();
        this.xLocation = x;
        this.yLocation = y;
        if ((xLocation + yLocation) % 2 == 0)
            this.playable = true;
        else
            this.playable = false;
    }

    /**
     * @param x the X location of the Space
     * @param y the y location of the Space
     * Parameterized constructor for the Space that only has the location as a parameter
     */
    public Space(int x, int y) {
        this.xLocation = x;
        this.yLocation = y;
        this.space = new Rectangle();
        if ((xLocation + yLocation) % 2 == 0)
            this.playable = true;
        else
            this.playable = false;
    }

    /**
     * Unparameterized constructor for the Space
     */
    public Space() {
        this.hasPiece = false;
        this.space = new Rectangle();
    }

    /**
     * @param hasPiece a boolean representing if the Space has a Piece or not
     * Changes the hasPiece attribute to the provided parameter
     */
    public void setHasPiece(boolean hasPiece) {
        this.hasPiece = hasPiece;
    }

    /**
     * @param space a Rectangle object that represents the Space
     * Changes the Rectangle attribute of the Space to the provided parameter
     */
    public void setSpace(Rectangle space) {
        this.space = space;
    }

    public boolean getHasPiece() { return this.hasPiece; }

    public Rectangle getSpace() { return this.space; }

    public boolean isPlayable() { return this.playable; }

    public int getxLocation() { return this.xLocation; }

    public int getyLocation() { return this.yLocation; }

}
