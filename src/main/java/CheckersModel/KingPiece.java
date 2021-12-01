package CheckersModel;
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
 * Class: CheckersModel.KingPiece
 *
 * Description:
 *
 * ****************************************
 */

public class KingPiece extends Piece {

    private Piece piece;

    public KingPiece() {
        super();
    }

    public KingPiece(BlackPiece piece, int xLoc, int yLoc) {
        this.piece = piece;
        xLocation = xLoc;
        yLocation = yLoc;
    }
    public KingPiece(RedPiece piece, int xLoc, int yLoc) {
        this.piece = piece;
        xLocation = xLoc;
        yLocation = yLoc;
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y);
    }
}