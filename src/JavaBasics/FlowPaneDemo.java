package JavaBasics;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneDemo extends Application{

    @Override
    public void start(Stage stage) {

        FlowPane pane = new FlowPane(Orientation.VERTICAL);
        // the default orientation is horizontal
        pane.setPadding(new Insets(20, 10, 20, 10));
        pane.setHgap(50);
        pane.setVgap(5);

        pane.getChildren().addAll(new Label("First Name: "), new TextField(), new Label("MI: "));
        TextField tfMI = new TextField();
        pane.getChildren().addAll(tfMI, new Label("Last Name: "), new TextField());
        Scene scene = new Scene(pane, 200, 250);
        stage.setTitle("FlowPane Demo");
        stage.setScene(scene);
        stage.show();
    }
}