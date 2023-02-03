package JavaBasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();

        Scene scene = new Scene(pane);
        stage.setTitle("BorderPane Demo");
        stage.setScene(scene);
        stage.show();

    }
}