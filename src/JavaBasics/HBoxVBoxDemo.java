package JavaBasics;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HBoxVBoxDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane pane = new BorderPane();

        pane.setTop(getHBox());

        Scene scene = new Scene(pane);
        stage.setTitle("HBox VBox Demo");
        stage.setScene(scene);
        stage.show();
    }

    private HBox getHBox() {

        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15));
        hBox.setStyle("-fx-background-color: gold");
        hBox.getChildren().add(new Button("Computer Science"));
        hBox.getChildren().add(new Button("Chemistry"));
        Image flag = new Image("JavaBasics/ca.png");
        ImageView imView = new ImageView(flag);
        hBox.getChildren().add(imView);
        return hBox;
    }

    private VBox getVBox() {
        VBox vbox = new VBox(15);
        vbox.setPadding(new Insets(15, 5, 5, 5));
        vbox.setStyle("-fx-background-color: grey");
        vbox.getChildren().add(new Label("Courses"));
        Label[] courses = {new Label("CSCI 1301"), new Label("CSCI 1302"), new Label("CSCI 2410"), new Label("CSCI 3720")};
        for(Label course: courses) {
            vbox.setMargin(course, new Insets(0, 0, 0, 15));
            vbox.getChildren().add(course);
        }
        return vbox;
    }
}