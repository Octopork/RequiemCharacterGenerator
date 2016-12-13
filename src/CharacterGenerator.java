/**
 * @author Octopork
 * Date 13/12/2016.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class CharacterGenerator extends Application {


    //this is just to launch the program, just leave as is and do everything in start()
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        /**
         *
         */
        BorderPane rootPane = new BorderPane();


        Scene mainScene = new Scene(rootPane);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Requiem Character Generator");
        primaryStage.show();
    }
}
