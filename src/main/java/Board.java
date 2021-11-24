/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Katy Martinson
 * Section: 9:30am
 * Date: 11/12/2021
 * Time: 10:22 AM
 *
 * Project: csci205_final_project
 * Package: CheckersModel
 * Class: Board
 *
 * Description:
 *
 * ****************************************
 */


import java.util.ArrayList;

public class Board {
    private Piece[][] theBoard = new Piece[8][8];
    private State gameState;

    private enum State {
        NOT_STARTED, PLAYING, FINISHED
    }

    public Board() {
        this.gameState = State.NOT_STARTED;
    }

    public void move(Piece piece, int row, int col) {
        theBoard[(int) piece.getXPos()][(int) piece.getYPos()] = null;
        piece.move(row, col);
        theBoard[row][col] = piece;
    }

    public void reset() {
        this.gameState = State.NOT_STARTED;
    }

    public void changeState(State newState) {
        this.gameState = newState;
    }

    public Piece[][] getTheBoard() {
        return this.theBoard;
    }
}