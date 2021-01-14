/**
 * @author Paul Duschek
 * @version 1.0, 7.1.2021
 */

package Controller;

import Model.CarDatabase;
import Model.Vehicle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    //Variable Definitions
    private CarDatabase cdB = new CarDatabase();
    private Stage stage;

    @FXML
    private TextField searchField;

    @FXML
    private TextArea resultArea;

    //setter
    public void setStage(Stage s) {
        this.stage = s;
    }

    public static void show(Stage stage) throws Exception {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Controller.class.getResource("sample.fxml"));
            Parent root = fxmlLoader.load();

            Controller control = fxmlLoader.getController();
            control.setStage(stage);

            stage.setTitle("Aufgabe 11 - Duschek");
            stage.setScene(new Scene(root, 600, 400));
            stage.show();
        }
        catch (IOException ex) {
            System.err.println("Something wrong with sample.fxml!");
            ex.printStackTrace(System.err);
        }
}
    public void control_generalSearch(){
        if(!searchField.getText().equals("")) {
            float begin = System.nanoTime();
            resultArea.clear();
            ArrayList<Vehicle> al = cdB.search(searchField.getText(), false);
            for (Vehicle vehicle : al) {
                resultArea.appendText(vehicle.toString());
                resultArea.appendText("\n\n");
            }
            float end = System.nanoTime();

            System.out.printf("Search took: %g ms %n", ((end - begin) / 1000000));
        }
        else
        {
            System.out.println("Please Enter a valid license plate");
        }
    }

    public void control_exactSearch(){
        float begin = System.nanoTime();
        resultArea.clear();
        try {
            resultArea.setText(cdB.search(searchField.getText(), true).toString());
        }
        catch(Exception ex){
            System.out.println("No License Plate with the particular search");
        }
        float end = System.nanoTime();

        System.out.printf("Search took: %g mykros %n", ((end-begin)/1000000000)); //ich habe hier mykro geschrieben, da der sich das Zeichen per ASCII Code nicht in der Konsole ausgeben lässt
    }
}
