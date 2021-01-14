/**
 * @author Paul Duschek
 * @version 1.0, 7.1.2021
 */

package Controller;

import Model.CarDatabase;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
}
