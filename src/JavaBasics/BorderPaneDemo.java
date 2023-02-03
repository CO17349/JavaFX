package JavaBasics;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BorderPaneDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane pane = new BorderPane();

        pane.setTop(new CustomPane("Top"));
        pane.setRight(new CustomPane("Right"));
        pane.setLeft(new CustomPane("Left"));
        pane.setBottom(new CustomPane("Bottom"));
        pane.setCenter(new CustomPane("Center"));

        Scene scene = new Scene(pane);
        stage.setTitle("BorderPane Demo");
        stage.setScene(scene);
        stage.show();

    }
}

class CustomPane extends StackPane {

    public CustomPane(String title) {
        getChildren().add(new Label(title));
        setStyle("-fx-border-color: red");
        setPadding(new Insets(20));
    }
}