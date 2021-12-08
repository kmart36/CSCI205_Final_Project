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

    /**
     * Initializes the model, creates the list of red pieces, black pieces, and spaces. Spaces are initialized with their location on the board
     * while the pieces are all initialized with location 0,0.
     */
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
                spaces.add(new Space(j, i));
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

    /**
     * Given a location and a piece, the game will check if the piece can move there
     * @param x the x location of where the piece wants to move
     * @param y the y location of where the piece wants to move
     * @param piece the red piece that wants to move
     * @return If the x,y location given is valid
     */
    public boolean checkLocation(int x, int y, RedPiece piece) {
        // Will not be able to move if the location given is outside the board
        if (x > 7 || y > 7 || x < 0 || y < 0) {
            return false;
        }
        // If the piece can take an enemy piece, it will allow for the larger movements necessary
        if (checkTakeRed()) {
            if (((y == piece.getYPos() + 2) && (x == piece.getXPos() - 2)) || ((y == piece.getYPos() + 2) && (x == piece.getXPos() + 2))) {
                return true;
            }
            else {
                return false;
            }
        }
        // This calculates the index of where the piece wants to move in terms of a 0 - 63 index so the spaces ArrayList can use it
        int index = y * 8 + x;
        // Checks whether the desired movement location is directly diagonal of the piece given
        if (((y == piece.getYPos() + 1) && (x == piece.getXPos() - 1)) || ((y == piece.getYPos() + 1) && (x == piece.getXPos() + 1))) {
            // Checks to see if that location has a piece on it already
            if (spaces.get(index).getHasPiece()) {
                return false;
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }

    /**
     * This logic is very similar to the method for the RedPiece, just compensates for movement in the opposite direction.
     * @param x the x location of where the piece wants to move
     * @param y the y location of where the piece wants to move
     * @param piece the black piece that wants to move
     * @return If the x,y location given is valid
     */
    public boolean checkLocation(int x, int y, BlackPiece piece) {
        if (x > 7 || y > 7 || x < 0 || y < 0) {
            return false;
        }
        if (checkTakeBlack()) {
            if (((y == piece.getYPos() + 2) && (x == piece.getXPos() - 2)) || ((y == piece.getYPos() + 2) && (x == piece.getXPos() + 2))) {
                return true;
            }
            else {
                return false;
            }
        }
        int index = y * 8 + x;
        if (((y == piece.getYPos() - 1) && (x == piece.getXPos() - 1)) || ((y == piece.getYPos() - 1) && (x == piece.getXPos() + 1))) {
            if (spaces.get(index).getHasPiece()) {
                return false;
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }

    /**
     * Checks to see if any red piece on the board can take a piece. This method is used to prevent users from moving a different piece when
     * there is a piece on the board that can take an enemy piece.
     *
     * @return Whether any red piece on the board can take an enemy piece
     */
    public boolean checkTakeRed() {
        // Goes through the entire list of red pieces to check if ANY of them can take an enemy piece
        for (RedPiece piece : redPieces) {
            int x1 = piece.getXPos() + 2;
            int x2 = piece.getXPos() - 2;
            int y = piece.getYPos() + 2;
            // Calculates indices for possible larger movements
            int index1 = y * 8 + x1;
            int index2 = y * 8 + x2;
            // Goes through the entire list of black pieces to check if the selected red piece can take any of them
            for (BlackPiece blackPiece : blackPieces) {
                // Checks if there is a black piece in directly diagonal of a red piece and if the further diagonal move is empty of a piece
                if (blackPiece.getXPos() == piece.getXPos() + 1 && blackPiece.getYPos() == piece.getYPos() + 1) {
                    if (spaces.get(index1).getHasPiece()) {
                        return false;
                    }
                    else {
                        return true;
                    }
                }
                else if (blackPiece.getXPos() == piece.getXPos() - 1 && blackPiece.getYPos() == piece.getYPos() + 1) {
                    if (spaces.get(index2).getHasPiece()) {
                        return false;
                    }
                    else {
                        return true;
                    }
                }
            }
        }
        // If it makes it through the list of red pieces and none of them are able to take an enemy, returns false
        return false;
    }

    /**
     * This logic is very similar to the method for the RedPiece, just compensates for movement in the opposite direction.
     *
     * @return Whether any red piece on the board can take an enemy piece
     */
    public boolean checkTakeBlack() {
        for (BlackPiece piece : blackPieces) {
            int x1 = piece.getXPos() + 2;
            int x2 = piece.getXPos() - 2;
            int y = piece.getYPos() - 2;
            int index1 = y * 8 + x1;
            int index2 = y * 8 + x2;
            for (RedPiece redPiece : redPieces) {
                if (redPiece.getXPos() == piece.getXPos() + 1 && redPiece.getYPos() == piece.getYPos() - 1) {
                    if (spaces.get(index2).getHasPiece()) {
                        return false;
                    }
                    else {
                        return true;
                    }
                } else if (redPiece.getXPos() == piece.getXPos() - 1 && redPiece.getYPos() == piece.getYPos() - 1) {
                    if (spaces.get(index1).getHasPiece()) {
                        return false;
                    }
                    else {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    /**
     *
     * @param x the x location of where the piece wants to move
     * @param y the y location of where the piece wants to move
     * @param piece the red piece that wants to move
     * @return whether the piece given can take a piece by moving to the given location
     */
    public boolean takePiece(int x, int y, RedPiece piece) {
        if (checkTakeRed() && ((x == piece.getXPos() + 2 && y == piece.getYPos() + 2) || (x == piece.getXPos() - 2 && y == piece.getYPos() + 2))) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * This logic is very similar to the method for the RedPiece, just compensates for movement in the opposite direction.
     *
     * @param x the x location of where the piece wants to move
     * @param y the y location of where the piece wants to move
     * @param piece the black piece that wants to move
     * @return whether the piece given can take a piece by moving to the given location
     */
    public boolean takePiece(int x, int y, BlackPiece piece) {
        if (checkTakeBlack() && ((x == piece.getXPos() + 2 && y == piece.getYPos() - 2) || (x == piece.getXPos() - 2 && y == piece.getYPos() - 2))) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Taking in an index from 0-63, it will return the piece that is in the position that corresponds with the index.
     * @param index position in the board (index of spaces)
     * @return the piece that is located on the corresponding piece
     */
    public RedPiece getPieceRed(int index) {
        int x = index % 8;
        int y = index / 8;
        for (RedPiece piece : redPieces) {
            if (x == piece.getXPos() && y == piece.getYPos()) {
                return piece;
            }
        }
        return null;
    }

    /**
     * This logic is very similar to the method for the RedPiece, just compensates for the black pieces list.
     * @param index position in the board (index of spaces)
     * @return the piece that is located on the corresponding piece
     */
    public BlackPiece getPieceBlack(int index) {
        int x = index % 8;
        int y = index / 8;
        for (BlackPiece piece : blackPieces) {
            if (x == piece.getXPos() && y == piece.getYPos()) {
                return piece;
            }
        }
        return null;
    }

    /**
     * Completes the logic that figures out what red piece was taken when a piece made a double-jump.
     * @param x the x position that the taker-piece is moving to
     * @param y the y position that the taker-piece is moving to
     * @param piece the piece that is moving
     * @return 0-63 index of where the taken piece is
     */
    public int pieceTakenRed(int x, int y, BlackPiece piece) {
        int index1 = (y + 1) * 8 + (x - 1);
        int index2 = (y + 1) * 8 + (x + 1);
        if (x == piece.getXPos() + 2 && y == piece.getYPos() - 2) {
            return index1;
        }
        else {
            return index2;
        }
    }

    /**
     * Completes the logic that figures out what black piece was taken when a piece made a double-jump.
     * @param x the x position that the taker-piece is moving to
     * @param y the y position that the taker-piece is moving to
     * @param piece the piece that is moving
     * @return 0-63 index of where the taken piece is
     */
    public int pieceTakenBlack(int x, int y, RedPiece piece) {
        int index1 = (y - 1) * 8 + (x - 1);
        int index2 = (y - 1) * 8 + (x + 1);
        if (x == piece.getXPos() - 2 && y == piece.getYPos() + 2) {
            return index2;
        }
        else {
            return index1;
        }
    }

//    public ArrayList<Space> getPossibleLocations(RedPiece piece) {
//        ArrayList<Space> locations = new ArrayList<>();
//        int index = (piece.getYPos() * 8) + piece.getXPos();
//        if (index % 8 == 0) {
//            if (!spaces.get(index + 9).getHasPiece()) {
//                locations.add(spaces.get(index + 9));
//            }
//            return locations;
//        }
//        else if (index % 8 == 7) {
//            if (!spaces.get(index + 7).getHasPiece()) {
//                locations.add(spaces.get(index + 7));
//            }
//            return locations;
//        }
//        else if (index % 8 != 7 && (index % 8) != 0) {
//            if (!spaces.get(index + 9).getHasPiece()) {
//                locations.add(spaces.get(index + 9));
//            }
//            if (!spaces.get(index + 7).getHasPiece()) {
//                locations.add(spaces.get(index + 7));
//            }
//            return locations;
//        }
//        else {
//            return locations;
//        }
//    }
//
//    public ArrayList<Space> getPossibleLocations(BlackPiece piece) {
//        ArrayList<Space> locations = new ArrayList<>();
//        int index = (piece.getYPos() * 8) + piece.getXPos();
//        if (index % 8 == 0) {
//            if (!spaces.get(index - 7).getHasPiece()) {
//                locations.add(spaces.get(index - 7));
//            }
//            return locations;
//        }
//        else if (index % 8 == 7) {
//            if (!spaces.get(index - 9).getHasPiece()) {
//                locations.add(spaces.get(index - 9));
//            }
//            return locations;
//        }
//        else if (index % 8 != 7 && (index % 8) != 0) {
//            if (!spaces.get(index - 7).getHasPiece()) {
//                locations.add(spaces.get(index - 7));
//            }
//            if (!spaces.get(index - 9).getHasPiece()) {
//                locations.add(spaces.get(index - 9));
//            }
//            return locations;
//        }
//        else {
//            return locations;
//        }
//    }
//
//    public ArrayList<Space> getPossibleLocations(KingPiece piece) {
//        ArrayList<Space> locations = new ArrayList<>();
//        return locations;
//    }
}

