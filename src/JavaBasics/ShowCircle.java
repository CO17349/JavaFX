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
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.YELLOW);

        pane.getChildren().add(circle);
        Scene scene = new Scene(pane, 200, 200);
        stage.setTitle("My Circle");
        stage.setScene(scene);
        stage.show();
    }
}