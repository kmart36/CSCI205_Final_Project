/* ****************************************
 * CSCI205- Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Doug Russo
 * Section: CSCI205-02
 * Date: 11/23/21
 * Time: 6:52 PM
 *
 * Project: csci205_final_project
 * Package: PACKAGE_NAME
 * Class: CheckersModel
 *
 * ****************************************
 */

import javafx.scene.shape.Circle;

import java.util.ArrayList;
import CheckersModel.*;



public class CheckersModel {
    private ArrayList<RedPiece> redPieces;
    private ArrayList<BlackPiece> blackPieces;
    private ArrayList<Space> spaces;

    public CheckersModel() {
        this.redPieces = new ArrayList<>();
        for(int i = 0; i < 12; i++) {
            this.redPieces.add(new RedPiece());
        }
        this.blackPieces = new ArrayList<>();
        for(int i = 0; i < 12; i++){
            this.blackPieces.add(new BlackPiece());
        }
        this.spaces = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                spaces.add(new Space(i, j));
            }
        }
    }

    public ArrayList<RedPiece> getRedPieces() {
        return this.redPieces;
    }

    public ArrayList<BlackPiece> getBlackPieces() { return this.blackPieces; }

    public ArrayList<Space> getSpaces() { return this.spaces; }

    public BlackPiece getBlackPiece(int i) { return blackPieces.get(i); }

    public RedPiece getRedPiece(int i) { return redPieces.get(i); }
}

