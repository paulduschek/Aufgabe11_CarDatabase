package Model;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Paul Duschek
 * @version 1.0, 7.1.2021
 */

public class CarDatabase {

    protected HashMap<String, Vehicle> db = new HashMap();

    public CarDatabase()
    {
        MagicGenerator mg = new MagicGenerator();
        for(int i = 0; i <= 1000; i++)
        {
            String ma = mg.getRandomManufacturer();
            String lp = mg.getRandomLicencePlate();
            Vehicle v = new Vehicle(mg.getRandomColor(), mg.getRandomName(), ma, mg.getRandomModel(ma), lp);
            db.put(lp, v);
            System.out.printf("created vehicle with license plate: %s %n",lp);
        }
    }

    public ArrayList<Vehicle> search (String licensePlate, boolean exact)
    {
        if(exact == true)
        {
            ArrayList<Vehicle> al = new ArrayList<>();

            if (db.get(licensePlate.toUpperCase()) != null)
            {
                al.add(db.get(licensePlate));
                return al;
            }
        }
        else{
            ArrayList<Vehicle> al = new ArrayList<>();

            for (Map.Entry entry:db.entrySet()) {
                if (entry.getKey().toString().toUpperCase().contains(licensePlate.toUpperCase()))
                    al.add(db.get(entry.getKey()));
            }
            return al;
        }
        return null;
    }
}
