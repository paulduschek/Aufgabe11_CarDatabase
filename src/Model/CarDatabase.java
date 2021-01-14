package Model;

import java.util.HashMap;

/**
 * @author Paul Duschek
 * @version 1.0, 7.1.2021
 */

public class CarDatabase {

    private HashMap<String, Vehicle> db = new HashMap();

    public void addVehicle()
    {
        String ma = MagicGenerator.getRandomManufacturer();
        Vehicle v = new Vehicle(MagicGenerator.getRandomColor(), MagicGenerator.getRandomName(), ma, MagicGenerator.getRandomModel(ma), MagicGenerator.getRandomLicencePlate());
        db.put(v.getLicensePlate(), v);
    }

    public void initializeDB(){
        System.out.println("Test1");
        for (int i = 0; i <= 1000; i++) {
            addVehicle();
            System.out.println("Test2");
        }
    }
}
