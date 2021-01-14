/**
 * @author Paul Duschek
 * @version 1.0, 7.1.2021
 */

package Controller;

import Model.CarDatabase;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    //Variable Definitions
    private CarDatabase cdB;
    private Stage stage;

    @FXML
    private TextField searchField;

    @FXML
    private TextArea resultArea;

    //setter
    public void setStage(Stage s) {
        this.stage = s;
    }

    public void defineDB() {
        cdB.initializeDB();
    }

    public static void show(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(Controller.class.getResource("sample.fxml"));
            Parent root = loader.load();

            Controller c = loader.getController();
            c.setStage(stage);
            c.defineDB();

            stage.setTitle("Duschek Aufgabe 11 - CarDatabase");
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch (Exception ex) {
            System.out.println("An error occured.");
        }
    }
}
