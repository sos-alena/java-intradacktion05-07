package homework.lesson14.bilding;

import java.util.ArrayList;

public class City {

    public static void main(String[] args) {

        ArrayList<Building> buildings = new ArrayList<>();

        buildings.add(new Factory(2000, 1.5));
        buildings.add(new Flat(80, 2,2));
        buildings.add(new Score(1000, 3, 8000));
        buildings.add(new Score(2000, 3, 80));

        for (Building building : buildings) {
            System.out.println(building);
        }
    }
}
