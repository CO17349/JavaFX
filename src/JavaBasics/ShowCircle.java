package JavaBasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application{

    @Override
    public void start(Stage stage) {

        Pane pane = new Pane();
        Circle circle = new Circle();
        circle.setRadius(50);
        //circle.setCenterX(100);
        //circle.setCenterY(100);

        Color circleColor = new Color(0.66, 0.15, 0.88, 1.0);
        circle.setStroke(Color.BLACK);
        circle.setFill(circleColor);
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        pane.getChildren().add(circle);
        Scene scene = new Scene(pane, 200, 200);
        stage.setTitle("My Circle");
        stage.setScene(scene);
        stage.show();
    }
}