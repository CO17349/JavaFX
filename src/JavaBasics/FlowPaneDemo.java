package JavaBasics;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FlowPaneDemo extends Application{

    @Override
    public void start(Stage stage) {

        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(20, 10, 20, 10));
        pane.setHgap(50);
        pane.setVgap(5);

        pane.getChildren().addAll(new Label("First Name: "), new TextField(), new Label("MI: "));

        Scene scene = new Scene(pane, 200, 250);
        stage.setTitle("FlowPane Demo");
        stage.setScene(scene);
        stage.show();
    }
}