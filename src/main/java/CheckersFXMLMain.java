import CheckersModel.BlackPiece;
import CheckersModel.Piece;
import CheckersModel.RedPiece;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CheckersFXMLMain extends Application {

    /** Create the players */
    private BlackPiece player1;
    private RedPiece player2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Load in the FXML file and obtain the root node of the scene graph.(Code from lab11)
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/checkersfxml.fxml"));
        Parent root = loader.load();

        // Set up our stage(Code from lab11)
        primaryStage.setTitle("Play Checkers!");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
