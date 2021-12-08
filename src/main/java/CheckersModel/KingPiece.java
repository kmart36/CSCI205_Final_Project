package CheckersModel;
/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Katy Martinson, Phil Morgan, Kiera Egan, Doug Russo
 * Section: 9:30am
 * Date: 11/12/2021
 * Time: 10:12 AM
 *
 * Project: csci205_final_project
 * Package: CheckersModel
 * Class: CheckersModel.KingPiece
 *
 * Description:
 *
 * ****************************************
 */

/**
 * a class that represents a KingPiece that can move in any direction, extended from the base Piece class
 */
public class KingPiece extends Piece {

    private RedPiece redPiece;
    private BlackPiece blackPiece;

    /**
     * Unparameterized constructor
     */
    public KingPiece() {
        super();
    }

    /**
     * @param piece the BlackPiece being turned into a KingPiece
     * @param xLoc the X Location of the Piece
     * @param yLoc the Y location of the Piece
     * Creates a Black KingPiece
     */
    public KingPiece(BlackPiece piece, int xLoc, int yLoc) {
        blackPiece = piece;
        xLocation = xLoc;
        yLocation = yLoc;
    }

    /**
     * @param piece the RedPiece being turned into a KingPiece
     * @param xLoc the X Location of the Piece
     * @param yLoc the Y location of the Piece
     * Creates a Red KingPiece
     */
    public KingPiece(RedPiece piece, int xLoc, int yLoc) {
        redPiece = piece;
        xLocation = xLoc;
        yLocation = yLoc;
    }

    public RedPiece getRedPiece() { return redPiece; }

    public BlackPiece getBlackPiece() { return blackPiece; }

    /**
     * @param x the new X location
     * @param y the new Y location
     * Moves the piece to the given location
     */
    @Override
    public void move(int x, int y) {
        super.move(x, y);
    }
}