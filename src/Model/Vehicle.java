package Model;

/**
 * @author Paul Duschek
 * @version 1.0, 7.1.2021
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Vehicle {

    //Variable Definitions
    private String color;
    private String owner;
    private String manufacturer;
    private String model;
    private String licensePlate;

    //Constructor
    public Vehicle(String c, String o, String ma, String mo, String lP){
        this.color = c;
        this.owner = o;
        this.manufacturer = ma;
        this.model = mo;
        this.licensePlate = lP;
    }

    //getter and setter
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Color: ");
        sb.append(color);
        sb.append("\n");

        sb.append("Owner: ");
        sb.append(owner);
        sb.append("\n");

        sb.append("Manufacturer: ");
        sb.append(manufacturer);
        sb.append("\n");

        sb.append("Model: ");
        sb.append(model);
        sb.append("\n");

        sb.append("LicensePlate: ");
        sb.append(licensePlate);
        sb.append("\n");

        return sb.toString();
    }
}
