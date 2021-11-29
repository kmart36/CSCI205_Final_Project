/* ****************************************
 * CSCI205- Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Team01
 * Section: CSCI205-02
 * Date: 11/23/21
 * Time: 6:52 PM
 *
 * Project: csci205_final_project
 * Package: PACKAGE_NAME
 * Class: CheckersModel
 * DESCRIPTION:
 * The model class for the checkers game
 * ****************************************
 */

import java.util.ArrayList;
import CheckersModel.*;


/**
 * Contains lists of the pieces
 */
public class CheckersModel {
    private ArrayList<RedPiece> redPieces;
    private ArrayList<BlackPiece> blackPieces;
    private CheckersController theController;

    public CheckersModel() {
        this.redPieces = new ArrayList<>();
        for(int i = 0; i < 12; i++){
            this.redPieces.add(new RedPiece());
        }
        this.blackPieces = new ArrayList<>();
        for(int i = 0; i < 12; i++){
            this.blackPieces.add(new BlackPiece());
        }
    }

    /**
     * Gets the black piece at param i
     * @param i is the piece that you want
     * @return the piece at given position
     */
    public BlackPiece getBlackPiece(int i) {
        return blackPieces.get(i);
    }

    /**
     * Gets the red piece at param i
     * @param i is the piece that you want
     * @return the piece at given position
     */
    public RedPiece getRedPiece(int i) {
        return redPieces.get(i);
    }
}

