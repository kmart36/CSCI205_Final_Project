/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Team01
 * Section: 02 - 9:50
 * Date: 11/17/21
 * Time: 10:05 AM
 *
 * Project: csci205_final_project
 * Package: CheckersModel
 * Class: Space
 *
 * Description:
 * Each spot on the board is a space
 * ****************************************
 */
package CheckersModel;

/** Each place (square) on the board is a space */
public class Space {

    /** true if there is a piece on that space*/
    private boolean hasPiece;

    /** a String representing the color of the space */
    private String color;

    /** true if a piece is able to be placed on this space */
    private boolean playable;

    /**
     * Constructor to make spaces
     * @param hasPiece
     * @param color
     */
    public Space(boolean hasPiece, String color) {
        this.hasPiece = hasPiece;
        this.color = color;
    }

    /** Constructor with no parameters - initializes hasPiece to false and color as UNASSIGNED */
    public Space() {
        this.hasPiece = false;
        this.color = "UNASSIGNED";
    }

    /** @return true if the space has a piece on it */
    public boolean getHasPiece() { return this.hasPiece; }

    /** @return the color of the space */
    public String getColor() { return this.color; }

    /** @return String representing the space's color and if it has a piece - used for testing */
    public String toString() {
        String s = "Space has color " + this.color + "and hasPiece is" + this.hasPiece;
        return s;
    }

}
