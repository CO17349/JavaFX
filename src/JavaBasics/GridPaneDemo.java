package JavaBasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {

    @Override
    public void start(Stage stage) {

        GridPane pane = new GridPane();

        pane.setHgap(5.5);
        pane.setVgap(15.5);

        pane.add(new Label("First Name:"), 0, 0);
        pane.add(new TextField(), 1,  0);
        pane.add(new Label("MI:"), 0, 1);
        pane.add(new TextField(), 1, 1);
        pane.add(new Label("Last Name:"), 0, 2);
        pane.add(new TextField(), 1, 2);
        Button btnAdd = new Button("Add Name");
        pane.add(btnAdd, 1, 3);

        Scene scene = new Scene(pane, 500, 300);
        stage.setTitle("GridPane Demo");
        stage.setScene(scene);

        stage.show();
    }
}