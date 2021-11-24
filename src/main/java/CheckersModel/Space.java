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

public class Space {

    private boolean hasPiece;
    //private int id;
    private String color;
    private boolean playable;

    public Space(boolean hasPiece, String color) {
        this.hasPiece = hasPiece;
        this.color = color;
    }

    public Space() {
        this.hasPiece = false;
        this.color = "UNASSIGNED";

    }

    public boolean getHasPiece() { return this.hasPiece; }

    public String getColor() { return this.color; }


    public String toString() {
        String s = "Space has color " + this.color + "and hasPiece is" + this.hasPiece;
        return s;
    }

}
