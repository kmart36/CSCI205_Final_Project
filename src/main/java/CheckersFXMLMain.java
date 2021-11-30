import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CheckersFXMLMain extends Application {

    private CheckersModel theModel;
    private CheckersController theController;

    public static void main(String[] args) {
        launch(args);
    }

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
