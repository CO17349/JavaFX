package ClockPane;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClockPane extends Pane {

    private int second;
    private int minute;
    private int hour;

    public ClockPane() {
        this.setCurrentTime();
    }

    public ClockPane(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public void setSecond(int second) {
        this.second = second;

        paintClock();
    }

    public void setMinute(int minute) {
        this.minute = minute;

        paintClock();
    }

    public void setHour(int hour) {
        this.hour = hour;

        paintClock();
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public void setCurrentTime() {
        Calendar calendar = new GregorianCalendar();

        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    private void paintClock() {
        // init clock parameters
        double clockRadius = Math.min(getWidth(), getHeight()) * 0.8 * 0.5;
        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;

        // draw the circle
        Circle circle = new Circle(centerX, centerY, clockRadius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        // draw the numbers for 12, 3, 6, 9
        Text t1 = new Text(centerX-5, centerY-clockRadius+12, "12");
        Text t2 = new Text(centerX-clockRadius+3, centerY+5, "9");
        Text t3 = new Text(centerX+clockRadius-10, centerY+5, "3");
        Text t4 = new Text(centerX-3, centerY+clockRadius-12, "6");

        // draw second hand

        // draw minute hand

        // draw hour hand

        // assemble the above onto the clockpane
    }

    @Override
    protected void setWidth(double v) {
        super.setWidth(v);
        paintClock();
    }

    @Override
    protected void setHeight(double v) {
        super.setHeight(v);
        paintClock();
    }
}