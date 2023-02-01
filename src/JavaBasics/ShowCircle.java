package JavaBasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ShowCircle extends Application{

    @Override
    public void start(Stage stage) {

        Pane pane = new StackPane();
        Circle circle = new Circle();
        circle.setRadius(50);
        //circle.setCenterX(100);
        //circle.setCenterY(100);

        Color circleColor = new Color(0.66, 0.15, 0.88, 1.0);
        circle.setStroke(Color.BLACK);
        circle.setFill(circleColor);
        //circle.centerXProperty().bind(pane.widthProperty().divide(2));
        //circle.centerYProperty().bind(pane.heightProperty().divide(2));
        // in case of StackPane instead of Pane, it is auto centred, you can use the above 2 lines without any error though

        Label label = new Label("JavaFX");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));

        pane.getChildren().add(circle);
        pane.getChildren().add(label);
        Scene scene = new Scene(pane, 200, 200);
        stage.setTitle("My Circle");
        stage.setScene(scene);
        stage.show();
    }
}