/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Kiera Egan
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

public class Space {

    private boolean hasPiece;
    private boolean playable;
    private Rectangle space;
    private int xLocation;
    private int yLocation;

    public Space(boolean hasPiece, int x, int y) {
        this.hasPiece = hasPiece;
        this.space = new Rectangle();
        this.xLocation = x;
        this.yLocation = y;
        if ((xLocation + yLocation & 2) == 0)
            this.playable = true;
        else
            this.playable = false;
    }

    public Space(int x, int y) {
        this.xLocation = x;
        this.yLocation = y;
        this.space = new Rectangle();
        if ((xLocation + yLocation & 2) == 0)
            this.playable = true;
        else
            this.playable = false;
    }

    public Space() {
        this.hasPiece = false;
        this.space = new Rectangle();
    }

    public void setHasPiece(boolean hasPiece) {
        this.hasPiece = hasPiece;
    }

    public boolean getHasPiece() { return this.hasPiece; }

    public void setSpace(Rectangle space) {
        this.space = space;
    }

    public Rectangle getSpace() {
        return this.space;
    }

    public boolean isPlayable() { return this.playable; }

}
