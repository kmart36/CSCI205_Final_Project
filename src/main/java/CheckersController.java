/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: Phil Morgan, Katy Martinson, Kiera Egan, Doug Russo
 * Section: 9:30am
 * Date: 11/12/2021
 * Time: 10:11 AM
 *
 * Project: csci205_final_project
 * Package: java
 * Class: CheckersController
 *
 * Description:
 *
 * ****************************************
 */

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import CheckersModel.*;



import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class CheckersController {

    // Instance of the Checkers Model that will be updated with each move
    private CheckersModel theModel;

    private ArrayList<Circle> redCircles;

    private ArrayList<Circle> blackCircles;

    private ArrayList<Rectangle> squares;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Circle black1;

    @FXML
    private Circle black10;

    @FXML
    private Circle black11;

    @FXML
    private Circle black12;

    @FXML
    private Circle black2;

    @FXML
    private Circle black3;

    @FXML
    private Circle black4;

    @FXML
    private Circle black5;

    @FXML
    private Circle black6;

    @FXML
    private Circle black7;

    @FXML
    private Circle black8;

    @FXML
    private Circle black9;

    @FXML
    private Button btnStart;

    @FXML
    private GridPane grid;

    @FXML
    private Label lblTurn;

    @FXML
    private Rectangle rect1;

    @FXML
    private Rectangle rect10;

    @FXML
    private Rectangle rect11;

    @FXML
    private Rectangle rect12;

    @FXML
    private Rectangle rect13;

    @FXML
    private Rectangle rect14;

    @FXML
    private Rectangle rect15;

    @FXML
    private Rectangle rect16;

    @FXML
    private Rectangle rect17;

    @FXML
    private Rectangle rect18;

    @FXML
    private Rectangle rect19;

    @FXML
    private Rectangle rect2;

    @FXML
    private Rectangle rect20;

    @FXML
    private Rectangle rect21;

    @FXML
    private Rectangle rect22;

    @FXML
    private Rectangle rect23;

    @FXML
    private Rectangle rect24;

    @FXML
    private Rectangle rect25;

    @FXML
    private Rectangle rect26;

    @FXML
    private Rectangle rect27;

    @FXML
    private Rectangle rect28;

    @FXML
    private Rectangle rect29;

    @FXML
    private Rectangle rect3;

    @FXML
    private Rectangle rect30;

    @FXML
    private Rectangle rect31;

    @FXML
    private Rectangle rect32;

    @FXML
    private Rectangle rect33;

    @FXML
    private Rectangle rect34;

    @FXML
    private Rectangle rect35;

    @FXML
    private Rectangle rect36;

    @FXML
    private Rectangle rect37;

    @FXML
    private Rectangle rect38;

    @FXML
    private Rectangle rect39;

    @FXML
    private Rectangle rect4;

    @FXML
    private Rectangle rect40;

    @FXML
    private Rectangle rect41;

    @FXML
    private Rectangle rect42;

    @FXML
    private Rectangle rect43;

    @FXML
    private Rectangle rect44;

    @FXML
    private Rectangle rect45;

    @FXML
    private Rectangle rect46;

    @FXML
    private Rectangle rect47;

    @FXML
    private Rectangle rect48;

    @FXML
    private Rectangle rect49;

    @FXML
    private Rectangle rect5;

    @FXML
    private Rectangle rect50;

    @FXML
    private Rectangle rect51;

    @FXML
    private Rectangle rect52;

    @FXML
    private Rectangle rect53;

    @FXML
    private Rectangle rect54;

    @FXML
    private Rectangle rect55;

    @FXML
    private Rectangle rect56;

    @FXML
    private Rectangle rect57;

    @FXML
    private Rectangle rect58;

    @FXML
    private Rectangle rect59;

    @FXML
    private Rectangle rect6;

    @FXML
    private Rectangle rect60;

    @FXML
    private Rectangle rect61;

    @FXML
    private Rectangle rect62;

    @FXML
    private Rectangle rect63;

    @FXML
    private Rectangle rect64;

    @FXML
    private Rectangle rect7;

    @FXML
    private Rectangle rect8;

    @FXML
    private Rectangle rect9;

    @FXML
    private Circle red1;

    @FXML
    private Circle red10;

    @FXML
    private Circle red11;

    @FXML
    private Circle red12;

    @FXML
    private Circle red2;

    @FXML
    private Circle red3;

    @FXML
    private Circle red4;

    @FXML
    private Circle red5;

    @FXML
    private Circle red6;

    @FXML
    private Circle red7;

    @FXML
    private Circle red8;

    @FXML
    private Circle red9;

    @FXML
    private TextField txtMove;

    private boolean redTurn;

    private boolean gameStarted;

    //private boolean pieceClicked;

    @FXML
    void initialize() {
        assert black1 != null : "fx:id=\"black1\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert black10 != null : "fx:id=\"black10\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert black11 != null : "fx:id=\"black11\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert black12 != null : "fx:id=\"black12\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert black2 != null : "fx:id=\"black2\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert black3 != null : "fx:id=\"black3\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert black4 != null : "fx:id=\"black4\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert black5 != null : "fx:id=\"black5\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert black6 != null : "fx:id=\"black6\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert black7 != null : "fx:id=\"black7\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert black8 != null : "fx:id=\"black8\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert black9 != null : "fx:id=\"black9\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert btnStart != null : "fx:id=\"btnStart\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert grid != null : "fx:id=\"grid\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert lblTurn != null : "fx:id=\"lblTurn\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect1 != null : "fx:id=\"rect1\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect10 != null : "fx:id=\"rect10\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect11 != null : "fx:id=\"rect11\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect12 != null : "fx:id=\"rect12\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect13 != null : "fx:id=\"rect13\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect14 != null : "fx:id=\"rect14\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect15 != null : "fx:id=\"rect15\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect16 != null : "fx:id=\"rect16\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect17 != null : "fx:id=\"rect17\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect18 != null : "fx:id=\"rect18\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect19 != null : "fx:id=\"rect19\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect2 != null : "fx:id=\"rect2\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect20 != null : "fx:id=\"rect20\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect21 != null : "fx:id=\"rect21\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect22 != null : "fx:id=\"rect22\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect23 != null : "fx:id=\"rect23\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect24 != null : "fx:id=\"rect24\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect25 != null : "fx:id=\"rect25\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect26 != null : "fx:id=\"rect26\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect27 != null : "fx:id=\"rect27\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect28 != null : "fx:id=\"rect28\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect29 != null : "fx:id=\"rect29\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect3 != null : "fx:id=\"rect3\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect30 != null : "fx:id=\"rect30\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect31 != null : "fx:id=\"rect31\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect32 != null : "fx:id=\"rect32\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect33 != null : "fx:id=\"rect33\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect34 != null : "fx:id=\"rect34\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect35 != null : "fx:id=\"rect35\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect36 != null : "fx:id=\"rect36\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect37 != null : "fx:id=\"rect37\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect38 != null : "fx:id=\"rect38\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect39 != null : "fx:id=\"rect39\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect4 != null : "fx:id=\"rect4\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect40 != null : "fx:id=\"rect40\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect41 != null : "fx:id=\"rect41\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect42 != null : "fx:id=\"rect42\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect43 != null : "fx:id=\"rect43\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect44 != null : "fx:id=\"rect44\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect45 != null : "fx:id=\"rect45\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect46 != null : "fx:id=\"rect46\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect47 != null : "fx:id=\"rect47\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect48 != null : "fx:id=\"rect48\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect49 != null : "fx:id=\"rect49\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect5 != null : "fx:id=\"rect5\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect50 != null : "fx:id=\"rect50\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect51 != null : "fx:id=\"rect51\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect52 != null : "fx:id=\"rect52\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect53 != null : "fx:id=\"rect53\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect54 != null : "fx:id=\"rect54\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect55 != null : "fx:id=\"rect55\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect56 != null : "fx:id=\"rect56\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect57 != null : "fx:id=\"rect57\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect58 != null : "fx:id=\"rect58\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect59 != null : "fx:id=\"rect59\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect6 != null : "fx:id=\"rect6\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect60 != null : "fx:id=\"rect60\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect61 != null : "fx:id=\"rect61\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect62 != null : "fx:id=\"rect62\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect63 != null : "fx:id=\"rect63\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect64 != null : "fx:id=\"rect64\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect7 != null : "fx:id=\"rect7\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect8 != null : "fx:id=\"rect8\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert rect9 != null : "fx:id=\"rect9\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert red1 != null : "fx:id=\"red1\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert red10 != null : "fx:id=\"red10\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert red11 != null : "fx:id=\"red11\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert red12 != null : "fx:id=\"red12\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert red2 != null : "fx:id=\"red2\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert red3 != null : "fx:id=\"red3\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert red4 != null : "fx:id=\"red4\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert red5 != null : "fx:id=\"red5\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert red6 != null : "fx:id=\"red6\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert red7 != null : "fx:id=\"red7\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert red8 != null : "fx:id=\"red8\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert red9 != null : "fx:id=\"red9\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert txtMove != null : "fx:id=\"txtMove\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        redCircles = new ArrayList<>();
        blackCircles = new ArrayList<>();
        squares = new ArrayList<>();
        List<Circle> tempRed = Arrays.asList(red1, red2, red3, red4, red5, red6, red7, red8, red9, red10, red11, red12);
        redCircles.addAll(tempRed);
        List<Circle> tempBlack = Arrays.asList(black1, black2, black3, black4, black5, black6, black7, black8, black9, black10, black11, black12);
        blackCircles.addAll(tempBlack);
        List<Rectangle> tempSquares = Arrays.asList(rect1, rect2, rect3, rect4, rect5, rect6, rect7, rect8, rect9, rect10, rect11, rect12, rect13, rect14, rect15, rect16, rect17, rect18, rect19, rect20, rect21, rect22, rect23, rect24, rect25, rect26, rect27, rect28, rect29, rect30, rect31, rect32, rect33, rect34, rect35, rect36, rect37, rect38, rect39, rect40, rect41, rect42, rect43, rect44, rect45, rect46, rect47, rect48, rect49, rect50, rect51, rect52, rect53, rect54, rect55, rect56, rect57, rect58, rect59, rect60, rect61, rect62, rect63, rect64);
        squares.addAll(tempSquares);
        redTurn = true;
        gameStarted = false;
        //pieceClicked = false;
    }

    /**
     * Sets theModel so that our needed Lists are associated with the JavaFX shapes
     * Sets the initial spaces that the pieces are on to "having a piece"
     * Assigns each piece with its x,y location on the board
     * @param theModel the instance of the Checkers Model that we will use for the game. Updates with each move
     */
    public void setModel(CheckersModel theModel) {
        this.theModel = theModel;
        // Assigns each red piece with its corresponding red circle
        int i = 0;
        for (RedPiece piece : theModel.getRedPieces()) {
            piece.setPiece(redCircles.get(i));
            i++;
        }
        // Assigns each black piece with its corresponding black circle
        int j = 0;
        for (BlackPiece piece : theModel.getBlackPieces()) {
            piece.setPiece(blackCircles.get(j));
            j++;
        }
        // Assigns each space with its corresponding square
        int m = 0;
        for (Space space : theModel.getSpaces()) {
            space.setSpace(squares.get(m));
            m++;
        }
        // Assigns the first 12 playable spaces for the red side as "having a piece" for the red pieces
        int l = 0;
        for (int g = 0; g < 12; g++) {
            while (theModel.getSpaces().get(l).isPlayable() == false) {
                l++;
            }
            theModel.getSpaces().get(l).setHasPiece(true);
            l++;
        }
        // Assigns the last 12 playable spaces for the red side as "having a piece" for the black pieces
        int e = 63;
        for (int g = 0; g < 12 ; g++) {
            while (theModel.getSpaces().get(e).isPlayable() == false) {
                e--;
            }
            theModel.getSpaces().get(e).setHasPiece(true);
            e--;
        }
        // Assigns each red piece with its x,y location on the board (top left is 0,0)
        int f = 0;
        for (int g = 0; g < 12; g++) {
            while (theModel.getSpaces().get(f).isPlayable() == false) {
                f++;
            }
            theModel.getRedPieces().get(g).updateLocation(theModel.getSpaces().get(f).getxLocation(), theModel.getSpaces().get(f).getyLocation());
            f++;
        }
        // Assigns each black pieces with its x,y location on the board (bottom right is 7,7)
        int y = 63;
        for (int g = 0; g < 12; g++) {
            while (theModel.getSpaces().get(y).isPlayable() == false) {
                y--;
            }
            theModel.getBlackPieces().get(g).updateLocation(theModel.getSpaces().get(y).getxLocation(), theModel.getSpaces().get(y).getyLocation());
            y--;
        }
    }


    /**
     * Initializes the handlers for when pieces are clicked and completes the logic necessary to move the piece.
     */
    public void initHandlers() {
        // Starts the game, circles and squares cannot be clicked without hitting this button first
        this.btnStart.setOnMouseClicked(event -> {
            gameStarted = true;
            lblTurn.setText("Red Player's Turn!");
        });
        // Goes through the list of red pieces and, when one is clicked, starts the event handler
        for (RedPiece piece : theModel.getRedPieces()) {
                piece.getPiece().setOnMouseClicked(mouseEvent -> {
                    if (redTurn && gameStarted) {
                        int x = Integer.valueOf(txtMove.getText(0, 1));
                        int y = Integer.valueOf(txtMove.getText(2, 3));
                        // Checks to see if the piece can take an enemy piece by going to the given location
                        if (theModel.takePiece(x, y, piece)) {
                            // Removes the piece from the grid
                            grid.getChildren().remove(piece.getPiece());
                            // Sets the original space of the piece to not having a piece on it anymore
                            theModel.getSpaces().get(piece.getYPos() * 8 + piece.getXPos()).setHasPiece(false);
                            // Sets the new space of the piece to having a piece
                            theModel.getSpaces().get(y * 8 + x).setHasPiece(true);
                            // Sets the space of the taken piece to not having a piece anymore
                            theModel.getSpaces().get(theModel.getPieceBlack(theModel.pieceTakenBlack(x, y, piece)).getYPos() * 8 + theModel.getPieceBlack(theModel.pieceTakenBlack(x, y, piece)).getXPos()).setHasPiece(false);
                            // Removes the taken piece from the grid
                            grid.getChildren().remove(theModel.getPieceBlack(theModel.pieceTakenBlack(x, y, piece)).getPiece());
                            // Removes the taken piece from the list of enemy pieces
                            theModel.getBlackPieces().remove(theModel.getPieceBlack(theModel.pieceTakenBlack(x, y, piece)));
                            // Updates the location of the piece to the new location
                            piece.updateLocation(x, y);
                            // Adds the piece back to the grid at its new location
                            grid.add(piece.getPiece(), piece.getXPos(), piece.getYPos());
                            lblTurn.setText("Red Player's Turn!");
                            if (theModel.getBlackPieces().isEmpty()) {
                                gameStarted = false;
                                lblTurn.setText("Red Player Wins!");
                            }
                            // If the selected piece can take another piece, it will remain that player's turn.
                            // Otherwise, it goes to the other player's turn
                            if (!theModel.checkTakeRed()) {
                                lblTurn.setText("Black Player's Turn!");
                                redTurn = false;
                            }
                        }
                        // If a piece can be taken but the x,y coordinates to not correspond to the location necessary to take a piece, it will
                        // alert the user that a piece can be taken and will not let the user move another piece
                        else if (theModel.checkTakeRed()) {
                            lblTurn.setText("One of your pieces can take another piece!");
                        }
                        // Logic for the normal movement of a piece
                        else {
                            if (theModel.checkLocation(x, y, piece) == false) {
                                lblTurn.setText("That piece cannot move there!");
                            }
                            else {
                                grid.getChildren().remove(piece.getPiece());
                                theModel.getSpaces().get(piece.getYPos() * 8 + piece.getXPos()).setHasPiece(false);
                                theModel.getSpaces().get(y * 8 + x).setHasPiece(true);
                                piece.updateLocation(x, y);
                                grid.add(piece.getPiece(), piece.getXPos(), piece.getYPos());
                                lblTurn.setText("Black Player's Turn!");
                                redTurn = false;
                            }
                        }
                    }
//                    // Checks to see if its red player's turn, if the game has started, and if a piece has already been clicked
//                    if (redTurn && gameStarted && !pieceClicked) {
//                        // Checks to see if the piece cannot move
//                        if (theModel.getPossibleLocations(piece).isEmpty()) {
//                            lblTurn.setText("Cannot move that piece!");
//                        }
//                        // Sets the piece yellow and the locations it can go yellow.
//                        else {
//                            piece.getPiece().setFill(Color.YELLOW);
//                            for (Space location : theModel.getPossibleLocations(piece)) {
//                                location.getSpace().setFill(Color.YELLOW);
//                                pieceClicked = true;
//                            }
//                        }
//                    }
                });
                // Goes through the available movements for the piece and, when one is clicked, completes the logic
//                    for (Space location : theModel.getPossibleLocations(piece)) {
//                        location.getSpace().setOnMouseClicked(mouseEvent -> {
//                            if (pieceClicked == true) {
//                                // Removes the piece from the grid
//                                // Changes the color of the locations back to their original color
//                                for (Space location2 : theModel.getPossibleLocations(piece)) {
//                                    location2.getSpace().setFill(Paint.valueOf("#ff1100"));
//                                }
//                                lblTurn.setText("blah");
//                                // Sets the original location of the piece to no longer having a piece anymore
//                                theModel.getSpaces().get(piece.getYPos() * 8 + piece.getXPos()).setHasPiece(false);
//                                // Updates the location of the piece to the x,y location of the square that was clicked
//                                piece.updateLocation(location.getxLocation(), location.getyLocation());
//                                // Adds the piece back to the grid at its new location
//                                grid.add(piece.getPiece(), piece.getXPos(), piece.getYPos());
//                                //lblTurn.setText("Black Player's Turn!");
//                                piece.getPiece().setFill(Paint.valueOf("#8d0000"));
//                                // Sets the new location so it has a piece on it
//                                location.setHasPiece(true);
//                                redTurn = false;
//                                pieceClicked = false;
//                           }
//                        });
//                    }
            }

        // Logic is very similar to the red piece movement logic, the methods just need to be different because the black pieces and the red pieces move
        // in opposite directions
        for (BlackPiece piece : theModel.getBlackPieces()) {
            piece.getPiece().setOnMouseClicked(mouseEvent -> {
                if (!redTurn && gameStarted) {
                    int x = Integer.valueOf(txtMove.getText(0, 1));
                    int y = Integer.valueOf(txtMove.getText(2, 3));
                    if (theModel.takePiece(x, y, piece)) {
                        grid.getChildren().remove(piece.getPiece());
                        theModel.getSpaces().get(piece.getYPos() * 8 + piece.getXPos()).setHasPiece(false);
                        theModel.getSpaces().get(y * 8 + x).setHasPiece(true);
                        theModel.getSpaces().get(theModel.getPieceRed(theModel.pieceTakenRed(x, y, piece)).getYPos() * 8 + theModel.getPieceRed(theModel.pieceTakenRed(x, y, piece)).getXPos()).setHasPiece(false);
                        grid.getChildren().remove(theModel.getPieceRed(theModel.pieceTakenRed(x, y, piece)).getPiece());
                        theModel.getRedPieces().remove(theModel.getPieceRed(theModel.pieceTakenRed(x, y, piece)));
                        piece.updateLocation(x, y);
                        grid.add(piece.getPiece(), piece.getXPos(), piece.getYPos());
                        lblTurn.setText("Black Player's Turn!");
                        if (theModel.getRedPieces().isEmpty()) {
                            gameStarted = false;
                            lblTurn.setText("Red Player Wins!");
                        }
                        if (!theModel.checkTakeBlack()) {
                            lblTurn.setText("Red Player's Turn!");
                            redTurn = true;
                        }
                    }
                    else if (theModel.checkTakeBlack()) {
                        lblTurn.setText("One of your pieces can take another piece!");
                    }
                    else {
                        if (theModel.checkLocation(x, y, piece) == false) {
                            lblTurn.setText("That piece cannot move there!");
                        }
                        else {
                            grid.getChildren().remove(piece.getPiece());
                            theModel.getSpaces().get(piece.getYPos() * 8 + piece.getXPos()).setHasPiece(false);
                            theModel.getSpaces().get(y * 8 + x).setHasPiece(true);
                            piece.updateLocation(x, y);
                            grid.add(piece.getPiece(), piece.getXPos(), piece.getYPos());
                            lblTurn.setText("Red Player's Turn!");
                            redTurn = true;
                        }
                    }
                }
//                if (!redTurn && gameStarted && !pieceClicked) {
//                    if (theModel.getPossibleLocations(piece).isEmpty()) {
//                        lblTurn.setText("Cannot move that piece!");
//                    }
//                    else {
//                        piece.getPiece().setFill(Color.YELLOW);
//                        for (Space location : theModel.getPossibleLocations(piece)) {
//                            location.getSpace().setFill(Color.YELLOW);
//                            pieceClicked = true;
//                        }
//                    }
//                }
            });
//            for (Space location : theModel.getPossibleLocations(piece)) {
//                location.getSpace().setOnMouseClicked(mouseEvent -> {
//                    if (pieceClicked == true) {
//                        grid.getChildren().remove(piece.getPiece());
//                        for (Space location2 : theModel.getPossibleLocations(piece)) {
//                            location2.getSpace().setFill(Paint.valueOf("#ff1100"));
//                        }
//                        theModel.getSpaces().get(piece.getYPos() * 8 + piece.getXPos()).setHasPiece(false);
//                        piece.updateLocation(location.getxLocation(), location.getyLocation());
//                        lblTurn.setText(location.getxLocation() + " " + location.getyLocation() + " " + piece.getXPos() + " " + piece.getYPos() + " " + theModel.getSpaces().get(16).getHasPiece());
//                        grid.add(piece.getPiece(), piece.getXPos(), piece.getYPos());
//                        lblTurn.setText("Red Player's Turn!");
//                        piece.getPiece().setFill(Paint.valueOf("#161616"));
//                        location.setHasPiece(true);
//                        redTurn = true;
//                        pieceClicked = false;
//                    }
//                });
//            }
        }
    }
}
