package ClockPane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DisplayClock extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // create a clock and a label
        ClockPane clock = new ClockPane();
        String timeString = clock.getHour() + ":" + clock.getMinute() + ":"  + clock.getSecond();
        Label lblCurrentTime = new Label(timeString);

        // place the clock and the label in a border pane
        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

        // create a scene, place the clock in it and show
        Scene scene  = new Scene(pane, 250, 250);
        stage.setTitle("Displayclock");
        stage.setScene(scene);
        stage.show();
    }
}