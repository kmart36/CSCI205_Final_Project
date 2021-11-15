import CheckersModel.Piece;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CheckersFXMLMain extends Application {

    /** Create the players */
    private Piece player1;
    private Piece player2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Load in the FXML file and obtain a root node of the scene graph.(Code from lab11)
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/checkersfxml.fxml"));
        Parent root = loader.load();

        // Set up our stage.(Code from lab11)
        primaryStage.setTitle("Play Checkers!");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
