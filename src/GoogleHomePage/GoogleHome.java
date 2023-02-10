package GoogleHomePage;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class GoogleHome extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane pane = new BorderPane();

        pane.setTop(getHBox());
        pane.setCenter(getVBox());

        Scene scene = new Scene(pane);
        stage.setTitle("Home");
        stage.setScene(scene);
        stage.show();
    }

    private HBox getHBox() {

        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(25));
        hBox.setStyle("-fx-background-color: white");
        hBox.getChildren().add(new Label("About"));
        hBox.getChildren().add(new Label("Store"));
        Region region1 = new Region();
        HBox.setHgrow(region1, Priority.ALWAYS);
        hBox.getChildren().add(region1);
        hBox.getChildren().add(new Label("Gmail"));
        hBox.getChildren().add(new Label("Images"));
        Image flag = new Image("GoogleHomePage/selector.png");
        ImageView imView = new ImageView(flag);
        // alignment of image
        hBox.getChildren().add(imView);
        return hBox;
    }

    private VBox getVBox() {
        VBox vbox = new VBox(15);
        vbox.setPadding(new Insets(25));
        vbox.setStyle("-fx-background-color: white");
        Image flag = new Image("GoogleHomePage/logo.png");
        ImageView imView = new ImageView(flag);
        vbox.getChildren().add(imView);
        TextField t = new TextField();
        vbox.getChildren().add(t);
        vbox.setAlignment(Pos.CENTER);
//        Label[] courses = {new Label("CSCI 1301"), new Label("CSCI 1302"), new Label("CSCI 2410"), new Label("CSCI 3720")};
//        for(Label course: courses) {
//            vbox.setMargin(course, new Insets(0, 0, 0, 15));
//            vbox.getChildren().add(course);
//        }
        return vbox;
    }

    private HBox getHBox2() {

        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15));
        hBox.setStyle("-fx-background-color: white");
        Button search = new Button("Google Search");
        Button lucky = new Button("I'm feeling lucky");
        return hBox;
    }
}