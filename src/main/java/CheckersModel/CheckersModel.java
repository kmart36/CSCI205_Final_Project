/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Katy Martinson
 * Section: 9:30am
 * Date: 11/12/2021
 * Time: 10:11 AM
 *
 * Project: csci205_final_project
 * Package: CheckersModel
 * Class: CheckersModel
 *
 * Description:
 *
 * ****************************************
 */
package CheckersModel;

import java.util.ArrayList;

public class CheckersModel {

    private final int NUM_SQUARES = 64;

    private ArrayList<Piece> redPieces;

    private ArrayList<Piece> blackPieces;

    //private ArrayList<Space> spaces;

    private Board theBoard;

    public CheckersModel() {
        for (int i = 0; i < theBoard.getTheBoard().length; i++) {
            for (int j = 0; j < theBoard.getTheBoard().length; j++) {
                //switch(i) {

                //}

            }
        }
    }

    public ArrayList<Piece> getBlackPieces() {
        return blackPieces;
    }

    public ArrayList<Piece> getRedPieces() {
        return redPieces;
    }
}