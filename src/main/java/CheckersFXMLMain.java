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
 * The FXML file to create the checkers game
 * ****************************************
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import CheckersModel.*;

import java.io.IOException;

public class CheckersFXMLMain extends Application {

    /** Creates the model */
    private CheckersModel theModel;

    /** Creates the controller */
    private CheckersController theController;

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Starts up the FXML file
     * @param primaryStage
     * @throws IOException
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        // Load in the FXML file and obtain the root node of the scene graph.(Code from lab11)
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/checkersfxml.fxml"));
        Parent root = loader.load();
        this.theModel = new CheckersModel();
        this.theController = loader.getController();
        this.theController.setModel(theModel);
        this.theController.initHandlers();

        BlackPiece player1 = new BlackPiece();
        RedPiece red1 = new RedPiece();

        // Set up our stage(Code from lab11)
        primaryStage.setTitle("Play Checkers!");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
