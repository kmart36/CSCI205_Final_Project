/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2021
 * Instructor: Prof. Brian King
 *
 * Name: team01
 * Section: 9:30am
 * Date: 11/12/2021
 * Time: 10:11 AM
 *
 * Project: csci205_final_project
 * Package: PACKAGE_NAME
 * Class: CheckersController
 *
 * Description:
 * Controller class to run the game
 * ****************************************
 */

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import CheckersModel.*;



import java.net.URL;
import java.util.ResourceBundle;

public class CheckersController {

    @FXML
    private ResourceBundle resources;

    /** holds the location of _________ */
    @FXML
    private URL location;

    @FXML
    private Circle black1;

    /**
     * Creates the circles that act as the black pieces on the board
     */

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

    /** Creates a button that starts the game */
    @FXML
    private Button btnStart;

    /** Creates a grid to obtain coordinates, create the board, and move pieces */
    @FXML
    private GridPane grid;

    /** Label that determines whose turn it is */
    @FXML
    private Label lblTurn;


    /**
     * Creates rectangles to make the checkerboard
     */
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

    /**
     * Creates circles to act as the red pieces on the board
     */
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

    /** Initializing the elements to the FXML file */
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

        // Initialize all of the red pieces as redPiece's
        RedPiece red1 = new RedPiece(this.red1, this.red1.getCenterX(), this.red1.getCenterY());
        RedPiece red2 = new RedPiece(this.red2, this.red2.getCenterX(), this.red2.getCenterY());
        RedPiece red3 = new RedPiece(this.red3, this.red3.getCenterX(), this.red3.getCenterY());
        RedPiece red4 = new RedPiece(this.red4, this.red4.getCenterX(), this.red4.getCenterY());
        RedPiece red5 = new RedPiece(this.red5, this.red5.getCenterX(), this.red5.getCenterY());
        RedPiece red6 = new RedPiece(this.red6, this.red6.getCenterX(), this.red6.getCenterY());
        RedPiece red7 = new RedPiece(this.red7, this.red7.getCenterX(), this.red7.getCenterY());
        RedPiece red8 = new RedPiece(this.red8, this.red8.getCenterX(), this.red8.getCenterY());
        RedPiece red9 = new RedPiece(this.red9, this.red9.getCenterX(), this.red9.getCenterY());
        RedPiece red10 = new RedPiece(this.red10, this.red10.getCenterX(), this.red10.getCenterY());
        RedPiece red11 = new RedPiece(this.red11, this.red11.getCenterX(), this.red11.getCenterY());
        RedPiece red12 = new RedPiece(this.red12, this.red12.getCenterX(), this.red12.getCenterY());

        // Initialize all of the black pieces as blackPiece's
        BlackPiece black1 = new BlackPiece(this.black1, this.black1.getCenterX(), this.black1.getCenterY());
        BlackPiece black2 = new BlackPiece(this.black2, this.black2.getCenterX(), this.black2.getCenterY());
        BlackPiece black3 = new BlackPiece(this.black3, this.black3.getCenterX(), this.black3.getCenterY());
        BlackPiece black4 = new BlackPiece(this.black4, this.black4.getCenterX(), this.black4.getCenterY());
        BlackPiece black5 = new BlackPiece(this.black5, this.black5.getCenterX(), this.black5.getCenterY());
        BlackPiece black6 = new BlackPiece(this.black6, this.black6.getCenterX(), this.black6.getCenterY());
        BlackPiece black7 = new BlackPiece(this.black7, this.black7.getCenterX(), this.black7.getCenterY());
        BlackPiece black8 = new BlackPiece(this.black8, this.black8.getCenterX(), this.black8.getCenterY());
        BlackPiece black9 = new BlackPiece(this.black9, this.black9.getCenterX(), this.black9.getCenterY());
        BlackPiece black10 = new BlackPiece(this.black10, this.black10.getCenterX(), this.black10.getCenterY());
        BlackPiece black11 = new BlackPiece(this.black11, this.black11.getCenterX(), this.black11.getCenterY());
        BlackPiece black12 = new BlackPiece(this.black12, this.black12.getCenterX(), this.black12.getCenterY());
    }
}
