import Controller.Controller;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author Paul Duschek
 * @version 1.0, 7.1.2021
 */

public class Main extends Application {

    @Override
    public void start(Stage s) throws Exception{
        Controller.show(s);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
