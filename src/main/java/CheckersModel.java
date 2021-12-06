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

    public boolean checkLocation(int x, int y, RedPiece piece) {
        if (x > 7 || y > 7 || x < 0 || y < 0) {
            return false;
        }
//        if (checkTakeRed()) {
//            if (((y == piece.getYPos() + 2) && (x == piece.getXPos() - 2)) || ((y == piece.getYPos() + 2) && (x == piece.getXPos() + 2))) {
//                return true;
//            }
//            else {
//                return false;
//            }
//        }
        int index = y * 8 + x;
        if (((y == piece.getYPos() + 1) && (x == piece.getXPos() - 1)) || ((y == piece.getYPos() + 1) && (x == piece.getXPos() + 1))) {
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

    public boolean checkLocation(int x, int y, BlackPiece piece) {
        if (x > 7 || y > 7 || x < 0 || y < 0) {
            return false;
        }
//        if (checkTakeBlack()) {
//            if (((y == piece.getYPos() + 2) && (x == piece.getXPos() - 2)) || ((y == piece.getYPos() + 2) && (x == piece.getXPos() + 2))) {
//                return true;
//            }
//            else {
//                return false;
//            }
//        }
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

    public boolean checkTakeRed() {
        for (RedPiece piece : redPieces) {
            int x1 = piece.getXPos() + 2;
            int x2 = piece.getXPos() - 2;
            int y = piece.getYPos() + 2;
            int index1 = y * 8 + x1;
            int index2 = y * 8 + x2;
            for (BlackPiece blackPiece : blackPieces) {
                if (blackPiece.getXPos() == piece.getXPos() + 1 && blackPiece.getYPos() == piece.getYPos() + 1) {
                    if (spaces.get(index1).getHasPiece()) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (blackPiece.getXPos() == piece.getXPos() - 1 && blackPiece.getYPos() == piece.getYPos() + 1) {
                    if (spaces.get(index2).getHasPiece()) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

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

    public boolean takePiece(int x, int y, RedPiece piece) {
        if (checkTakeRed() && ((x == piece.getXPos() + 2 && y == piece.getYPos() + 2) || (x == piece.getXPos() - 2 && y == piece.getYPos() + 2))) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean takePiece(int x, int y, BlackPiece piece) {
        if (checkTakeBlack() && ((x == piece.getXPos() + 2 && y == piece.getYPos() - 2) || (x == piece.getXPos() - 2 && y == piece.getYPos() - 2))) {
            return true;
        }
        else {
            return false;
        }
    }
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

    public ArrayList<Space> getPossibleLocations(RedPiece piece) {
        ArrayList<Space> locations = new ArrayList<>();
        int index = (piece.getYPos() * 8) + piece.getXPos();
        if (index % 8 == 0) {
            if (!spaces.get(index + 9).getHasPiece()) {
                locations.add(spaces.get(index + 9));
            }
            return locations;
        }
        else if (index % 8 == 7) {
            if (!spaces.get(index + 7).getHasPiece()) {
                locations.add(spaces.get(index + 7));
            }
            return locations;
        }
        else if (index % 8 != 7 && (index % 8) != 0) {
            if (!spaces.get(index + 9).getHasPiece()) {
                locations.add(spaces.get(index + 9));
            }
            if (!spaces.get(index + 7).getHasPiece()) {
                locations.add(spaces.get(index + 7));
            }
            return locations;
        }
        else {
            return locations;
        }
    }

    public ArrayList<Space> getPossibleLocations(BlackPiece piece) {
        ArrayList<Space> locations = new ArrayList<>();
        int index = (piece.getYPos() * 8) + piece.getXPos();
        if (index % 8 == 0) {
            if (!spaces.get(index - 7).getHasPiece()) {
                locations.add(spaces.get(index - 7));
            }
            return locations;
        }
        else if (index % 8 == 7) {
            if (!spaces.get(index - 9).getHasPiece()) {
                locations.add(spaces.get(index - 9));
            }
            return locations;
        }
        else if (index % 8 != 7 && (index % 8) != 0) {
            if (!spaces.get(index - 7).getHasPiece()) {
                locations.add(spaces.get(index - 7));
            }
            if (!spaces.get(index - 9).getHasPiece()) {
                locations.add(spaces.get(index - 9));
            }
            return locations;
        }
        else {
            return locations;
        }
    }

    public ArrayList<Space> getPossibleLocations(KingPiece piece) {
        ArrayList<Space> locations = new ArrayList<>();
        return locations;
    }
}

