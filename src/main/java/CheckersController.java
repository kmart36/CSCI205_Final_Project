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
 * Package: PACKAGE_NAME
 * Class: CheckersController
 *
 * Description:
 *
 * ****************************************
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.shape.Rectangle;

public class CheckersController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnStart;

    @FXML
    private FlowPane fPane;

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
    void initialize() {
        assert btnStart != null : "fx:id=\"btnStart\" was not injected: check your FXML file 'checkersfxml.fxml'.";
        assert fPane != null : "fx:id=\"fPane\" was not injected: check your FXML file 'checkersfxml.fxml'.";
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

    }

}
