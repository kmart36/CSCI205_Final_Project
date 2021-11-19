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
package CheckersModel;

import java.util.ArrayList;

public class Board {
    private Space[][] board;

    public Board() {
        this.board = new Space[8][8];
    }

    public void createSpaces(){
        for( int r = 0; r < 8; r++){
            for (int c = 0; c < 8; c++){
                if ((r%2 == 0 && c%2 == 0) || (r%2 == 1 && c%2 == 1)){
                    board[r][c] = new Space(false, "RED");
                    System.out.println(board[r][c]);
                }
                else {
                    board[r][c] = new Space(false, "BLACK");
                }

            }
        }
    }


}